import { getTreeMenu } from "@/api/menu";
const state = {
    isLock: false,
    menu : []
}

const mutations = {
    SET_MENU(state,menu){
        state.menu = menu
    }
}

const actions = {
    init({ state,commit }){
        if(!state.isLock) {
            state.isLock=true
            return new Promise(resolve => {
                getTreeMenu().then((res) => {
                    let data = res.data
                    //设置菜单
                    commit('SET_MENU',data)
                    resolve(data)
                })
            })
        }
    },
    async getMenuByHref({ state,dispatch,commit },href){
        if(state.menu.length == 0){
            await dispatch('init')
        }
        let menu = state.menu.filter(m => {
            return m.href === href
        })
        return menu ? menu[0] : menu
    }
}

export default {
    namespaced: true,
    state,
    actions,
    mutations
}

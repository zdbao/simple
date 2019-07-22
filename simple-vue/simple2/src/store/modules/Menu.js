import { getTreeMenu } from "@/api/common";
const state = {
    menu: [],
    selectMenu:{}
    
}
const mutations = {
    SET_MENU(state,menu){
        state.menu = menu
    },
    
}
const actions = {
    init({ state, commit }){
        return new Promise(resolve => {
            getTreeMenu().then((res) => {
                let data = res.data
                //设置菜单
                commit('SET_MENU',data)
                resolve(data)
            })
        })
    },

    selectMenu({ state, commit },menu_id){
        if(state.selectMenu.id != menu_id){
            let menu = state.menu.filter(m => {
                return m.id == menu_id
            })[0]
            state.selectMenu = menu
            return menu
        }else{
            return state.selectMenu
        }
    }
}
export default {
    namespaced: true,
    state,
    actions,
    mutations
}

import { getTag } from "@/api/tag";
const state = {
    tag : []
}

const mutations = {
    SET_TAG(state,tags){
        state.tag = tags
    },
    REMOVE_TAG(state){
        state.tag = []
    }
}

const actions = {
    getTag({state,commit},menu){
        return new Promise(resolve => {
            getTag(menu.id).then((res) => {
                let data = res.data
                if(data){
                    commit('SET_TAG',data)
                }else{
                    commit('REMOVE_TAG')
                }
                resolve(state.tag)
            })
        })
    }
}

export default {
    namespaced: true,
    state,
    actions,
    mutations
}

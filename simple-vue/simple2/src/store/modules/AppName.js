import { getAppNames } from "@/api/common";
const state = {
    appNames: [],
    select: 'fund-remote',
}
const mutations = {
    SET_APP_NAME(state,appNames){
        state.appNames = appNames
        
    },
    SELECT_APP_NAME(state,id){
        state.select = id
    },
}
const actions = {
    init({ state, commit }){
        return new Promise(resolve => {
            getAppNames().then((res) => {
                let data = res.data
                commit('SET_APP_NAME',data)
                resolve(data)
            })
        })
    },
    
    selectAppName({state,commit},id){
        if(id != state.select){
            commit('SELECT_APP_NAME',id)
            return true
        }
        return false
    }
}
export default {
    namespaced: true,
    state,
    actions,
    mutations
}

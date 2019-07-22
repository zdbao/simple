import { getTimeZone } from "@/api/common";
const state = {
    timeZone: [],
    select: 15,
}
const mutations = {
    SET_TIME_ZONE(state,timeZone){
        state.timeZone = timeZone
    },
    SELECT_TIME_ZOOM(state,time){
        state.select = time
    },
}
const actions = {
    init({ state, commit }){
        return new Promise(resolve => {
            getTimeZone().then((res) => {
                let data = res.data
                commit('SET_TIME_ZONE',data)
                resolve(data)
            })
        })
    },
    
    selectTimeZone({state,commit},time){
        if(time != state.zoomTime){
            commit('SELECT_TIME_ZOOM',time)
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

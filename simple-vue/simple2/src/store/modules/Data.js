const state = {
    queryContent:'',
    zoomTime:1,
    sidebarClose:false
}
const mutations = {
    SET_QUERY_CONTENT(state,content){
        state.queryContent = content
    },
    SET_SIDEBAR_CLOSE(state){
        state.sidebarClose = !state.sidebarClose
    }
}
const actions = {
    setQueryContent({state,commit},content){
        if(state.queryContent != content){
            commit('SET_QUERY_CONTENT',content)
            return true
        }
        return false
    },
    setSidebarClose({commit}){
        commit('SET_SIDEBAR_CLOSE')
    }
}
export default {
    namespaced: true,
    state,
    actions,
    mutations
}

import { getIntefaceData,getSpliceInterfaceList,showServiceFlow,showTraceLogger,setSpliceInterface } from "@/api/data";
const state = {
    topServiceData:[],
    serviceFlowObj:[],
    traceLoggerData:[],
    spliceInterfaceList:[]
}
const mutations = {
    SET_TOP_SERVICE_DATA(state,data){
        state.topServiceData = data
    },
    SET_SERVICE_FLOW(state,data){
        state.serviceFlowObj = data
        state.traceLoggerData = []
    },
    SET_SPLICE_INTERFACE(state,data){
        state.spliceInterfaceList = data
    },
    SET_TRACE_LOGGER(state,data){
        state.traceLoggerData = data
    },
    ADD_SPLICE_INTERFACE(state,service_name){
        let i = state.spliceInterfaceList.filter(d => {
            d == service_name
        })
        if(i.length == 0){
            state.spliceInterfaceList.push(service_name)
        }
    },
    DELETE_SPLICE_INTERFACE(state,service_name){
        let i = state.spliceInterfaceList.filter(d => {
            return d != service_name
        })
        state.spliceInterfaceList = i
    }
    
}
const actions = {

    getIntefaceData({state,commit,rootGetters},params){
        let time = rootGetters.selectTimeZone
        let endTime = (new Date()).getTime()
        let startTime = endTime - (time * 60000)
        console.log(startTime,endTime)
        return new Promise(resolve => {
            getIntefaceData(Object.assign({}, params, {
                startTime: startTime,
                endTime: endTime,
                type: rootGetters.selectMenu.type,
                content: rootGetters.queryContent,
                app_name: rootGetters.selectAppName
              })).then((res) => {
                if(res.code == '0000'){
                    commit('SET_TOP_SERVICE_DATA',res.body)
                }else{
                    commit('SET_TOP_SERVICE_DATA',[])
                    alert(res.desc)
                }
                resolve(res)
            })
        })
    },
    getSpliceInterfaceList({state,commit,rootGetters}){
        return new Promise(resolve => {
            getSpliceInterfaceList({app_name: rootGetters.selectAppName}).then((res) => {
                if(res.code == '0000'){
                    commit('SET_SPLICE_INTERFACE',res.body)
                }
                resolve(res)
            })
        })
    },
    setSpliceInterface({state,commit},params){
        if(params){
            return new Promise(resolve => {
                setSpliceInterface(params).then((res) => {
                    if(res.code == '0000'){
                        commit('ADD_SPLICE_INTERFACE',params.service_name)
                    }else if(res.code == '0001'){
                        commit('DELETE_SPLICE_INTERFACE',params.service_name)
                    }
                    alert(res.desc)
                    resolve(res)
                })
            })
        }
    },
    showServiceFlow({state,commit},params){
        //先验证该接口是否已经被打开过链路。如果打开过才显示流水
        let splice = state.spliceInterfaceList.filter(d => {
            return d == params.service_name
        })
        if(!splice || splice.length == 0){
            alert("请先打开链路")
        }else{
            //显示接口的访问流水
            //这里发送同步方法
            return new Promise(resolve => {
                showServiceFlow(params).then((res) => {
                    commit('SET_SERVICE_FLOW',res)
                    if(res.code != '0000'){
                        alert(res.desc)
                    }
                    resolve(res)
                })
            })
        }
    },
    showTraceLogger({state,commit},params){
        //显示接口的日志链路
        //这里发送同步方法
        return new Promise(resolve => {
            showTraceLogger(params).then((res) => {
                let ar = []
                if(res.code == '0000' && res.body){
                    ar = res.body
                }else{
                    alert(res.desc);
                }
                commit('SET_TRACE_LOGGER',ar)
                resolve(ar)
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

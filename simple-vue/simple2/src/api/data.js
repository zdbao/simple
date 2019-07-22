import {
  Top50ServiceData,
  serviceFlowData,
  traceLogger,
  spliceInterfaceData
} from '@/mock/data';
//获取接口数据(请求耗时top50,请求次数top50)
export const getIntefaceData = (params) => {
  return new Promise((resolve, reject) => {
    $.ajax({
      type: "post",
      url: 'top50/getTop50',
      data:Object.assign({},params),
      success: function (response) {
        resolve(response)
      }
    });
    // resolve(Top50ServiceData)
  })
}

//获取所有打开链路的接口数据
export const getSpliceInterfaceList = (params) => {
  return new Promise((resolve, reject) => {
    $.ajax({
      type: "post",
      url: 'spliceInterface/getList',
      data: Object.assign({},params),
      success: function (response) {
        resolve(response)
      }
    });
    // resolve(spliceInterfaceData)
  })
}

//获取接口流水
export const showServiceFlow = (params) => {
  return new Promise((resolve, reject) => {
    $.ajax({
      type: "post",
      url: 'flow/getServiceFlow',
      data: Object.assign({},params,{time:30}),
      success: function (response) {
        resolve(response)
      }
    });
    // resolve(serviceFlowData)
  })
}

export const showTraceLogger = (params) => {
  return new Promise((resolve, reject) => {
    $.ajax({
      type: "post",
      url: 'traceLogTree/getTraceLogTree',
      data: params,
      success: function (response) {
        resolve(response)
      }
    });
    // resolve(traceLogger)
  })
}

export const setSpliceInterface = (params) => {
  return new Promise((resolve, reject) => {
    $.ajax({
      type: "post",
      url: 'spliceInterface/set',
      data: params,
      success: function (response) {
        resolve(response)
      }
    });
  })
}

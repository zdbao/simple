const getters = {
    treeMenu: state => state.Menu.menu,
    selectMenu: state => state.Menu.selectMenu,
    topServiceData: state => state.Service.topServiceData,
    serviceFlowObj: state => state.Service.serviceFlowObj,
    traceLoggerData: state => state.Service.traceLoggerData,
    spliceInterfaceList: state => state.Service.spliceInterfaceList,
    timeZone: state => state.TimeZone.timeZone,
    selectTimeZone: state => state.TimeZone.select,
    appNames: state => state.AppName.appNames,
    selectAppName: state => state.AppName.select,
    queryContent: state => state.Data.queryContent,
    sidebarClose: state => state.Data.sidebarClose
}
export default getters

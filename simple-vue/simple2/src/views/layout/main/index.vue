<template>
    <div class="page-container">
        <div class="page-sidebar-wrapper">
            <LeftBar></LeftBar>
        </div>
        <div class="page-content-wrapper">
            <div class="page-content" style="min-height: 1434px;">
                <Title></Title>
                <div class="row">
                    <div class="col-lg-4">
                        <DataListTable :key="selectMenu.id" :label="selectMenu.label" :data="topServiceData" :stateData="spliceInterfaceList" @showServiceFlow="showServiceFlow" @setSpliceInterface="setSpliceInterface"></DataListTable>
                    </div>
                    <div class="col-lg-8">
                        <ServiceFlowTable v-if="serviceFlowObj.code == '0000'" :key="selectMenu.id + '_' + selectServiceName" :data="serviceFlowObj.body" @showTraceLogger="showTraceLogger"></ServiceFlowTable>
                        
                        <TreeTable :key="selectTreeId" :tree_id="selectTreeId" v-if="traceLoggerData && traceLoggerData.length > 0" :treeData="traceLoggerData"></TreeTable>
                    </div>
                </div>
            </div>
        </div>
    </div>
</template>

<script>
import { mapGetters } from 'vuex'
import LeftBar from '../sidebar/LeftBar'
import Title from '../Title'
import DataListTable from '@/components/table/DataListTable'
import ServiceFlowTable from '@/components/table/ServiceFlowTable'
import TreeTable from '@/components/tree-table/TreeTable'
export default {
    data(){
        return {
            selectTreeId:''
        }
    },
    components: {
        LeftBar,
        Title,
        DataListTable,
        ServiceFlowTable,
        TreeTable
    },
    computed: {
        ...mapGetters(['topServiceData','serviceFlowObj','traceLoggerData','spliceInterfaceList','selectMenu'])
    },
    methods:{
        setSpliceInterface(args){
            this.$store.dispatch("Service/setSpliceInterface",args).then(data => {})
        },
        showServiceFlow(args){
            this.$store.dispatch("Service/showServiceFlow",args).then(data => {})
        },
        showTraceLogger(args){
            if(this.selectTreeId != args.tree_id){
                this.selectTreeId = args.tree_id
                this.$store.dispatch("Service/showTraceLogger",args).then(data => {})
            }
        }
    }
}
</script>

<style>
.slide-fade-enter-active {
  transition: all .3s ease;
}
.slide-fade-leave-active {
  transition: all .8s cubic-bezier(1.0, 0.5, 0.8, 1.0);
}
.slide-fade-enter, .slide-fade-leave-to
/* .slide-fade-leave-active for below version 2.1.8 */ {
  transform: translateX(10px);
  opacity: 0;
}
</style>

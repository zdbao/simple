<template>
    <div class="portlet light portlet-fit animated fadeIn">
        <!-- <div class="portlet-title">
            <div class="caption">
                <span class="caption-subject font-green bold uppercase">{{label}}</span>
            </div>
        </div> -->
        <div class="portlet-body">
            <div class="mt-element-list">
                <div class="mt-list-head list-default green-haze" style="text-align: right;">
                    
                </div>
                <div class="mt-list-container list-default">
                    <ul>
                        <li class="mt-list-item" v-for="(d,i) in data" :key="'cost_top_' + i">
                            <div :class="'list-icon-container ' + (statusFilter(d.service_name) ? 'done' : '')" style="cursor: pointer;" @click="$emit('setSpliceInterface',{'app_name':d.app_name,'service_name':d.service_name})">
                                <a href="javascript:;">
                                <i :class="statusFilter(d.service_name) ? 'icon-check' : 'icon-close'"></i>
                                </a>
                            </div>
                            <div class="list-datetime">
                                {{d.cost}}ms<br>{{d.doc_count}}条
                            </div>
                            <div class="list-item-content">
                                <span class="bold">
                                    <a style="word-break: break-all;" href="javascript:;" @click="$emit('showServiceFlow',{'app_name':d.app_name,'service_name':d.service_name})">
                                        {{d.service_name | serviceNameFilter}}
                                    </a>
                                </span>
                                <p style="word-break: break-all;">
                                    {{d.service_name | servicePackagePath}}
                                </p>
                            </div>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
</template>

<script>
export default {
    props: {
        data: Array,
        stateData: Array,
        label:''
    },
    filters:{
        serviceNameFilter(value){
            let v = value.split('(')[0].split(".")
            let r = v[v.length-2] + "." + v[v.length-1]
            return r
        },
        servicePackagePath(value){
            let v = value.split('(')[0].split(".")
            let r=''
            for(let i = 0; i < v.length - 2; i++){
                r += ((i != 0 ? '.' : '') + v[i])
            }
            return r
        }
    },
    methods:{
        statusFilter(value){
            let r = this.stateData.filter(d => {
                return d == value
            })
            if(r.length > 0){
                return true
            }else{
                return false
            }
        },
    }
}
</script>

<style>
</style>

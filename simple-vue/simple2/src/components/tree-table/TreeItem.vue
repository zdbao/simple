<template>
    <div>
        <table>
            <tr>
                <td>
                    <div :style="{'margin-left':level*(item.node && item.node.length > 0 ? 15 : 20) + 'px'}">
                        <i
                            v-if="item.node && item.node.length > 0"
                            :class="'fa ' + ((item.show && item.show == true) ? 'fa-caret-down' : 'fa-caret-right')"
                            style="cursor: pointer;"
                            @click="showNodes"
                            aria-hidden="true"
                        ></i>
                        {{item.service_name | serviceNameFilter}}
                    </div>
                </td>
                <td width="10%">{{item.cost}}</td>
                <td width="12%">{{item.host}}</td>
                <td width="12%">{{item.client_ip}}</td>
                <td width="10%">{{item.app_name}}</td>
            </tr>
        </table>
        <div v-if="item.node && item.node.length > 0" :class="(item.show && item.show == true) ? '' : 'hide'">
            <tree-item
                v-if="item.node && item.node.length > 0"
                v-for="(d,i) in item.node"
                :data=d
                :key="pid + '_' + i"
                :pid="pid + '_' + i"
                :level=level+1
            ></tree-item>
        </div>
    </div>

</template>

<script>
export default {
    name: 'treeItem',
    props: {
        data: Object,
        level: Number,
        pid: String
    },
    data() {
        return {
            item: Object.assign({},this.data,{'show':this.data.show ? this.data.show : true})
        }
    },
    watch:{
        data:{
            handler(){
                this.item = Object.assign({},this.item,this.data,{'show':this.data.show ? this.data.show : true})
            }
        }
    },
    filters:{
        serviceNameFilter(value){
            if(!value){
                return ""
            }
            let v = value.split('(')[0].split(".")
            if(v.length > 2){
                return v[v.length-2] + "." + v[v.length-1]
            }else{
                return v[v.length-1]
            }
        }
    },
    methods: {
        showNodes() {
            this.item = Object.assign({},this.item,{"show":!this.item.show})
        }
    }
}
</script>

<style>
</style>

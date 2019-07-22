<template>
    <div class="page-top">
        <div class="row">
            <div class="col-md-2 col-xs-2">
                <div class="search-form search-form-expanded">
                    <div class="input-group">
                        <input type="text" class="form-control" v-model="content" @keyup.enter="queryService" placeholder="Search..." name="query">
                        <span class="input-group-btn">
                            <a href="javascript:;" @click="queryService"  class="btn submit">
                                <i class="icon-magnifier"></i>
                            </a>
                        </span>
                    </div>
                </div>
            </div>
            <div class="col-md-2 col-xs-2">
                <div class="search-form search-form-expanded">
                    <div class="input-group">
                        <select class="form-control" style="cursor: pointer;" v-model="appName">
                            <option v-for="o in appNames" >{{o.value}}</option>
                        </select>
                    </div>
                </div>
                
            </div>
            <div class="col-md-4 col-xs-4 col-xs-push-4 col-md-push-4 date-ul">
                <ul class="nav nav-pills">
                    <!-- <li v-for="i in 3" role="presentation" :class="i == selectTimeZone ? 'active': ''"><a href="javascript:;"  @click="clickTimeZoomHandle(i)">{{i}}d</a></li> -->
                    <li v-for="t in timeZone" role="presentation" :class="t.id == selectTimeZone ? 'active': ''">
                        <a href="javascript:;"  @click="clickTimeZoomHandle(t.id)">{{t.label}}</a>
                    </li>
                </ul>
            </div>
        </div>
    </div>
</template>

<script>
import { mapGetters } from 'vuex'
export default {
    computed: {
        ...mapGetters(['queryContent','timeZone','selectTimeZone','appNames','selectAppName'])
    },
    data(){
        return {
            content:this.queryContent,
            appName: 'fund-remote'
        }
    },
    watch:{
        appName: function (val, oldVal) {
            this.$store.dispatch("AppName/selectAppName",val).then(data => {
                if(data){
                    this.$store.dispatch("Service/getIntefaceData").then(data => {
                        this.$store.dispatch("Service/getSpliceInterfaceList")
                    })
                }
            })
        }
    },
    methods:{
        queryService(){
            this.$store.dispatch("Data/setQueryContent",this.content).then(data => {
                if(data){
                    this.$store.dispatch("Service/getIntefaceData")
                }
            })
        },
        clickTimeZoomHandle(time){
            this.$store.dispatch("TimeZone/selectTimeZone",time).then(data => {
                if(data){
                    this.$store.dispatch("Service/getIntefaceData")
                }
            })
        }
    }
}
</script>

<style>
.page-top .date-ul{
    margin-top: 15px
}
</style>

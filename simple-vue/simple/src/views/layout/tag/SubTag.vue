<template>
    <div class="tags-container" v-if="tags.length>0">
        <el-tabs v-model="activeName" type="card" @tab-click="handleClick">
            <template  v-for="(tag,index) in tags">
                <el-tab-pane :label="tag.label" :name="tag.label"></el-tab-pane>
            </template>
        </el-tabs>
    </div>  
</template>
<script>
export default {
    name: 'subTag',
    props:{
        tags:{
            type: Array
        },
        active:{
            type: String,
            default: ''
        }
    },
    computed:{
        activeName:{
            get:function(){
                return this.active
            },
            set:function(){

            }
        }
        
    },
    methods:{
        handleClick(tab, event){
            let path = this.$route.path
            let src = this.$route.query.src
            let srcs = src.split("/")
            if(srcs.length > 1){
                src = srcs[0]
            }
            let query = {
                src : src + "/" + tab.name
            }
            this.$router.push({
                path: path,
                query: query
            })
        }
    }
}
</script>




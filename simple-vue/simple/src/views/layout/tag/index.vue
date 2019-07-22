<template>
    <div class="tags-container">
        <el-tabs v-model="activeName" type="card" @tab-click="handleClick">
            <template  v-for="(tag,index) in tags">
                <el-tab-pane :label="tag.label" :name="tag.label"></el-tab-pane>
            </template>
        </el-tabs>
        <sub-tag :tags="subTags" :active="getActiveName(1)"></sub-tag>
    </div>
</template>
<script>
import { mapGetters } from 'vuex'
import subTag from './SubTag'
export default {
    name: 'tag',
    components: {subTag},
    data(){
        return {
            level: 0
        }
    },
    computed: {
        ...mapGetters(['tags']),
        activeName: {
            get:function(){
                return this.getActiveName(0)
            },
            set: function(){
                
            }
        },
        subTags: function(){
            let s = this.tags.filter(t => {
                return t.label === this.activeName;
            })
            if(s.length > 0 && s[0].children && s[0].children.length > 0){
                return s[0].children
            }else{
                return []
            }
        }
    },
    methods:{
        handleClick(tab, event){
            let path = this.$route.path;
            let query = {
                src : tab.name
            }
            this.$router.push({
                path: path,
                query: query
            })
        },
        getActiveName(index){
            if(this.$route.query.src){
                let activeNames = this.$route.query.src.split("/");
                if(activeNames.length > 0){
                    return activeNames[index]
                }else{
                    return ''
                }
            }else{
                return ''
            }
        }
    }
}
</script>




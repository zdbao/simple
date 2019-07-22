<template>
    <div class="menu-wrapper">
        <template v-for="(item,index) in menu">
            <el-menu-item v-if="item.children.length===0" :index="filterPath(item.href,item.id)" :key="item.id" @click="open(item)">
                <template slot="title">
                    <span>{{item.label}}</span>
                </template>
            </el-menu-item>
            <el-submenu v-else :index="filterPath(item.href,item.id)" :key="item.id">
                <template slot="title">
                    {{item.label}}
                </template>
                <sidebar-item :menu="item.children"></sidebar-item>
            </el-submenu>
        </template>
    </div>
</template>
<script>
export default {
    name: 'SidebarItem',
    props: {
        menu: {
            type: Array
        }
    },
    methods: {
        filterPath(path, index) {
            return path == null ? index + '' : path
        },
        open(item){
            this.$router.push({
                path: item.href,
                query: item.query
            })
        }
    }
}
</script>


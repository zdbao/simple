<template>
    <div class="layout-container">
        <el-container>
            <el-aside>
                <sidebar></sidebar>
            </el-aside>
            <el-container>
                <el-header height="auto">
                    <Tag></Tag>
                </el-header>
                <el-main>
                    <router-view></router-view>
                </el-main>
            </el-container>
        </el-container>
    </div>
</template>
<script>
import sidebar from './sidebar'
import Tag from './tag'
export default {
    name: 'layout',
    components:{
        sidebar,Tag
    }
}
</script>


<template>
    <!-- <basic-container class="guide-container"> -->
        <el-button icon='el-icon-question' type="primary" @click="guide">运行引导页</el-button>
    <!-- </basic-container> -->
</template>
<script>
export default {
    name: 'guide',
    methods:{
        guide () {
            console.log("---guide--")
        }
    }
}
</script>


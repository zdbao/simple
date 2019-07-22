<template>
    <div class="page-header navbar navbar-fixed-top">
        <div class="page-header-inner ">
            <Logo></Logo>
            <TopBar></TopBar>
        </div>
    </div>
</template>

<script>
import Logo from '../logo'
import TopBar from '../sidebar/TopBar'
export default {
    components:{
        Logo,
        TopBar
    }
}
</script>

<style>
</style>

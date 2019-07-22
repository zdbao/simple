<template>
    <div class="page-logo">
        <a href="index.html">
            <img
                src="@/assets/logo-default.png"
                alt="logo"
                class="logo-default"
            /> </a>
        <div class="menu-toggler sidebar-toggler" @click="setSidebarClose">
            <!-- DOC: Remove the above "hide" to enable the sidebar toggler button on header -->
        </div>
    </div>
</template>

<script>
export default {
    methods:{
        setSidebarClose(){
            this.$store.dispatch("Data/setSidebarClose")
        }
    }
}
</script>

<style>
</style>

<template>
    <div :class="'page-header-fixed page-sidebar-closed-hide-logo page-container-bg-solid' + (sidebarClose ? ' page-sidebar-closed' : '')">
        <Index></Index>
    </div>
</template>

<script>
import Index from '@/views/layout/index'
import { mapGetters } from 'vuex'
export default {
    name: 'App',
    components: {
        Index
    },
    computed: {
        ...mapGetters(['sidebarClose'])
    },
    created() {
        this.$store.dispatch("Menu/init").then(data => {
            this.$store.dispatch("AppName/init").then(data => {
                this.$store.dispatch("TimeZone/init").then(data => {
                    this.$store.dispatch("Menu/selectMenu", 1).then(data => {
                        this.$store.dispatch("Service/getIntefaceData").then(data => {
                            this.$store.dispatch("Service/getSpliceInterfaceList")
                        })
                    })
                })
            })
        })

        

    }
}
</script>

<style>
#app {
    font-family: "Avenir", Helvetica, Arial, sans-serif;
    -webkit-font-smoothing: antialiased;
    -moz-osx-font-smoothing: grayscale;
    text-align: center;
    color: #2c3e50;
    margin-top: 60px;
}
</style>

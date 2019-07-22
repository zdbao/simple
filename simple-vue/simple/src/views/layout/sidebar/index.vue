<template>
    <div class="sidebar-container">
        <el-menu unique-opened :default-active="$route.path">
            <SidebarItem :menu="treeMenu"></SidebarItem>
        </el-menu>
    </div>
</template>

<script>
import { mapGetters } from 'vuex'
import SidebarItem from './sidebarItem'
export default {
    name: 'sidebar',
    components: { SidebarItem },
    created() {
        this.$store.dispatch('Menu/init').then(data => { })
    },
    computed: {
        ...mapGetters(['treeMenu'])
    }
}
</script>


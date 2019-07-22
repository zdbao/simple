<template>
    <div class="page-sidebar navbar-collapse collapse">
        <ul
            :class="'page-sidebar-menu  page-header-fixed page-sidebar-menu-hover-submenu' + (sidebarClose ? ' page-sidebar-menu-closed' : '')"
            data-keep-expanded="false"
            data-auto-scroll="true"
            data-slide-speed="200"
        >
            <li
                :class="'nav-item ' + (selectMenu.id == m.id ? 'active open':'')"
                v-for="(m,i) in treeMenu"
            >
                <a
                    href="javascript:;"
                    @click="selectMenuHandle(m.id)"
                    class="nav-link nav-toggle"
                >
                    <i :class="m.icon"></i>
                    <span class="title">{{m.label}}</span>
                    <span class="arrow"></span>
                </a>
            </li>
        </ul>
    </div>
</template>

<script>
import { mapGetters, mapActions } from 'vuex'
export default {
    computed: {
        ...mapGetters(['treeMenu', 'selectMenu', 'sidebarClose'])
    },
    methods: {
        selectMenuHandle(id) {
            this.$store.dispatch("Menu/selectMenu", id).then(data => {
                this.$store.dispatch("Service/getIntefaceData").then(data => {
                    this.$store.dispatch("Service/getSpliceInterfaceList")
                })
            })
        }
    }
}
</script>

<style>
</style>

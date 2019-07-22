<template>
    <h1 class="page-title"> {{selectMenu.label}}
        <!-- <small>responsive bootstrap table demos</small> -->
    </h1>
</template>

<script>
import { mapGetters } from 'vuex'
export default {
    computed: {
        ...mapGetters(['selectMenu'])
    },
}
</script>

<style>
</style>

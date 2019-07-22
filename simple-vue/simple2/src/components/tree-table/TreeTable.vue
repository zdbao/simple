<template>
    <div class="row animated fadeIn">
        <div class="col-md-12">
            <div class="portlet box green">
                <div class="portlet-title">
                    <div class="caption">
                        <span>链路({{tree_id}})</span>
                    </div>
                </div>
                <div class="portlet-body flip-scroll">
                    <div class="tree-table">
                        <div class="tree-head">
                            <table class="table table-bordered table-striped table-condensed flip-content">
                                <thead class="flip-content">
                                    <tr>
                                        <th>接口名</th>
                                        <th width="10%">cost(ms)</th>
                                        <th width="12%">host</th>
                                        <th width="12%">client_ip</th>
                                        <th width="10%">app_name</th>
                                    </tr>
                                </thead>
                            </table>
                        </div>
                        <div class="tree-body" style="margin-top:-21px;">
                            <table class="table table-bordered table-striped table-condensed flip-content" v-if="treeData.length > 0">
                                <tbody>
                                    <tr>
                                        <td>
                                            <TreeItem
                                                v-for="(d,i) in treeData"
                                                :data=d
                                                :key="'tree_node'+i"
                                                :pid="'tree_node_'+i"
                                                :level=0
                                            ></TreeItem>
                                        </td>
                                    </tr>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

</template>

<script>
import TreeItem from './TreeItem';
export default {
    name: 'treeTabel',
    props: {
        treeData: Array,
        tree_id: String
    },
    components: {
        TreeItem
    }
}
</script>
<style>

</style>

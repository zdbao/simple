<template>
    <div class="row animated fadeIn">
        <div class="col-md-12">
            <div class="portlet box green">
                <div class="portlet-title">
                    <div class="caption">
                        <span>接口流水(只获取当天前10条数据)</span>
                    </div>
                </div>
                <div class="portlet-body flip-scroll">
                    <table class="table table-bordered table-striped table-condensed flip-content">
                        <thead class="flip-content">
                            <tr>
                                <th> tree_id </th>
                                <th> cost(ms) </th>
                                <th> host </th>
                                <th> client_ip </th>
                                <th> request_time </th>
                                <th> response_time </th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr v-for="d in data"  @click="$emit('showTraceLogger',{'tree_id':d.tree_id,'app_name':d.app_name})">
                                <td>{{d.tree_id}}</td>
                                <td>{{d.cost}}</td>
                                <td>{{d.host}}</td>
                                <td>{{d.client_ip}}</td>
                                <td>{{d.request_time}}</td>
                                <td>{{d.response_time}}</td>
                            </tr>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
</template>

<script>
export default {
    props: {
        data: Array
    }
}
</script>

<style>
</style>

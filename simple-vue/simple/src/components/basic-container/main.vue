<template>
    <div class="basic-container">
        <el-card>
            <slot></slot>
        </el-card>
    </div>
</template>

<script>
export default {
    name: "basicContainer"
};
</script>

<style scoped>
.basic-container {
  padding: 20px;
  border-radius: 6px;
}
</style>
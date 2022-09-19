<template>
  <div class="blog-entry" :class="[author ? 'feng' : 'yun']">
    <h1>{{ title }}</h1>
    <p>{{ summary }}</p>
  </div>
</template>

<script setup lang="ts">
defineProps<{
  title: string,
  summary: string,
  author: boolean
}>()
</script>

<style scoped>
.blog-entry {
  margin: 10px;
  height: 200px;
  border: 1px solid var(--el-border-color);
  border-radius: var(--el-border-radius-round);
  box-shadow: var(--el-box-shadow-lighter);
}

.yun {
  color: #A97A5B;
  background: #FDFFF5;
}

.feng {
  color: #FDFFF5;
  background: #A97A5B;
}

</style>

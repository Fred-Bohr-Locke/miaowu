<template>
  <el-container class="app-container">
    <el-header class="header-container">
      <Header />
    </el-header>
    <el-container>
      <el-main>
        <BlogEntry v-for="item in blogList" :title="item.title" :summary="item.summary" :author="item.author" />
      </el-main>
      <el-aside class="aside-container">
        <Carousel />
      </el-aside>
    </el-container>
  </el-container>
</template>

<script setup lang="ts">
import Header from './components/Header.vue'
import Carousel from './components/Carousel.vue'
import BlogEntry from './components/BlogEntry.vue'

import { ref } from 'vue'
import { getList } from '@/api/blog'

const blogList = ref([])

const initBlogList = async () => {
  const response = await getList(1,5)
  blogList.value = response.data.data.records
}
initBlogList()
</script>

<style scoped>
.app-container {
  width: 100%;
  height: 100%;
  margin: 0;
  padding: 0;
}

.header-container{
  padding: 0;
}

.aside-container {
  width: 265px;
  padding: 20px;
}

</style>

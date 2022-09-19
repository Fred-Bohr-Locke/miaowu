<template>
  <el-container class="app-container">
    <el-header class="header-container">
      <Header />
    </el-header>
    <el-container>
      <el-main>
        <h1>test</h1>
      </el-main>
      <el-aside class="aside-container">
        <Carousel />
      </el-aside>
    </el-container>
  </el-container>
</template>

<script setup>
import Header from './components/Header.vue'
import Carousel from './components/Carousel.vue'
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
  width: 270px;
  margin: 20px;
}

</style>

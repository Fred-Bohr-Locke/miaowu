<template>
  <el-container class="app-container">
    <el-header class="header-container">
      <Header />
    </el-header>
    <el-container>
      <el-aside class="aside-container">
        <h1>sidebar</h1>
      </el-aside>
      <el-main>
        <h1>test</h1>
      </el-main>
    </el-container>
  </el-container>
</template>

<script setup>
import Header from './components/Header.vue'
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
  width: 200px;
}

</style>

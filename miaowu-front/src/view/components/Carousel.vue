<template>
  <el-carousel height="400px">
    <el-carousel-item v-for="item in 6" :key="item">
      <img class="carousel-img" :src="'/public/carousel/'+item+'.jpg'">
    </el-carousel-item>
  </el-carousel>
</template>

<script>
</script>

<style scoped>
.carousel-img {
  height: 400px;
  width: 225px;
}
</style>

<style>
.el-carousel__indicator--horizontal .el-carousel__button {
  width: 10px;
  height: 10px;
  background: transparent;
  border: 1px solid #ffffff;
  border-radius: 50%;
  opacity: 0.5;
}
.el-carousel__indicator--horizontal.is-active .el-carousel__button{
  width: 10px;
  height: 10px;
  background: #ffffff;
  border-radius: 50%;
  opacity: 1;
}
</style>

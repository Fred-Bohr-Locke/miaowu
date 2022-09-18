<template>
  <el-menu class="el-menu-demo" mode="horizontal" :ellipsis="false">
    <div class="title-container">
      <span class="title">Miaowu Blog</span>
    </div>

    <div class="flex-grow"/>

    <div class="avatar-container">
      <el-avatar>
        <UserFilled class="icon-avatar"/>
      </el-avatar>
    </div>

    <el-sub-menu index="1">
      <template #title>
        username
      </template>
      <el-menu-item index="1-1">修改密码</el-menu-item>
      <el-menu-item index="1-2">退出登录</el-menu-item>
    </el-sub-menu>
  </el-menu>
</template>

<script>

</script>

<style scoped>
.title-container{
  padding-left: 20px;
}

.title {
  font-size: 24px;
  line-height: 60px;
}

.flex-grow {
  flex-grow: 1;
}

.avatar-container {
  display: inline-flex;
  justify-content: center;
  align-items: center;
  height: var(--el-header-height);
}

.icon-avatar {
  width: 18px;
  height: 18px;
}

</style>

<style>
/*修改全局的弹出框最小宽度*/
.el-menu--popup {
  min-width: 100px;
}
</style>

<template>
  <SideBar/>
  <Body/>
</template>

<script>
import Body from './components/BodyComponent.vue';
import SideBar from "@/components/SideBar";
export default {
  name: 'App',
  components: {
    Body,
    SideBar
  }
}
</script>

<style lang="scss">
@import "assets/main";
</style>

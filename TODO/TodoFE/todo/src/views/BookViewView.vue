<template>
  <div>
    <book-header></book-header>
    <book-view></book-view>
    <book-footer></book-footer>
  </div>
</template>

<script>
import BookHeader from "../components/BookHeader.vue";
import BookFooter from "../components/BookFooter.vue";
import BookView from "../components/BookView.vue";
export default {
  name: "BookViewView",
  components: {  BookView, BookHeader, BookFooter },

};
</script>

<style>
</style>
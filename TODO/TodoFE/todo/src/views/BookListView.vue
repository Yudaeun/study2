<template>
  <div>
    <book-header></book-header>
    <book-list></book-list>
    <book-footer></book-footer>
  </div>
</template>

<script>
import BookHeader from "../components/BookHeader.vue";
import BookFooter from "../components/BookFooter.vue";
import BookList from "../components/BookList.vue";
export default {
  name: "BookListView",
  components: { BookList, BookHeader, BookFooter },
};
</script>

<style>
</style>
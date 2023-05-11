<template>
  <div>
    <book-header></book-header>
    <book-create></book-create>
    <book-footer></book-footer>
  </div>
</template>

<script>
import BookHeader from "../components/BookHeader.vue";
import BookFooter from "../components/BookFooter.vue";
import BookCreate from "../components//BookCreate.vue";
export default {
  name: "BookCreateView",
  components: { BookHeader, BookFooter, BookCreate },
};
</script>

<style>
</style>
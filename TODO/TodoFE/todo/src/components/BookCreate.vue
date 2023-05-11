<template>
  <div class="regist">
        <h1 class="underline">TODO 등록</h1>
        <div class="regist_form">

          <label for="content">content</label>
          <input type="text" id="content" name="content" v-model="content" ref="content" /><br />

          <label for="userid">userid</label>
          <input type="text" id="userid" name="userid" v-model="userid" ref="userid" /><br />


          <button @click="registTodo">등록</button>
          <button @click="moveList">목록</button>
        </div>
      </div>
</template>

<script>
import axios from "@/axios/axios-common.js";

export default {
  name: 'BookCreate',
  data() {
    return {
      content: "",
      userid: "",
    };
  },
  methods: {
    registTodo() {
      let newTodo = {
        content: this.content,
        userid: this.userid,
      };
      axios
        .post("/todo", newTodo)
        .then(() => {
          alert("등록이 완료되었습니다.");
          this.$router.push({ path: `/todo` });
        })
        .then((error) => {
          console.log(error);
        })
      
      // 목록 페이지로 이동하기
      
    },

    moveList() {
      this.$router.push({ path: `/todo` });
    },
  },
}
</script>

<style>

</style>
<template>
  <div>
    <h1 class="underline">TODO</h1>
    <div style="text-align: right">
    <div class="search" style="text-align: center; left: 350px;">
  <input type="text" placeholder="검색어 입력" id="sno" v-model="sno" name="sno" @keyup.enter="searchTodo()">
  <img src="https://s3.ap-northeast-2.amazonaws.com/cdn.wecode.co.kr/icon/search.png" @click="searchTodo()">
</div>
      <button @click="movePage">TODO 등록</button>
    </div>
    
    <div v-if="todolist.length">
      <table id="book-list">
        <colgroup>
          <col style="width: 5%" />
          <col style="width: 20%" />
          <col style="width: 40%" />
          <col style="width: 20%" />
          <col style="width: 15%" />
        </colgroup>
        <thead>
          <tr>
            <th>no</th>
            <th>todoNum</th>
            <th>content</th>
            <th>userid</th>
            <th>sdate</th>
            <th>edate</th>
            <th>done</th>
          </tr>
        </thead>
        <tbody>
          <tr v-for="(todo, index) in todolist" :key="index">
            <td>{{ index + 1 }}</td>
            
            <td>{{ todo.no }}</td>
            <td>{{ todo.content }}</td>
            <td>
              <!-- <a :href="'bookview/' + book.isbn">{{ book.title }}</a> -->
              <router-link :to="`todo/${todo.userid}`">{{ todo.userid }}</router-link>
            </td>            
            <td>{{ todo.sdate }}</td>
            <td>{{ todo.edate }}</td>
            <td>{{ todo.done }}</td>

          </tr>
        </tbody>
      </table>
    </div>
    <div v-else class="text-center">내용이 없습니다.</div>
    
  </div>
</template>

<script>
import axios from "../axios/axios-common.js";
export default {
  name: "BookList",
  data() {
    return {
      todolist: [],
      sno:"",
    };
  },
  created() {
    this.selectAll();
  },
  methods: {
    movePage() {
      this.$router.push({ path: `/bookcreate` });
    },
    searchTodo(){
      this.$router.push({ path: `/todo/`+this.sno });
    },
    selectAll() {
      axios
        .get("/todo")
        .then((response) => {
          this.todolist = response.data;
        })
        .then((error) => {
          console.log(error);
        });
    }
  },
};
</script>

<style>
</style>
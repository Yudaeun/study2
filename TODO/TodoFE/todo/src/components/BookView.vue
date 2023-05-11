<template>
  <div>
    <h1 class="underline">TODO</h1>

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
            <th>삭제</th>
            <th>완료</th>
          </tr>
        </thead>
        <tbody>
          <tr v-for="(todo, index) in todolist" :key="index">
            <td>{{ index + 1 }}</td>
            
            <td>{{ todo.no }}</td>
            <td>{{ todo.content }}</td>
            <td>{{ todo.userid }}</td>
            <td>{{ todo.sdate }}</td>
            <td>{{ todo.edate }}</td>
            <td>{{ todo.done }}</td>
            <td><button @click="deleteBook(todo.no,todolist.length)">삭제</button></td>
            <td><button @click="clearTodo(todo.no)">완료</button>
</td>
            
          </tr>
          
        </tbody>
      </table>
    </div>
    <div v-else>
      목록이 없습니다.
    </div>
    
  </div>
</template>

<script>
import axios from "@/axios/axios-common.js";
export default {
  name: "BookView",
  data: function () {
    return {
      todolist: [],
    };
  },
  created() {
    const params = this.$route.params.userid;
    axios
        .get("/todo/"+params)
        .then((response) => {
          this.todolist = response.data;
        })
        .catch((error) => {
          console.log(error);
        })
    // url에서 파라미터정보 얻기.
    // localStorage에서 booklist로 저장된 도서 목록을 얻어온 후 JSON객체로 parsing한다.
    // const booklist = JSON.parse(localStorage.getItem("booklist"));
    // for (let book of booklist) {
    //   // 보여줄 isbn을 찾았다면.
    //   if (params == book.isbn) {
    //     // 전역변수 book에 화면에 보여줄 객체를 저장.
    //     this.book = book;
    //     break;
    //   }
    // }
  },
  methods: {
    numberWithCommas(x) {
      return x.toString().replace(/\B(?=(\d{3})+(?!\d))/g, ",");
    },
    enterToBr(str) {
      // 문자열에 enter값을 <br />로 변경.(html상에서 줄바꿈 처리)
      return str.replace(/(?:\r\n|\r|\n)/g, "<br />");
    },
    deleteBook(no,len) {      
      axios
        .delete("/todo/"+no)
        .then(() => {
          this.$router.go(this.$router.currentRoute);
        })
        .then((error) => {
          console.log(error);
        })
      if(len==1){
        this.$router.push({ path: `/todo` });
      }
    },
    clearTodo(no){
      axios
        .put("/todo/complete/"+no)
        .then(()=>{
          this.$router.go(this.$router.currentRoute);
        })
        .then((error)=>{
          console.log(error);
        })
    }
  },
};
</script>

<style>
</style>
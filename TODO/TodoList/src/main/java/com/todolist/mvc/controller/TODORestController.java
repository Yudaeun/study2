package com.todolist.mvc.controller;

import com.todolist.mvc.service.TodoService;
import com.todolist.mvc.vo.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Description;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//@RestController: @Controller+@ResponseBody
//@ResponseBody: 서버에서 클라이언트로 응답이 나갈 때 자바를 json으로 변환시켜서 Response의 Body에 담아주는 어노테이션(잭슨이 바꿔줌)
//@RequestBody: 클라이언트에서 서버로 요청이 들어올 때 json을 자바로 변환시켜서 Request의 Body에 담아주는 어노테이션
@RestController
@CrossOrigin("*")
public class TODORestController {
	@Autowired
	TodoService service;

	@Description("모든 할일 목록")
	@GetMapping(value= {"/todo"})
	public ResponseEntity<List<Todo>> AllList() throws Exception{
		List<Todo> list=service.allList();
		ResponseEntity<List<Todo>> rb=
		new ResponseEntity<List<Todo>>(list,HttpStatus.OK);
		System.out.println(rb);
		return rb;
	}
	@Description("user별 모든 할일 목록")
	@GetMapping(value = "/todo/{userid}")
	public List<Todo> allListByUser(@PathVariable String userid) throws Exception{
		return service.allListByUser(userid);
	}
	@Description("할일 등록")
	@PostMapping(value = "/todo")
	public Map<String,String> add(@RequestBody Todo todo) throws Exception{ // 사용자가 입력한 값을 받아와서 DB에 INSERT
		service.add(todo);
		Map<String,String> map=new HashMap<>();
		map.put("result", "insert success!");
		return map;
	}
	@Description("삭제 기준(번호)로 할일 삭제")
	@DeleteMapping(value = "/todo/{no}")
	public Map<String,String> delete(@PathVariable String no) throws Exception{
		int x=service.delete(no);
		
		service.delete(no);
		Map<String,String> map=new HashMap<>();
		map.put("result","delete success!");
		return map;
	}
	@Description("할일 수정")
	@PutMapping(value="/todo")
	public ResponseEntity<String> modify(@RequestBody Todo todo) throws Exception{
		service.modify(todo);
		ResponseEntity<String> rb=new ResponseEntity<String>("modify success",HttpStatus.OK);
		return rb;
	}
	@Description("검색 기준(사용자 id or 번호)으로 할일 검색")
	@GetMapping(value="/todo/find/{no}")
	public Todo find(@PathVariable String no){

		return service.find(no);
	}
	@Description("번호기준 완료 여부 변경 (N->Y)")
	@PutMapping(value="/todo/complete/{no}")
	public Map<String,String> complete(@PathVariable String no){
		int x=service.complete(no);
		Map<String,String> map=new HashMap<>();
		map.put("result","complete success!");
		return map;
	}

	@Description("모든 글 삭제 ")
	@DeleteMapping(value = "/todo/allDelete")
	public Map<String,String> deleteAll() throws Exception{
		service.deleteAll();
		Map<String,String> map=new HashMap<>();
		map.put("result","delete All success!");
		return map;
	}
}

package com.todolist.mvc.service;

import java.util.List;

import com.todolist.mvc.vo.Todo;

public interface TodoService {
	List<Todo> allList(); 				// 모든 할일 목록 o
	List<Todo> allListByUser(String userid); 		// user별 모든 할일 목록 o
	Todo find(String num);			// 검색 기준(사용자 id or 번호)으로 할일 검색 o
	int add(Todo todo); 			// 할일 등록 o
	int modify(Todo todo); 			// 할일 수정 o
	int delete(String num);			// 삭제 기준(번호)으로 할일 삭제 o
	int complete(String num); 			// 번호기준 완료 여부 변경 (N->Y) o
	void deleteAll(); //모든 글 삭제 o
}

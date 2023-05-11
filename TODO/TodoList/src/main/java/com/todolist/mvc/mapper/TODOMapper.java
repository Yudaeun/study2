package com.todolist.mvc.mapper;

import com.todolist.mvc.vo.Todo;
import org.apache.ibatis.annotations.Mapper;

import java.sql.SQLException;
import java.util.List;

//클라이언트(Service)에 서비스 할 내용으로 메소드 선언하기
//Service가 이용 가능한 메소드 목록
@Mapper
public interface TODOMapper {
	List<Todo> allList(); 				// 모든 할일 목록
	List<Todo> allListByUser(String userid); 		// user별 모든 할일 목록
	Todo find(String num);			// 검색 기준(사용자 id or 번호)으로 할일 검색
	int add(Todo todo); 			// 할일 등록
	int modify(Todo todo); 			// 할일 수정
	int delete(String num);			// 삭제 기준(번호)으로 할일 삭제
	int complete(String num); 			// 번호기준 완료 여부 변경 (N->Y)
	void deleteAll(); //모든 글 삭제


}

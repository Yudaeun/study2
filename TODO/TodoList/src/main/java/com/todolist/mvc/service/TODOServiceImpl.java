package com.todolist.mvc.service;
import com.todolist.mvc.mapper.TODOMapper;
import com.todolist.mvc.vo.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TODOServiceImpl implements TodoService {

	@Autowired
    TODOMapper mapper;//interface type

	@Override
	public List<Todo> allList(){
		return mapper.allList();
	}

	@Override
	public List<Todo> allListByUser(String userid){
		return mapper.allListByUser(userid);
	}

	@Override
	public Todo find(String num) {
		return mapper.find(num);
	}

	@Override
	public int add(Todo todo){
		return mapper.add(todo);
	}

	@Override
	public int delete(String num){
		return mapper.delete(num);
	}

	@Override
	public int complete(String num) {
		return mapper.complete(num);
	}

	@Override
	public void deleteAll() {
		mapper.deleteAll();
	}


	@Override
    public int modify(Todo todo) {
        return mapper.modify(todo);
    }


}

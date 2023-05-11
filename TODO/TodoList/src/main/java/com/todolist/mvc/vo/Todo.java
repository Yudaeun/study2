package com.todolist.mvc.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Todo {
	private String no;
	private String content;
	private String userid;
	private String sdate;
	private String edate;
	private String done;
}
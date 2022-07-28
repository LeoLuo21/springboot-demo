package com.feng.bean;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Role {
	private Integer id;
	private String name;
	private Integer roleLevel;
	private String description;

}
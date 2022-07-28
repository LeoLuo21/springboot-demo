package com.feng.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class User   {
	private Integer id;
	private String cnname;
	private String username;

	@JsonIgnore
	private String password;
	private String email;
	private String telephone;
	private String mobilePhone;
	private String wechatId;
	private String skill;
	private Integer departmentId;
	private Integer loginCount;

	private List<Role> roles;

}
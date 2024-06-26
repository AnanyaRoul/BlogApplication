package com.api.blog.payloads;

import java.util.HashSet;
import java.util.Set;

import com.api.blog.entities.Role;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {

	private int id;
	@NotEmpty
	@Size(min =4, message = "Username should be of minimum 4 characters")
	private String name;
	@Email(message = "Email address is invalid!!")
	private String email;
	@NotEmpty
	@Size(min=3,max=10, message = "Password must be between 3-10 characters")
	private String password;
	@NotEmpty
	private String about;
	
	private Set<RoleDto> roles = new HashSet<>();
}

package com.api.blog.payloads;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.api.blog.entities.Category;
import com.api.blog.entities.Comment;
import com.api.blog.entities.User;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PostDto {

	private int postId;
	private String title;
	private String content;
	private String imageName;
	
	private Date addedDate;
	
	private CategoryDto category;
	
	private UserDto user;
	
	private Set<CommentDto> comments = new HashSet<>();

}

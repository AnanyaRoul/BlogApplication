package com.api.blog.services;

import java.util.List;

import com.api.blog.entities.Post;
import com.api.blog.payloads.PostDto;
import com.api.blog.payloads.PostResponse;

public interface PostService {

	public PostDto createPost(PostDto postDto,Integer categoryId,Integer userId);
	
	public PostDto updatePost(PostDto postDto,Integer postId);
	
	public void deletePost(Integer postId);
	
	public PostResponse getAllPosts(Integer pageSize, Integer pageNumber, String sortBy, String sortDir);
	
	public PostDto getPostById(Integer postId);
	
	public List<PostDto> getPostsByCategory(Integer categoryId);
	
	public List<PostDto> getPostsByUser(Integer userId);
	
	public List<PostDto> searchPosts(String keyword);
}

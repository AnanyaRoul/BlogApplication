package com.api.blog.payloads;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CategoryDto {

	private int CategoryId;
	
	@NotBlank
	@Size(min=4, message="Title should be of min 4 characters")
	private String CategoryTitle;
	
	@NotBlank
	@Size(min=10, message="Description should be of min 10 characters")
	private String CategoryDescription;
}

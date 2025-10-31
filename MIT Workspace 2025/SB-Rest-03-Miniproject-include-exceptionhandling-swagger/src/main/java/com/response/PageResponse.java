package com.response;

import java.util.List;

import com.dto.PersonDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class PageResponse {

	private List<PersonDto> content;
	
	private int pageNo;
	
	private int pageSize;
	
	private long totalElements;
	
	private long totalPages;
	
	private boolean isLastPage;
	
	
	
}

package org.api.catflix.domain;

public class MovieFilter {
	private String genre;
	private String cathegory;
	private String keyword;
	private int page;
	private int pageCount;
	
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getCathegory() {
		return cathegory;
	}
	public void setCathegory(String cathegory) {
		this.cathegory = cathegory;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
}

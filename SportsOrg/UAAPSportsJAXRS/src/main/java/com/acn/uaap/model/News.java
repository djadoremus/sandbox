package com.acn.uaap.model;

import java.util.List;

public class News {
	private Integer postID;
	private String postTitle;
	private String imageSrc;
	private String datePublish;
	private String body;
	private String uri;
	private String author;
	
	private List<Tags> tags;
	
	public Integer getPostID() {
		return postID;
	}
	public void setPostID(Integer postID) {
		this.postID = postID;
	}
	public String getPostTitle() {
		return postTitle;
	}
	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
	}
	public String getImageSrc() {
		return imageSrc;
	}
	public void setImageSrc(String imageSrc) {
		this.imageSrc = imageSrc;
	}
	public String getDatePublish() {
		return datePublish;
	}
	public void setDatePublish(String datePublish) {
		this.datePublish = datePublish;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getUri() {
		return uri;
	}
	public void setUri(String uri) {
		this.uri = uri;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setTags(List<Tags> tags){
		this.tags = tags;
	}
	public List<Tags> getTags(){
		return tags;
	}
	
	
}

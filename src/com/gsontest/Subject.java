package com.gsontest;

import com.google.gson.annotations.SerializedName;

import android.R.string;

public class Subject {
	@SerializedName("auther")
	private String author;
	@Override
	public String toString() {
		return "Subject [author=" + author + ", price=" + price + ", subject=" + subject + "]";
	}
	private String price;
	private string subject;
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public string getSubject() {
		return subject;
	}
	public void setSubject(string subject) {
		this.subject = subject;
	}
	public Subject(String author, String price, string subject) {
		super();
		this.author = author;
		this.price = price;
		this.subject = subject;
	}

}

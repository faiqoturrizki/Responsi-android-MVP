package com.responsi.mvp.model;


import com.google.gson.annotations.SerializedName;


public class Registered{

	@SerializedName("date")
	private String date;

	@SerializedName("age")
	private int age;

	public void setDate(String date){
		this.date = date;
	}

	public String getDate(){
		return date;
	}

	public void setAge(int age){
		this.age = age;
	}

	public int getAge(){
		return age;
	}

	@Override
 	public String toString(){
		return 
			"Registered{" + 
			"date = '" + date + '\'' + 
			",age = '" + age + '\'' + 
			"}";
		}
}
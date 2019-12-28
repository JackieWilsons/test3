package com.itheima.domain;

public class Patient {

	private int id;
	private String name;
	private int sex;
	private int age;
	private int did;
	private String content;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Patient{" +
				"id=" + id +
				", name='" + name + '\'' +
				", sex=" + sex +
				", age=" + age +
				", did=" + did +
				", content='" + content + '\'' +
				'}';
	}
}

package com.minhthang.app;

import com.minhthang.model.Person;

public class Main {
	public static void main(String[] args) {
		Person person = new Person(null, null, null, null, null);
		person.setId("Tong_Thong_Obama");
		person.setName("tong thong Obama");
		person.setDescription(" La tong thong cua nuoc My");
		person.setLink("https://vi.wikipedia.org/wiki/Barack_Obama");
		person.setDate(null);
		
		
		System.out.println("dinh danh " + person.getId());
		System.out.println("nhan hien thi " + person.getName());
		System.out.println("mo ta" + person.getDescription());
		System.out.println("link trich " + person.getLink());
		
		
	}

}

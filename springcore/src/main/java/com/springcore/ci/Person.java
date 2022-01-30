package com.springcore.ci;

import java.util.List;

public class Person {
	private int id;
	private int rollno;
	private String personName;
	private Certi  cit;
	private List<String>list;
	
	public Person(int id,int rollno, String personName,Certi cit,List<String>list) {
		this.id=id;
		this.rollno=rollno;
		this.personName=personName;
		this.cit=cit;
		this.list=list;
}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.id +" rollno= "+this.rollno+" name= "+this.personName+" cousre= "+this.cit+" student list= "+this.list;
	}

	
	

}

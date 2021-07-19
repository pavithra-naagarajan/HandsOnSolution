package casestudy;

import java.util.Scanner;



public class Student {
	
	public Student(RegistrationForm[] regform) {
		
	}
	public void registerStudent(RegistrationForm [] regform)throws UniversityException {
		int i=0;
		while(i<regform.length) {
		if(regform[i].getAge()>35||regform[i].getAge()<23) 
			throw new UniversityException("You cannot get an admission because your details are not satisfied");}
	}
	public void registerForExam() {
		System.out.println("you are registered successfully for the examination");
	}
	public void appearForExam() {
		System.out.println("Get the paper for the exam and appear for the exam and submit it after completing the examination");
	}
	

	
	

	
	
	public  void getStudentDetails() {	
		Student[] student=new Student[1];
		
			
		System.out.println("All the students are cleared the Examination susccessfully:");
		System.out.println("student admissionID: "+Math.random());
		
		
		
	}}






	
	



package casestudy;

import java.util.Scanner;

public class ExceptionHandling {

	public ExceptionHandling() {
		
	}

	public static void main(String[] args)  {
		RegistrationForm[] regform=new RegistrationForm[1];
		Scanner s=new Scanner(System.in);
		int i=0;
		System.out.println("Welcome to the University:");
		System.out.println("Enter the student details:");
		while(i<regform.length) {
			System.out.println("Enter Student Name: ");
			String studentName=s.nextLine();
			System.out.println("Enter student marital Status: ");
			String maritalStatus=s.nextLine();
			System.out.println("Enter Student age: ");
			Integer age=s.nextInt();s.nextLine();
			System.out.println("Enter Student DOB: ");
			String dateOfBirth=s.nextLine();
			System.out.println("Enter Student sex: ");
			String sex=s.nextLine();
			System.out.println("Enter Student Address: ");
			String address=s.nextLine();
			System.out.println("Enter Student primaryMailId: ");
			String primaryMailId=s.nextLine();
			System.out.println("Enter Student secondaryMailId: ");
			String secondaryMailId=s.nextLine();
			System.out.println("Enter Student Phonenumber: ");
			String phoneNumber=s.nextLine();
			System.out.println("Enter Student interestedSubject : ");
			String interestedSubject=s.nextLine();
			System.out.println("Enter Student highestEducationQualification : ");
			String highestEducationQualification=s.nextLine();
			System.out.println("Enter Student nationality : ");
			String nationality=s.nextLine();
			
			regform[i]=new RegistrationForm(studentName,maritalStatus,age,dateOfBirth,sex,address,primaryMailId,secondaryMailId,phoneNumber
					,interestedSubject,highestEducationQualification,nationality);
			i++;
		}
		
		for(RegistrationForm object:regform) {
			System.out.println(object);
		}
		
		RegistrationForm regobj=new RegistrationForm(regform);
		
		Student sobj=new Student(regform);
		sobj.registerForExam();
		sobj.appearForExam();
		sobj.getStudentDetails();
		
		try {
			sobj.registerStudent(regform);
		} catch (UniversityException e) {
			
			System.out.println(e.getMessage());
		}
		
		
		Registrar registrarobj=new Registrar();
		try {
			registrarobj.getRegistrar(regform);
		} catch (AgeException e) {
			
			System.out.println(e.getMessage());
		}
		try {
			registrarobj.registerStudent(regform);
		} catch (RegistrationException e) {
			
			System.out.println(e.getMessage());
		}

	}
	
	

}

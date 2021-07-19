package casestudy;

public class RegistrationForm {
	   String studentName;
	   String maritalStatus;
	   int age;
	   String dateOfBirth;
	   String sex;
	   String address;
	   String primaryMailId;
	   String secondaryMailId;
	   String phoneNumber;
	   String interestedSubject;
	   String highestEducationQualification;
	   String nationality;
	
	



	public RegistrationForm(RegistrationForm[] regform) {
		
	}


	public RegistrationForm(String studentName, String maritalStatus, int age, String dateOfBirth, String sex,
			String address, String primaryMailId, String secondaryMailId, String phoneNumber, String interestedSubject,
			String highestEducationQualification, String nationality) {
		super();
		this.studentName = studentName;
		this.maritalStatus = maritalStatus;
		this.age = age;
		this.dateOfBirth = dateOfBirth;
		this.sex = sex;
		this.address = address;
		this.primaryMailId = primaryMailId;
		this.secondaryMailId = secondaryMailId;
		this.phoneNumber = phoneNumber;
		this.interestedSubject = interestedSubject;
		this.highestEducationQualification = highestEducationQualification;
		this.nationality = nationality;
	}




	public String getStudentName() {
		return studentName;
	}




	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}




	public String getMaritalStatus() {
		return maritalStatus;
	}




	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}




	public int getAge() {
		return age;
	}




	public void setAge(int age) {
		this.age = age;
	}




	public String getDateOfBirth() {
		return dateOfBirth;
	}




	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}




	public String getSex() {
		return sex;
	}




	public void setSex(String sex) {
		this.sex = sex;
	}




	public String getAddress() {
		return address;
	}




	public void setAddress(String address) {
		this.address = address;
	}




	public String getPrimaryMailId() {
		return primaryMailId;
	}


	public String getSecondaryMailId() {
		return secondaryMailId;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}




	public String getInterestedSubject() {
		return interestedSubject;
	}




	public void setInterestedSubject(String interestedSubject) {
		this.interestedSubject = interestedSubject;
	}




	public String getHighestEducationQualification() {
		return highestEducationQualification;
	}




	public void setHighestEducationQualification(String highestEducationQualification) {
		this.highestEducationQualification = highestEducationQualification;
	}




	public String getNationality() {
		return nationality;
	}




	public void setNationality(String nationality) {
		this.nationality = nationality;
	}




	@Override
	public String toString() {
		return "RegistrationForm [studentName=" + studentName + ", maritalStatus=" + maritalStatus + ", age=" + age
				+ ", dateOfBirth=" + dateOfBirth + ", sex=" + sex + ", address=" + address + ", primaryMailId="
				+ primaryMailId + ", secondaryMailId=" + secondaryMailId + ", phoneNumber=" + phoneNumber
				+ ", interestedSubject=" + interestedSubject + ", highestEducationQualification="
				+ highestEducationQualification + ", nationality=" + nationality + "]";
	}


}


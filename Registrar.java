package casestudy;

public class Registrar {

	public Registrar() {
		
	}
	public void getRegistrar(RegistrationForm[] regform)throws AgeException {
		int i=0;
		while(i<regform.length) {
			if(regform[i].getAge()>35||regform[i].getAge()<23) {
				throw new AgeException("Your Age is violated the Agelimit mentioned in the University rules");
			}
		}
	}
	
	public void registerStudent(RegistrationForm[] regform) throws RegistrationException{
		int j=0;
		while(j<regform.length) {
			if(!regform[j].getPrimaryMailId().endsWith(".com") ){
				throw new RegistrationException("Your details are not satisfied to get an admission");
			}
		}
	}
	
	
}



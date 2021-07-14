package interfaceproblem;

abstract class Animal{
	String food;
	String location;
	int boundaries;
	String hunger;
	long picture;
	
	
	
	public abstract void eat();	
	public abstract void makeNoise();
	public void sleep() {
		System.out.println("animal sleeps");
	}
	public void roam(){
		System.out.println("animal roams");
	}
	
	
}

abstract class Feline extends Animal implements AnimalCategory{
	public void roam(){
		System.out.println("Feline roam");
	}
	
}
class Lion extends Feline{
	public void makeNoise() {
		System.out.println("lion makes noise");
	}
	public void eat() {
	System.out.println("lion eats");
	}
	@Override
	public void categoryOfAnimal() {
		System.out.println("lion is a carnivore");
		
	}
	
}

class Tiger extends Feline{
	public void makeNoise() {
		System.out.println("tiger makes noise");
	}
	public void eat() {
		System.out.println("tiger eats");
	}
	@Override
	public void categoryOfAnimal() {
		System.out.println("Tiger is a carnivore");
		
	}
	
	
}

class Cat extends Feline{
	public void makeNoise() {
		System.out.println("cat makes noise");
	}
	public void eat() {
		System.out.println("cat eats");
	}
	@Override
	public void categoryOfAnimal() {
		System.out.println("cat is a omnivore");
		
	}
	

}

abstract class Canine extends Animal implements Habitat{
	public void roam() {
		System.out.println("canine roam");
	}
	
}
class Dog extends Canine{
	public void makeNoise() {
		System.out.println("dog makes noise");
	}
	public void eat() {
		System.out.println("dog eats");
	}
	@Override
	public void habitatType() {
		System.out.println("dog lives in domestic area");
		
	}
	@Override
	public void animalType() {
		System.out.println("dog is a domestic animal");
		
	}

}
class Wolf extends Canine{
	public void makeNoise() {
		System.out.println("wolf makes noise");
	}
	public void eat() {
		System.out.println("wolf eats");
	}
	@Override
	public void habitatType() {
		System.out.println("wolf lives in jungle");
		
	}
	@Override
	public void animalType() {
		System.out.println("wolf is a wild animal");
		
	}
	

}

class Hippo extends Animal{
	public void makeNoise() {
		System.out.println("Hippo makes noise");
	}
	public void eat() {
		System.out.println("Hippo eats");
	}
	
	
}

public class PracticeProblem {
	
	public static void main(String[] args) {
		Hippo hippo=new Hippo();
		hippo.makeNoise();
		hippo.eat();
		hippo.sleep();
		hippo.roam();
		System.out.println("*****************************************************");
		Wolf wolf=new Wolf();
		wolf.eat();
		wolf.makeNoise();
		wolf.roam();
		wolf.sleep();
		
		/*Dog dog=new Dog();
		dog.eat();
		dog.makeNoise();
		dog.roam();
		dog.sleep();*/
		System.out.println("*****************************************************");
		Lion lion =new Lion();
		lion.eat();
		lion.makeNoise();
		lion.roam();
		lion.sleep();
		
		/*Tiger tiger=new Tiger();
		tiger.eat();
		tiger.sleep();
		tiger.roam();
		tiger.makeNoise();*/
		
		/*Cat cat=new Cat();
		cat.eat();
		cat.sleep();
		cat.roam();
		cat.makeNoise();*/
		System.out.println("*****************************************************");
		Canine dog1=new Dog();
		dog1.habitatType();
		Canine dog2=new Dog();
		dog2.animalType();
		System.out.println("*****************************************************");
		
		Feline lion1=new Lion();
		lion1.categoryOfAnimal();
		
		Feline tiger1=new Tiger();
		tiger1.categoryOfAnimal();
		
		
		
	}
}

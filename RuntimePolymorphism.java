// java program to implement Runtime polymorphism
class Animal {
	void sound() {
	System.out.println("Animals makes sounds");
	}
}
class Dog extends Animal {
	void sound() {
	System.out.println("Dog is barks");
	}
}
class Cat extends Animal {
	void sound() {
	System.out.println("Cat meows");
	}
}
public class RuntimePolymorphism {
	public static void main(String[]args){
	Animal a;
	a = new Dog();
	a.sound();
	a = new Cat();
	a.sound();
	}
}

	

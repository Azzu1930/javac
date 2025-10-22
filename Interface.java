interface Animal{
    void eat();
}
interface pet {
     void play();
}
class Dog implements Animal,pet{
	public void eat(){
	System.out.println("dog is eating");
}
public void play() {
System.out.println("dog is playing");
	}
}
public class Interface {
	public static void main(String[]args){
	Dog d = new Dog();
	d.eat();
	d.play();
	}
}


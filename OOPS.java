
class Pen {

	String color;
	String type;
	
	public void write(){
	System.out.println("writing somenthing");
	}
	
	public void printColor(){
	System.out.println("color of pen is "+this.color);
	}
}

class Student {
    String name;
	int age;
	//One
	public void printInfo(String name){
	System.out.println("One "+name);
	}
	//Two
	public void printInfo(int age){
	System.out.println("Two "+age);
	}
	//Three
	public void printInfo(String name,int age){
	System.out.println("Three "+name+" "+age);
	}

}

public class OOPS {
	public static void main(String args[]){
	  
		Student s1 = new Student();
		s1.name = "raisan";
		s1.age = 25;
	
		
	
		s1.printInfo(s1.name);
		s1.printInfo(s1.age);
		s1.printInfo(s1.name,s1.age);
	}
};

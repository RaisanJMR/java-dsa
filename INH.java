
class Shape {
String color;

}

class Triangle extends Shape {
public void sayColor(){
System.out.println(this.color);
}
}


public class INH {

public static void main(String args[]){
Triangle t1 = new Triangle();
t1.color = "red";
t1.sayColor();
}

}

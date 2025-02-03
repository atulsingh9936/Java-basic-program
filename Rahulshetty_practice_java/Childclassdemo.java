package Rahulshetty_practice_java;

public class Childclassdemo extends Parent_class_demo {

    public void engine(){
        System.out.println("new engine");
    }

    public void colour(){
        System.out.println(color);
    }
    public static void main(String[] args) {
        Childclassdemo childclassdemo = new Childclassdemo();
        childclassdemo.colour();
        childclassdemo.Brakes();


    }
}

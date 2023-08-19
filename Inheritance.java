class Parent{
    void show1(){
        System.out.println("In Parent");
    }
}
class Child extends Parent{
    void show2(){
        System.out.println("In Child");
    }
}

class GrandChild extends Child{
    void show3(){
        System.out.println("In Grand Child");
    }
}
class Inheritance {
public static void main(String[] args) {
    GrandChild g=new GrandChild();
    g.show1();
    g.show2();
    g.show3();
    
}    
}

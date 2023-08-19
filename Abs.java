abstract class Myabstract{
    abstract void process(double x);
    
}

class Sub1 extends Myabstract{
void process(double x){
    System.out.println("This is a Subclass of abstract class");
    double a=Math.sqrt(x);
    System.out.println("The Sqrt is "+a);
}
}
class Sub2 extends Myabstract{
    void process(double x){
        double b=x*x*x;
        System.out.println("cube is "+b);
    }
}
class Sub3 extends Myabstract{
    void process(double x){
        double c=Math.pow(x, 4);
        System.out.println("Power is "+c);
    }
}
class Abs{
public static void main(String[] args) {
    Sub1 s1=new Sub1();
    Sub2 s2=new Sub2();
    Sub3 s3=new Sub3();
    s1.process(5);
    s2.process(2);
    s3.process(4);

    
    
}   


}

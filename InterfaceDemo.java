interface Superinterface{
    final int a=10;
    final int b=20;
}
interface SubInterface extends Superinterface {
    public void compute();
}
class Addition implements SubInterface{
    public void compute(){
        int c=a+b;
        System.out.println("Addition is "+c);
    }
}

class InterfaceDemo {
    public static void main(String[] args) {
        Addition a=new Addition();
        a.compute();
    }
    
}

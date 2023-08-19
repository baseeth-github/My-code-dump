class Vehicle{
    public void Show(){
        System.out.println("I am a Vehicle superclass");
    }
}
class Car extends Vehicle{
    public void show1() {
        System.out.println("I am a car subclass of vehicle class");

    }
}
 class Bike extends Vehicle {
    public void show2() {
        System.out.println("I am a Bike subclass of vehicle class");

    }}
    class Inheritance1{
    public static void main(String args[]){
        Bike b=new Bike();
        Car c=new Car();
        c.show1();
        c.Show();
b.Show();        b.show2();

    }
}

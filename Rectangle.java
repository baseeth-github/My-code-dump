 class Rectangle {
    double length,breadth;
         Rectangle (double a, double b){
            length=a;
            breadth=b;
            System.out.println("The area of rectangle "+(length*breadth));

        }
        Rectangle(int a, int b){
           System.out.println(a+b);
        }
Rectangle(){
           System.out.println("I am Rectangle");
        }
           public static void main(String[] args) {
           Rectangle r=new Rectangle (2.9,3.7);
           Rectangle r1=new Rectangle(5,2);
Rectangle r2=new Rectangle();
    }
    
}

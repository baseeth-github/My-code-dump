class Methodoverloading {
    float length,breadth;
    float area(float x,float y){
        length=x;
        breadth=y;
        return(length*breadth);
    }
    int area(int x,int y){
        length=x;
        breadth=y;
        return((int)length*(int)breadth);

    }
    
   float area(float x){
       length=breadth=x;
       return (length*breadth);
   }
public static void main(String[] args) {
    Methodoverloading obj=new Methodoverloading();
    float area1=obj.area(4.5f,3.2f);
    float area2=obj.area(10,2);
    float area3=obj.area(4.5f);
    System.out.println("Area of rectangle "+ (float)area1); 
    System.out.println("Area of rectangle "+ (float)area2); 
    System.out.println("Area of rectangle "+ (float)area3); 
}

}




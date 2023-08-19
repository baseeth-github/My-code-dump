import java.util.*;
class Arrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0,i;
        float avg;
        int a[]=new int[5];
        System.out.println("Enter the marks of the Student");
        for(i=0;i<5;i++){
            a[i]=sc.nextInt();
            sum+=a[i];
    
    }avg=(float)sum/5;
    System.out.println("The sum of marks "+sum);
    System.out.println("The average is "+avg);
    }

}

import java.util.*;
class Fibonacci {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of elements for fibonacci");
    int num=sc.nextInt();
    int a=1,b=2,i=1;
    System.out.println(a+"\n"+b);
    while(i<=num-2){
        int c=a+b;
        System.out.println(c);
        a=b;
        b=c;
        i++;    }
}    
}
// 1,2,3,5,8,13,21,34
//            a,b
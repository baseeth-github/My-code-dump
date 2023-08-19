import java.util.*;
class Palindrome {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num,temp,rem,sum=0;
        System.out.println("enter the number to check palindrome");
        num=s.nextInt();
        temp=num;
        while(temp>0){
            rem=temp%10;
            sum=sum*10+rem;
            temp=temp/10;
        }System.out.println("sum "+sum);
        if(sum==num){
            System.out.println("the given number is palindrome ");
        }else{
            System.out.println("the given number is NOT palindrome ");
        }
    }
}

import java.util.*;
class ImpPrograms {
    public static void main(String[] args) {
        //factorial
        int num,fact=1;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number for factorial");
        num=s.nextInt();
        for(int i=1;i<=num;i++){
           fact*=i;

        }System.out.println("factorial of "+num+"is "+fact);
    // To check Armstrong number
       System.out.println("enter the number for armstrong");
       num=s.nextInt();
       int temp,sum=0,rem;
       temp=num;
       while(temp>0){
           rem=temp%10;
           sum=sum+(rem*rem*rem);
           temp=temp/10;
       }if(num==sum){
        System.out.println("The given number is Armstrong");

       }
       else{
        System.out.println("The given number is not Armstrong");
       }
// Prime numbers
System.out.println("enter the number to check prime numbers");
num=s.nextInt();
int count=0;
for(int i=1;i<=num;i++){
    if(num%i==0){
      count+=1;
    }
}if(count==2){
    System.out.println("the given number is Prime");
}else{
    System.out.println("Not a prime number");
}


        
    }
}

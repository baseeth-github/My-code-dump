import java.util.*;
class StringPalindrome {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String s=sc.next();
        String temp=s;
        StringBuffer sb=new StringBuffer(s);
        sb.reverse();
        s=sb.toString();
        if(temp.equalsIgnoreCase(s)){
            System.out.println("Palindrome");

        }else{
            System.out.println("Not Palindrome");
        }

        

    }
}

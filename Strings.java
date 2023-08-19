
public class Strings {
    public static void main(String[] args) {
        String s="Java";
        String s1=new String("james gosling");
        System.out.println(s);
        System.out.println(s1);
        int len=s1.length();// returns the length of the string
        System.out.println("The length of "+s1+ " is "+len);
        String s2=s1.toUpperCase();
        System.out.println(s2);
        String s3=s.toLowerCase();
        System.out.println(s3);
        String s4=s.replace("a", "b");
        System.out.println(s4);
        //character array
        char ch[]={'b','a','s','e','e','t','h'};
        String n=new String(ch);
        System.out.println(n);
        char c=n.charAt(2);
        System.out.println(c);
        String s6=s1.substring(0, 5);
        System.out.println(s6);
    }
}

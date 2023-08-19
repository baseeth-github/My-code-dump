import java.util.*;
class Ctrlstat {
    public static void main(String[] args) {
        int age,num;
        Scanner s=new Scanner(System.in);
        System.out.println("enter age");
        age=s.nextInt();
        //simple-if
        if(age>18){
            System.out.println("you are eligible to vote");
        }
        //if- else
        System.out.println("enter num");
        num=s.nextInt();
        if(num>0)
            System.out.println("this is a +ve number");
        else{
            System.out.println("-ve number");
        }
        // if-else ladder
        System.out.println("enter the per of student");
        int per=s.nextInt();
        if(per>=75){
            System.out.println("Distinction");
        }else if(per>=60 && per<75){
            System.out.println("A grade");
        }else if(per>=50 && per<60){
            System.out.println("B grade");
        }else{
            System.out.println("C grade");
        }
        // switch case
        System.out.println("Entr the key");
        int key=s.nextInt();
        switch(key){
            case 1:
            case 2:
            case 3:
            case 4:
            
            case 5: 
            System.out.println("workday"); break;
            case 6:
            case 7:
            System.out.println("weekend"); break;
            default:
            System.out.println("wogrn key");

        }
        

    }
}

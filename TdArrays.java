import java.util.Scanner;

class TdArrays {
public static void main(String[] args) {
    int [][] a=new int[3][3];//3*3=9
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the elements in array");
    for(int i=0;i<5;i++){
        for(int j=0;j<5;j++){
            a[i][j]=sc.nextInt();
        }
    }
    System.out.println(" the elements are ");
    for(int i=0;i<5;i++){
        for(int j=0;j<5;j++){
            System.out.println(a[i][j]+"\t");
        }System.out.println("\n");
    }

}    
}

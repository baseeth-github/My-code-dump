class Functions {
 /* Functions are used to perform specific task when they are called.
 Access specifier  <returntype> functiontName(parameter list)
{
body of the function
}   */
//call by value
int demoFunction(int a,int b){
    return a+b;

}
//call by reference
void swap(int[] a){
    for(int i=0;i<a.length;i++){
        for(int j=1;j<a.length;j++){
            if(a[i]>a[j]){
                int temp=a[i];
    a[i]=a[j];
    a[j]=temp;
            }

        }
    }
}
   public static void main(String[] args) {
       int x=10,y=50;
       Functions f=new Functions();
       int c=f.demoFunction(x, y);
    System.out.println(c);
    int a[]={30,40,1,23,44};
    f.swap(a);
    for(int i=0;i<=1;i++){
        System.out.println(a[i]);
    }
   }
}
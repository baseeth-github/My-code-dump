
class Even extends Thread {
    public void run(){
    for(int i=0;i<10;i+=2){
    
        System.out.println("Even Thread"+i);
    }
}
}
 class Odd extends Thread{
     public void run(){
    for(int i=1;i<10;i+=2)
    System.out.println("odd Thread"+i);
 }
 }
 class Threads{
     public static void main(String[] args) {
         Even e=new Even();
         Odd o=new Odd();
         e.start();
         o.start();
         e.setPriority(10);
     }
 }

    


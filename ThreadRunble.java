class Ttable implements Runnable {
    public void run(){
     int n=2;
     for(int i=1;i<=10;i++){
        
         System.out.println(n+"*"+i+"="+(n*i));
     }
    }
}
class Ftable implements Runnable{
    public void run(){
        int n=5;
        for(int i=1;i<=10;i++){
        
            System.out.println(n+"*"+i+"="+(n*i));
        }

    }
}
class ThreadRunble {
    public static void main(String[] args) {
        Ttable t2=new Ttable();
        Ftable t5=new Ftable();
        Thread t=new Thread(t2);
        Thread t1=new Thread(t5);
        t.start();
        t1.start();
    }
}

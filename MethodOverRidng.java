class Father{
    void property(){
        System.out.println("In father class");
    }
} 
class Son extends Father{
    void property(){
        System.out.println("In son class");
    }
}
 
 
 
 class MethodOverRidng {
    public static void main(String[] args) {
        Son s=new Son();
        s.property();
    }
}

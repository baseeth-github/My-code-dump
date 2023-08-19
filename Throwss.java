class Throwss {
    int result;
    // throws is used to say that caller function will handle the exception.
    void division(int a,int b) throws Exception{
        if(b==0){
            // to throw the exception explicitly we use throw
            throw new ArithmeticException();
        }
        else{
            result=a/b;
            System.out.println(result);
        }
    }
    /* Here the caller function of division is "main"
    and division handover the exception to main function.
    So the main function has to handle exception using try-catch blocks
    or if main function also throws the exception the the JVM will take 
    care of  Exceptions.. */
    public static void main(String[] args) {
        Throwss t=new Throwss();
        try{
        t.division(5,1);
        }catch(Exception e){
            System.out.println(e);  
        }
        
    }
}

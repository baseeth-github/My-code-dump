class ExcepHandling {
    int c;
        void division(int a,int b){
            try{
                 c=a/b;
            }
            catch(ArithmeticException e){
                System.out.println(e);
            
            } finally{
            System.out.println("result "+c);
            

            }
        }

    public static void main(String[] args) {
       ExcepHandling x=new ExcepHandling();
        x.division(5,0);

    }
    }


class TestClass 
{
     void showData() 
    {
        final int x=5;
        System.out.println("value of x " +x);
    }

    public static void main(String arg[])
    {
        x=10;
        TestClass obj = new TestClass();
        System.out.println("Value of x " +x);
        obj.showData();
    }
}
//exception handling in java
//exceptions types: checked and unchecked exceptions
//checked exceptions are checked at compile time and must be handled using try-catch block or declared using throws keyword
//unchecked exceptions are not checked at compile time and can be handled using try-catch block but are not required to be handled

public class exceptions{
    public static void main(String[] args) {
        //checked exception example
        int a=10;
        int b=0;
        try{
            int c=a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }
        finally{
            System.out.println("This block is always executed");
        }
        //unchecked exception example
        String str=null;
        try{
            System.out.println(str.length());
        }
        catch(NullPointerException e){
            System.out.println("Null pointer exception caught");
        }
        finally{
            System.out.println("This block is always executed");
        }
        //throwing an exception
        try{
            throw new Exception("This is a custom exception");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("This block is always executed");
        }
    }
}

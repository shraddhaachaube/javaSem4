//recursively adding from 1 to n
import java.util.Scanner;
public class recursiveAdd{ 
    public static int Add(int n) {
        if (n == 1) {
            return 1; // Base case: the sum from 1 to 1 is 1
        } else {
            return n + Add(n - 1); // Recursive case: n + sum from 1 to (n-1)
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int result = Add(n);
        System.out.println("The sum from 1 to " + n + " is: " + result);
    }

}
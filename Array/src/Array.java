import java.util.Scanner;

public class Array {
    public static void main(String args[]) {
        System.out.println("Type in the first number");
        Scanner num1 = new Scanner(System.in);
        int number1 = num1.nextInt();
        
        System.out.println("Type in the second number");
        Scanner num2 = new Scanner(System.in);
        int number2 = num2.nextInt();
        
        System.out.println("Type in the third number");
        Scanner num3 = new Scanner(System.in);
        int number3 = num3.nextInt();
        
        System.out.println("Type in the fourth number");
        Scanner num4 = new Scanner(System.in);
        int number4 = num4.nextInt();
        
        int[] arr = {number1,number2,number3,number4};
        int i;
        
        System.out.println("\n \n");
        
        for (i = 0; i < arr.length; i++)
        {
            System.out.println("number " + (i+1) + " = " + arr[i] + "\n");
        }
    }
}
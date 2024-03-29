package Calculator;

import java.util.Scanner;
public class Calculator {
    public static void addition(int a,int b){
        int temp = a + b;
        System.out.println("The Addition of Two Number is : " +temp);
    }

    public static void substraction(int a,int b){
        int temp = a - b;
        System.out.println("The substraction of Two Number is : " +temp);
    }

    public static void multiplication(int a,int b){
        int temp = a * b;
        System.out.println("The multiplication of Two Number is : " +temp);
    }

    public static void division(int a,int b){
        int temp = a / b;
        System.out.println("The division of Two Number is : " +temp);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number : ");
        int a = sc.nextInt();
        System.out.print("Enter the Second Number : ");
        int b = sc.nextInt();
        System.out.print("Enter the Operation you want to Perform (+,-,*,/) : ");
        char c = sc.next().charAt(0);
        sc.close();
        switch (c) {
            case '+':
                addition(a, b);
                break;
            case '-':
                substraction( a,  b);
                break;
            
            case '*':
                multiplication( a, b);
                break;

            case '/':
                division( a , b);
                break;

            default:
                System.out.println("Invalid Operation");
                break;
        }
    }
}

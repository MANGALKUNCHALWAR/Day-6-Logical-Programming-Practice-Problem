package assignment6.Day6LogicalProgrammingPracticeProblem;

import java.util.Scanner;

//4. Reverse a number
//In Java, we can reverse a number either by using for loop, while loop, or using recursion.
//The simplest way to reverse a number is by using for loop or while loop. In order to
//reverse a number, we have to follow the following steps:
//a. We need to calculate the remainder of the number using the modulo.
//b. After that, we need to multiply the variable reverse by 10 and add the remainder into it.
//c. We then divide the number by 10 and repeat steps until the number becomes 0.
public class ReverseNumber {
    public static void main(String[] args) {
        int n, reverse = 0;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        n=sc.nextInt(); //7654
        while(n != 0)
        {
            int remainder = n % 10;  //4 5 6 7
            reverse = reverse * 10 + remainder; //4 45 456 4567
            n = n/10;  //765.4
        }
        System.out.println("The reverse of the given number is: " + reverse);
    }
}

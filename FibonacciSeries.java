package assignment6.Day6LogicalProgrammingPracticeProblem;

import java.util.Scanner;

//1. Fibonacci Series
//Fibonacci series is a special type of series in which the next term is the sum of the
//previous two terms. For example, if 0 and 1 are the two previous terms in a series, then
//the next term will be 1(0+1).
public class FibonacciSeries {

    public static void main(String args[]) {

        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int n1 = 0, n2 = 1, n3, i;
        //loop starts from 2 because 0 and 1 are already printed
        for (i = 2; i < count; ++i) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(n3 + " ,");
        }

    }
}

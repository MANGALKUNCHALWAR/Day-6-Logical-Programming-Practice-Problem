package assignment6.Day6LogicalProgrammingPracticeProblem;


//2. Perfect Number
//a. Just like the Armstrong number, the Perfect Number is also a special type of
//positive number. When the number is equal to the sum of its positive divisors
//excluding the number, it is called a Perfect Number. For example, 28 is the perfect
//number because when we sum the divisors of 28, it will result in the same number.
//The divisors of 28 are 1, 2, 4, 7, and 14. So,
//b. 28 = 1+2+4+7
//c. 28 = 28

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        int n, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Please Enter Number: ");
        n = sc.nextInt();
        for (int i = 1; i < n; i++) {
            if (n % i == 0)
                sum = sum + i;
        }
        if (sum == n)
            System.out.println("perfect no. Yes");
        else
            System.out.println(" No");
    }
}


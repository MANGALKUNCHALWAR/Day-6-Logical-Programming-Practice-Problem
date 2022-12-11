package assignment6.Day6LogicalProgrammingPracticeProblem;

//3. Prime Number
//Just like the Perfect number, the Prime number is also a special type of number. When
//the number is divided greater than 1 and divided by 1 or itself is referred to as the Prime
//number. 0 and 1 are not counted as prime numbers. All the even numbers can be
//divided by 2, so 2 is the only even prime minister.

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        boolean isPrime = true;
        for (int i = 2; i < num; i++) {
            // condition for nonprime number
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
}

//or

class PrimeNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,count=0,i;
        System.out.println("Enter a number");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        if(count==2)
        {
            System.out.println("it is a prime number");
        }
        else
        {
            System.out.println("not prime");
        }
    }

}


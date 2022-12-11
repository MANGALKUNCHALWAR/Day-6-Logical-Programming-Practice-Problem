package assignment6.Day6LogicalProgrammingPracticeProblem;

import java.util.Arrays;

//5. Coupon Numbers
//a. Desc -> Given N distinct Coupon Numbers, how many random numbers do you
//need to generate a distinct coupon number? This program simulates this random process.
//b. I/P -> N Distinct Coupon Number
//c. Logic -> repeatedly choose a random number and check whether it's a new one.
//d. O/P -> total random number needed to have all distinct numbers.
//e. Functions => Write Class Static Functions to generate random numbers and to process distinct coupons.
public class CouponQues {
    public static void main(String[] args) {
        // iterate the loop until get N distinct number
        int number = 10;
        int couponCount = 0;
        int arrIndex = 0;
        int loopCount = 0;
        int[] record = new int[number];
        while (couponCount < number) {
            int random = CouponQues.generateRandomNumber(number);
            System.out.println(random);
            if (!isExists(record, random)) {
                couponCount++;
                record[arrIndex] = random;
                arrIndex++;
            }
            loopCount++;
        }

        System.out.println("total loop count : " + loopCount);
        System.out.println("distinct coupons : " + Arrays.toString(record));

    }

    private static boolean isExists(int[] record, int random) {
        for (int i : record) {
            if (i == random) {
                return true;
            }
        }
        return false;
    }

    private static int generateRandomNumber(int number) {
        return (int) (Math.floor(Math.random() * 100)) % number + 1;

    }
}

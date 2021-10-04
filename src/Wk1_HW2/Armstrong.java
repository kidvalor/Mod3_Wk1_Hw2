package Wk1_HW2;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter number");

        int num1 = myObj.nextInt() , num2, remainder, result = 0, i= 0;

        num2 = num1;

        for (;num2 != 0; num2 /= 10, ++i);

        num2 = num1;

        for (;num2 != 0; num2 /= 10)
        {
            remainder = num2 % 10;
            result += Math.pow(remainder, i);
        }

        if(result == num1)
            System.out.println(num1 + " is an Armstrong number.");
        else
            System.out.println(num1 + " is not an Armstrong number.");
    }
}

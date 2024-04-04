/*Aim:- Design a Java 8 program to get the sum of all numbers present in a list.
Author:- Nupur Kuhite
Version:- 10.0
Date:- 2/04/2024
*/

import java.util.Arrays;
import java.util.List;

public class PracticalNo10 {
    public static void main(String[] args) 
    {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
        System.out.println("List: "+numbers);
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();

        System.out.println("Sum of numbers in List: " + sum);
    }
}




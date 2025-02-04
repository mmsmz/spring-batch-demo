package com.ma.spring.batch;

public class CodingTest {
    public static void main(String[] args) {

        // using forloop print the highest vlaue and second highest value
        int nums[] = {11, 2, 35, 487, 1, 20, 12, 2,9};
        int firstHighest = 0;
        int secondHighest = 0;

        for (int i = 0; i <nums.length ; i++) {
            if(nums[i] >firstHighest){
                secondHighest = firstHighest;
                firstHighest = nums[i];
            }
        }
        System.out.println(firstHighest);
        System.out.println(secondHighest);



    }
}

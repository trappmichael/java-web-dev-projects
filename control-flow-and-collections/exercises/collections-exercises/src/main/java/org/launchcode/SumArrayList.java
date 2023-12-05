package org.launchcode;

import java.util.ArrayList;

public class SumArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(10);
        nums.add(2);
        nums.add(15);
        nums.add(13);
        nums.add(12);
        nums.add(7);
        nums.add(1);
        nums.add(10);
        nums.add(6);

        int sumArrList = SumEvenNums.getSumEvens(nums);

        System.out.println(sumArrList);

    }
}

package org.launchcode;

import java.util.ArrayList;

public class SumEvenNums {
    public static Integer getSumEvens (ArrayList<Integer> nums) {
        int sum = 0;

        for (int integer : nums) {
            if (integer % 2 == 0) {
                sum += integer;
            }
        }

        return sum;
    }
}

package com.practice.pkss.Services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Practice2Service {
    public Practice2Service () {

    }

    public List<Integer> task10 (int n) {
        List<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (isDivisibleByDigits(i)) {
                numbers.add(i);
            }
        }

        return numbers;
    }

    private static boolean isDivisibleByDigits(int number) {
        String numberString = String.valueOf(number);

        for (int i = 0; i < numberString.length(); i++) {
            int digit = Character.getNumericValue(numberString.charAt(i));
            if (digit == 0 || number % digit != 0) {
                return false;
            }
        }

        return true;
    }

    public double task13 (int num, int powNum) {
        return Math.pow(num, powNum);
    }

    public int[] task16 (int x1, int y1, int x2, int y2, int x3, int y3) {
        int [] maxNumbers = {Math.max(x1, y1), Math.max(x2, y2), Math.max(x3, y3)};
        return maxNumbers;
    }

    public int task19 (int a, int b, int c) {
        return Math.min(Math.min(a, b), c);
    }

    public String[] task22 (int a, int b, int c, int d) {
        String[] resultArray = new String[4];

        if (a%2 == 0)
            resultArray[0] = "Число A четное";
        else
            resultArray[0] = "Число A не четное";

        if (b%2 == 0)
            resultArray[1] = "Число B четное";
        else
            resultArray[1] = "Число B не четное";

        if (c%2 == 0)
            resultArray[2] = "Число С четное";
        else
            resultArray[2] = "Число С не четное";

        if (d%2 == 0)
            resultArray[3] = "Число D четное";
        else
            resultArray[3] = "Число D не четное";

        return resultArray;
    }
}

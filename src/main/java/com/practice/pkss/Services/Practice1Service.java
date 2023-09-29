package com.practice.pkss.Services;

import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class Practice1Service {
    public Practice1Service () {

    }

    public int[] task10 (int a, int b, int c) {
        int [] numbers = {a, b, c};
        return Arrays.stream(numbers).sorted().toArray();
    }

    public String task13 (int x1, int y1, int x2, int y2, int x3, int y3) {
        if ((x1 == x2 && x2 == x3) || (y1 == y2 && y2 == y3))
            return "Треугольника не существует";
        else
            return "Треугольник существует";
    }

    public String task16 (int square, int circle) {
        double sideLength = Math.sqrt(square);
        double diameter = Math.sqrt(circle/Math.PI )*2;
        if (diameter < sideLength)
            return "Поместится";
        else
            return "Не поместится";
    }

    public String task19 (double a, double b, double c, double d) {
        if ((a < c && b < d) || (a < d && b < c))
            return "Поместится";
        else
            return "Не поместится";
    }

    public String[] task22 (int a, int b, int c, int d) {
        int left = 3;
        int right = 15;

        String[] resultArray = new String[4];

        if (a > left && a < right)
            resultArray[0] = "Число A принядлежит интервалу";
        else
            resultArray[0] = "Число A не принядлежит интервалу";

        if (b > left && b < right)
            resultArray[1] = "Число B принядлежит интервалу";
        else
            resultArray[1] = "Число B не принядлежит интервалу";

        if (c > left && c < right)
            resultArray[2] = "Число С принядлежит интервалу";
        else
            resultArray[2] = "Число С не принядлежит интервалу";

        if (d > left && d < right)
            resultArray[3] = "Число D принядлежит интервалу";
        else
            resultArray[3] = "Число D не принядлежит интервалу";

        return resultArray;
    }
}

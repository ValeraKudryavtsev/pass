package com.practice.pkss.Services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Practice3Service {
    public Practice3Service () {

    }

    public int task10 (int n) {
        for (int i=0; i <= n; i++) {
            if (Math.pow(4, i) > n)
                return (int) Math.pow(4, i);
        }
        return -1;
    }

    public boolean task13 (int n) {
        if (n <= 0) {
            return false;
        }

        while (n % 3 == 0) {
            n /= 3;
        }

        return n == 1;
    }

    public List<String> task16 () {
        List<String> resultArray = new ArrayList<>();
        double x = 12.0;
        double end = 1.0;
        double step = -1.2;

        while (x >= end) {
            double z = Math.tan(x) + 5 * Math.cos(x - 2);
            if (z < 0) {
                resultArray.add("z = " + z + ", x = " + x);
            }
            x += step;
        }

        return resultArray;
    }

    public double task19 () {
        double n = 1.0;
        double result = 0;

        do {
            result = Math.sin(Math.tan(n/2));
            n++;
        } while (result >= 0);

        return result;
    }

    public int task22 (int n) {
        for (int i=0; i <= n; i++) {
            if (Math.pow(3, i) >= n)
                return (int) Math.pow(3, i-1);
        }
        return -1;
    }
}

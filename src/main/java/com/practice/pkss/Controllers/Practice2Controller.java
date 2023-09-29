package com.practice.pkss.Controllers;

import com.practice.pkss.Services.Practice2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/practice2")
public class Practice2Controller {
    @Autowired
    private Practice2Service practice2Service;

//  Составить программу вывода на экран всех натуральных чисел, не превос-
//  ходящих N и делящихся на каждую из своих цифр.
    @PostMapping("/task10/{n}")
    public List<Integer> task10 (@PathVariable int n) {
        return practice2Service.task10(n);
    }

//  Используя подпpогpамму - функцию, составить пpогpамму для возведе- ния чисел в целую положительную степень
    @PostMapping("/task13/{num}/{powNum}")
    public double task13 (@PathVariable int num, @PathVariable int powNum) {
        return practice2Service.task13(num, powNum);
    }

//  Задав функцию, pассчитать и вывести на печать максимальные значения в тpех паpах чисел, вводимых с клавиатуpы.
//  Пара чисел передается функции в качестве параметра.
    @PostMapping("/task16/{x1}/{y1}/{x2}/{y2}/{x3}/{y3}")
    public int[] task16 (
            @PathVariable int x1, @PathVariable int y1,
            @PathVariable int x2, @PathVariable int y2,
            @PathVariable int x3, @PathVariable int y3
    ) {
        return practice2Service.task16(x1, y1, x2, y2, x3, y3);
    }

//  Даны числа A, B, C. Получить с использованием функции пользователя
//  наименьшее значение. Числа передаются функции из основной программы в качестве параметров.
    @PostMapping("/task19/{a}/{b}/{c}")
    public int task19 (@PathVariable int a, @PathVariable int b, @PathVariable int c) {
        return practice2Service.task19(a, b, c);
    }

//  Даны целые числа a,b,c,d. Пpовеpить с использованием функции пользова- теля их четность.
//  Число для проверки передается в функцию в качестве па- раметра из основной программы.
    @PostMapping("/task22/{a}/{b}/{c}/{d}")
    public String[] task22 (
            @PathVariable int a, @PathVariable int b,
            @PathVariable int c, @PathVariable int d
    ) {
        return practice2Service.task22(a, b, c, d);
    }
}

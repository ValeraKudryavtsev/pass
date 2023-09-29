package com.practice.pkss.Controllers;

import com.practice.pkss.Services.Practice1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/practice1")
public class Practice1Controller {
    @Autowired
    private Practice1Service practice1Service;

//    Вывести на печать переменные А,В,С в порядке их возрастания
    @PostMapping("/task10/{a}/{b}/{c}")
    public int[] task10 (@PathVariable int a, @PathVariable int b, @PathVariable int c) {
        return practice1Service.task10(a, b, c);
    }

//    Выяснить, существует ли треугольник с координатами вершин А(x1,y1),В(x2,y2),C(x3,y3)
    @PostMapping("/task13/{x1}/{y1}/{x2}/{y2}/{x3}/{y3}")
    public String task13 (
            @PathVariable int x1, @PathVariable int y1,
            @PathVariable int x2, @PathVariable int y2,
            @PathVariable int x3, @PathVariable int y3
    ) {
        return practice1Service.task13(x1, y1, x2, y2, x3, y3);
    }

//    Даны площадь квадрата S1 и круга S2. Определить поместится ли круг в квадрат и наоборот
    @PostMapping("/task16/{square}/{circle}")
    public String task16 (@PathVariable int square, @PathVariable int circle) {
        return practice1Service.task16(square, circle);
    }

//    Даны действительные числа А,В,С,D. Выяснить, можно ли уместить прямо-
//    угольник со сторонами А,В внутри прямоугольника со сторонами C,D
    @PostMapping("/task19/{a}/{b}/{c}/{d}")
    public String task19 (
            @PathVariable double a, @PathVariable double b,
            @PathVariable double c, @PathVariable double d
    ) {
        return practice1Service.task19(a, b, c, d);
    }

//    Проверить, какие из чисел А,В,С,D не принадлежат интервалу (3,15)
    @PostMapping("/task22/{a}/{b}/{c}/{d}")
    public String[] task22 (
            @PathVariable int a, @PathVariable int b,
            @PathVariable int c, @PathVariable int d
    ) {
        return practice1Service.task22(a, b, c, d);
    }
}

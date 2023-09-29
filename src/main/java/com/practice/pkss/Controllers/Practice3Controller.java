package com.practice.pkss.Controllers;

import com.practice.pkss.Services.Practice3Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/practice3")
public class Practice3Controller {
    @Autowired
    private Practice3Service practice3Service;

//    Дано натуральное число N. Получить наименьшее число вида 4^k, большее N
    @PostMapping("/task10/{n}")
    public int task10 (@PathVariable int n) {
        return practice3Service.task10(n);
    }

//    Определить,является ли натуpальное число N степенью числа 3 или нет
    @PostMapping("/task13/{n}")
    public boolean task13 (@PathVariable int n) {
        return practice3Service.task13(n);
    }

//    Вывести на печать отpицательные значения функции z=tg(x)+5cos(x-2) для x
//    изменяющегося на отрезке [12, 1] с шагом 1,2.
    @PostMapping("/task16")
    public List<String> task16 () {
        return practice3Service.task16();
    }

//    Hайти пеpвый отpицательный член последовательности sin(tg(n/2)) для n
//    изменяющегося на следующим обpазом: n=1,2,3...
    @PostMapping("/task19")
    public double task19 () {
        return practice3Service.task19();
    }

//    Дано натуральное число N. Получить наибольшее число вида 3^k, меньшее N
    @PostMapping("/task22/{n}")
    public int task22 (@PathVariable int n) {
        return practice3Service.task22(n);
    }
}

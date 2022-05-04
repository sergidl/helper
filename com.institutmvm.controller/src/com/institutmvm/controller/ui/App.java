package com.institutmvm.controller.ui;

import cat.institutmvm.application.entities.Colour;
import cat.institutmvm.application.entities.Employee;
import cat.institutmvm.application.entities.Persona;
import cat.institutmvm.application.entities.SalesEmployee;
import cat.institutmvm.application.utils.MyMath;

import java.time.LocalDate;
import java.util.Scanner;

public class App {
    private static final String MSG = "Introdueix un valor enter: ";

    
    /** 
     * @param args
     */
    public static void main(String[] args){
        int valor;
        Persona p = new Persona();
        Scanner sc = new Scanner(System.in);
        p.setTitol("Pepito");

        System.out.println(p.getTitol());
        System.out.println(MSG);
        valor = sc.nextInt();
        System.out.println(!MyMath.isEven(valor) ? "És fals": "És cert");
        System.out.println(MyMath.abs(valor));
        System.out.println(MyMath.nextInt(valor));
        System.out.println(MyMath.avg(4,2,3,19, 23, 3));
        System.out.println("MyMath.max(4,2,5,3,10,11)	" + MyMath.max(4,2,5,3,10,11));
        System.out.println("MyMath.min(4,2,5,-3,10,11)	" + MyMath.min(4,2,5,-3,10,11));

        Colour c1 = Colour.random();
        System.out.println(c1.toRGB(false));

        var e1 = new Employee("E001", "Laura", "Velazquez", LocalDate.of(1980, 10, 23), LocalDate.of(2015, 1, 15), 18000);
        System.out.printf("%s%n", e1);

        var e4 = new SalesEmployee("E004", "Pedro", "Laguna", LocalDate.of(1970, 2, 13),  LocalDate.of(2000, 1, 1),14000,2000);
        System.out.printf("%s%n", e4);
    }
}

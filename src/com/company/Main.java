package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Figure[] figures = new Figure[3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj promień koła: ");
        figures[0] = new Circle(scanner.nextDouble());
        System.out.println("Podaj dwa boki trójkąta prostokatnego: ");
        figures[1] = new Triangle(scanner.nextDouble(), scanner.nextDouble());
        System.out.println("Podaj dwa boki prostokąta: ");
        figures[2] = new Rectangle(scanner.nextDouble(), scanner.nextDouble());

        for(Figure figure: figures){
            System.out.println(figure.getName()+": " + "Obwod: " + figure.getPerimeter() + " " + "Pole: " + figure.getArea());
        }


    }
}

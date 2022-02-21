package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList product = new ArrayList();
        Scanner scan = new Scanner(System.in);
        //String str = scan.nextLine();
        String str1 = "111";
        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.println("Содежимое склада -view   |   Добавить товар -add   |   Удалить товар -del   |   Завершить работу -exit");
        System.out.println("------------------------------------------------------------------------------------------------------");
        do {
            System.out.print("Какую операцию вы хотите выполнить?: ");
            String str = scan.nextLine();

            if (str.equals("-view")) {
                if (product.size() == 0) {
                    System.out.println("--------------");
                    System.out.println("| Склад пуст |");
                    System.out.println("--------------");
                    System.out.println("");
                } else {
                    System.out.println("Склад " + product);
                    System.out.println("");
                }

            } else if (str.equals("-del")) {
                if (product.size() == 0) {
                    System.out.println("-------------------------------------");
                    System.out.println("| Склад пуст, ничего удалить нельзя |");
                    System.out.println("-------------------------------------");
                    System.out.println("");
                }
                else {
                    System.out.print("Какой товар удалить?: ");
                    String proddel = scan.nextLine();
                    if (product.contains(proddel)) {
                        product.remove(proddel);
                        System.out.println("------------------------");
                        System.out.println("| Товар успешно удален |");
                        System.out.println("------------------------");
                        System.out.println("");
                    } else {
                        System.out.println("-------------------------------");
                        System.out.println("| Такого товара на складе нет |");
                        System.out.println("-------------------------------");
                        System.out.println("");
                    }
                }
                }
             else if (str.equals("-add")) {
                if (product.size() == 5) {
                    System.out.println("----------------------------------------------");
                    System.out.println("| Склад полон, больше ничего нельзя добавить |");
                    System.out.println("----------------------------------------------");
                    System.out.println("");
                } else {
                    System.out.print("Введите наименование товара: ");
                    String prodadd = scan.nextLine();
                    product.add(prodadd);
                    System.out.println("--------------------------");
                    System.out.println("| Товар успешно добавлен |");
                    System.out.println("--------------------------");
                    System.out.println("");
                }
            }

             else if (str.equals("-exit")) {
                 System.out.println("ПОКА!");
                 break;
            }
             else {
                System.out.println("-------------------------------");
                System.out.println("| Такой команды в системе нет |");
                System.out.println("-------------------------------");
                System.out.println("");}

        } while (str1.equals("111"));
    }
}





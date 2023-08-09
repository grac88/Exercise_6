package com.max.idea;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        int choice_main = in.nextInt();
        if (choice_main == 1) {
            System.out.println("Выберите единицу измерения: 1 - килограмм, 2 - грамм, 3 - фунт, 4 - унция");
            int choice1 = in.nextInt();
            double kg = 0;
            double gr = 0;
            double fnt = 0;
            double unc = 0;
            switch (choice1) {
                case 1:
                    System.out.println("Введите число:");
                    kg = in.nextDouble();
                    System.out.println("в килограммах = " + kg * 1);
                    System.out.println("в граммах = " + kg * 1000);
                    System.out.println("в фунтах = " + kg * 2.205);
                    System.out.println("в унциях = " + kg * 35.274);
                    break;
                case 2:
                    System.out.println("Введите число:");
                    gr = in.nextDouble();
                    System.out.println("в килограммах = " + gr * 0.001);
                    System.out.println("в граммах = " + gr * 1);
                    System.out.println("в фунтах = " + gr * 0.0022);
                    System.out.println("в унциях = " + gr * 0.035);
                    break;
                case 3:
                    System.out.println("Введите число:");
                    fnt = in.nextDouble();
                    System.out.println("в килограммах = " + fnt * 0.454);
                    System.out.println("в граммах = " + fnt * 453.592);
                    System.out.println("в фунтах = " + fnt * 1);
                    System.out.println("в унциях = " + fnt * 16);
                    break;
                case 4:
                    System.out.println("Введите число:");
                    unc = in.nextDouble();
                    System.out.println("в килограммах = " + unc * 0.028);
                    System.out.println("в граммах = " + unc * 28.35);
                    System.out.println("в фунтах = " + unc * 0.063);
                    System.out.println("в унциях = " + unc * 1);
                    break;
                default:
                    break;
            }
        }
        if (choice_main == 2) {
            System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
            int choice2 = in.nextInt();
            double m = 0;
            double mil = 0;
            double yrd = 0;
            double ft = 0;
            switch (choice2) {
                case 1:
                    System.out.println("Введите число:");
                    m = in.nextDouble();
                    System.out.println("в метрах = " + m * 1);
                    System.out.println("в милях = " + m * 0.0006);
                    System.out.println("в ярдах = " + m * 1.094);
                    System.out.println("в футах = " + m * 3.281);
                    break;
                case 2:
                    System.out.println("Введите число:");
                    mil = in.nextDouble();
                    System.out.println("в метрах = " + mil * 1609.34);
                    System.out.println("в милях = " + mil * 1);
                    System.out.println("в ярдах = " + mil * 1760);
                    System.out.println("в футах = " + mil * 5280);
                    break;
                case 3:
                    System.out.println("Введите число:");
                    yrd = in.nextDouble();
                    System.out.println("в метрах = " + yrd * 0.914);
                    System.out.println("в милях = " + yrd * 0.00057);
                    System.out.println("в ярдах = " + yrd * 1);
                    System.out.println("в футах = " + yrd * 3);
                    break;
                case 4:
                    System.out.println("Введите число:");
                    ft = in.nextDouble();
                    System.out.println("в метрах = " + ft * 0.305);
                    System.out.println("в милях = " + ft * 0.00019);
                    System.out.println("в ярдах = " + ft * 0.33);
                    System.out.println("в футах = " + ft * 1);
                    break;
                default:
                    break;
            }
        }
    }
}

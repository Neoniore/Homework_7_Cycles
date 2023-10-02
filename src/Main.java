import java.sql.Time;

public class Main {
    public static void main(String[] args) {
      /*  Task1();
        Task2();
        Task3();
        Task4();
        Task5();*/
        Task6();
     /*   Task7();
        Task8();*/

    }

    public static void Task1() {
        System.out.println("Задание 1");
        double savingMoneyPerMonth = 15000, inBank = 0, interestRate = 0.12;
        int month = 0;
        while (inBank < 2_459_000){
            inBank += inBank * (interestRate / 12) + savingMoneyPerMonth;
            month++;
        }
        System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей \n", month, inBank);
        System.out.println();
    }
    public static void Task2() {
        System.out.println("Задание 2");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.printf("%d ", i);
        }
        System.out.println();
        for (; i > 0; i--) {
            System.out.printf("%d ", i);
        }
        System.out.println("\n");
    }
    public static void Task3() {
        System.out.println("Задание 3");
        int population = 12_000_000;
        double fertility = 0.017, mortality = 0.008, bornInYear, diedInYear;
        for (int i = 0; i < 10; i++) {
            bornInYear = population * fertility;
            diedInYear = population * mortality;
            population += bornInYear - diedInYear;
            System.out.printf("Год %d, численность населения составляет %d \n", i, population);
        }
        System.out.println();
    }
    public static void Task4() {
        System.out.println("Задание 4");
        double inBank = 15000, interestRatePerMonth = 0.07;
        int month = 1;
        while (inBank < 12_000_000){
            inBank += inBank * interestRatePerMonth;
            System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей \n", month, inBank);
            month++;
        }
        System.out.println();
    }
    public static void Task5() {
        System.out.println("Задание 5");
        double inBank = 15000, interestRatePerMonth = 0.07;
        int month = 1;
        while (inBank < 12_000_000){
            inBank += inBank * interestRatePerMonth;
            if (month % 6 == 0) {
                System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей \n", month, inBank);
            }
            month++;
        }
        System.out.println();
    }
    public static void Task6() {
        System.out.println("Задание 6");
/*        double inBank = 15000, interestRatePerMonth = 0.07;
        int month = 1;
        while (month <= 12 * 9){
            inBank += inBank * interestRatePerMonth;
            if (month % 6 == 0) {
                System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей \n", month, inBank);
            }
            month++;
        }
*/
        /*double inBank = 15000, interestRatePerMonth = 0.07;
        int month = 1;
        boolean nineYearsHavePassed = false;
        while (!nineYearsHavePassed){
            inBank += inBank * interestRatePerMonth;
            if (month % 6 == 0) {
                System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей \n", month, inBank);
            }
            month++;
            if (month > 12 * 9) {
                nineYearsHavePassed = true;
            }*/

        double inBank = 15000, interestRatePerMonth = 0.07;
        int month = 1;
        boolean nineYearsHavePassed = false;
        while (!nineYearsHavePassed){
            inBank += inBank * interestRatePerMonth;
            if (month % 6 == 0) {
                System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей \n", month, inBank);
            }
            month++;
            nineYearsHavePassed = month > 9 * 12;
        }
        System.out.println();
    }
    public static void Task7() {
        System.out.println("Задание 7");
        int firstFridayOfTheMonth = 5, month = 31;
        for (int i = firstFridayOfTheMonth; i <= month; i+=7) {
            System.out.printf("Сегодня пятница, %d-е число. Необходимо подготовить отчет \n", i);
        }
        System.out.println();
    }
    public static void Task8() {
        System.out.println("Задание 8");
        int currentYear = 2023;
        for (int year = currentYear - 200; year <= currentYear + 100; year++) {
            if (year % 79 == 0) {
                System.out.println(year);
            }
        }
        System.out.println();
    }
}
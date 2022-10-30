public class Main {
    public static void main(String[] args) {
        System.out.println("HomeWork5_Cycle_Lesson_Two");
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();

    }

    private static void task10() {
        System.out.println("Задание 9.");
        int number = 0;
        int i = 0;
        while (number < 20) {
            i++;
            number = i * 2;
            System.out.printf("%d * 2 = %d \n", i, number);
        }
    }

    private static void task9() {
        System.out.println("Задание 8.");
        int year = 0;
        while (year < 2122) {
            year += 79;
            if (year >= 1822 && year <= 2022) {
                System.out.printf("Комета пролетала рядом с Землей в %d году\n", year);
            }
            if (year > 2022 && year <= 2122){
                System.out.printf("Комета пролетит рядом с Землей в %d году \n", year);
            }
        }
    }

    private static void task8() {
        System.out.println("Задание 7.");
        int friday = 2;
        System.out.printf("Сегодня пятница, %d-е число. Необходимо подготовить отче \n", friday);
        while (friday < 31) {
            friday += 7;
            if (friday < 31) {
                System.out.printf("Сегодня пятница, %d-е число. Необходимо подготовить отче \n", friday);
            }
        }
    }

    private static void task7() {
        System.out.println("Задание 6.");
        int sum = 15_000;
        int year = 9;
        int month = 12;
        for (int i = 1;i <= year*month;i++) {
            sum += sum * 0.07;
            if (i % 6 == 0) {
                System.out.printf("Месяц %d, сумма накоплений равна %d рублей \n", i,sum);
            }
        }
    }

    private static void task6() {
        System.out.println("Задание 5.");
        int sum = 15_000;
        for (int i = 1;sum <= 12_000_000;i++) {
            sum += sum * 0.07;
            if (i % 6 == 0) {
                System.out.printf("Месяц %d, сумма накоплений равна %d рублей \n", i,sum);
            }
        }
    }

    private static void task5() {
        System.out.println("Задание 4.");
        int sum = 15_000;
        for (int i = 1;sum <= 12_000_000;i++) {
            sum += sum * 0.07;
            System.out.printf("Месяц %d, сумма накоплений равна %d рублей \n", i,sum);
        }
    }

    private static void task4() {
        System.out.println("Задание 3.");
        int people = 12_000_000;
        int birthRate;
        int mortality;
        for (int i = 1; i <= 10; i++) {
           birthRate = (people/1000) * 17;
           mortality = (people/1000) * 8;
           people += (birthRate - mortality);
           System.out.printf("Год %d, численность населения составляет %d\n", i,people);
        }
    }


    private static void task3() {
        System.out.println("Задание 2.");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println(" ");
        for (int a = 10; a != 0; a--) {
            System.out.print(a + " ");
        }
    }

    private static void task2() {
        System.out.println("Задание 1.");
        int cash = 29000;
        int totalSum = 0;
        for (int i = 0;totalSum <= 2_459_000; i++) {
            totalSum += totalSum/100; // + 1%
            totalSum += cash;
            System.out.printf("Месяц %d, сумма накоплений равна %d рублей\n", i,totalSum);
        }
    }

    private static void task1() {
        System.out.println("Задание 1.");
        int cash = 29000;
        int totalSum = 0;
        int i = 0;
        while (totalSum <= 2_459_000) {
            totalSum += totalSum/100; // + 1%
            totalSum += cash;
            i++;
        }
        System.out.printf("Месяц %d, сумма накоплений равна %d рублей\n", i,totalSum);
    }
}

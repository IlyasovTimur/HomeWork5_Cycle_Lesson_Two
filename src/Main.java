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

    }

    private static void task7() {
        System.out.println("Задание 6.");
        int sum = 15_000;
        for (int i = 1;sum <= 12_000_000;i++) {
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

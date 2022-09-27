import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        System.out.println();
        System.out.println("Пожалуйста, проверьте домашнее задание");
    }

    public static void task1() {
        int age = 19;
        if (age >= 18) {
            System.out.println("Поздравляем, вы совершеннолетний");
        }
        if (age < 18) {
            System.out.println("Вы еще не достигли совершеннолетия");
        }
    }

    public static void task2() {
        int age = 7;
        if (age >= 7 && age < 18) {
            System.out.println("Ребенок ходит в школу ");
        }
        if (age >= 18 && age < 24) {
            System.out.println("Человек закончил школу и может направиться в университет");
        }
        if (age >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }
        if (age < 7) {
            System.out.println("Вы еще не достигли возраста учебы или работы");
        }
    }

    public static void task3() {
        int sumspace = 102;
        int seat = 60;
        int standing = sumspace - seat;

        int people = 666;

        if (people <= seat) {
            System.out.printf("В вагоне есть %d сидячих мест и %d стоячих мест", seat - people, standing);
        }
        if (people > seat && people < sumspace) {
            System.out.printf("В вагоне нет сидячих мест, но есть %d стоячих мест", sumspace - people);
        }
        if (people > sumspace) {
            System.out.printf("В вагоне нет свободных мест, %d человек не помесятятся в вагон", people - sumspace);
        }

    }

    public static void task4() {
        int age = 19;
        if (age >= 18) {
            System.out.println("Поздравляем, вы совершеннолетний");
        } else
            System.out.println("Вы еще не достигли совершеннолетия");
    }

    public static void task5() {
        int age = 19;
        if (age >= 7 && age < 18) {
            System.out.println("Ребенок ходит в школу");
        }
        else
        if (age >= 18 && age < 24) {
            System.out.println("Человек закончил школу и может направиться в университет");

        }
        else
        if (age >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        } else {
            System.out.println("Вы еще не достигли возраста учебы или работы");
        }
    }
    public static void task6() {
        int sumspace = 102;
        int seat = 60;
        int standing = sumspace - seat;

        int people = 150;

        if (people <= seat) {
            System.out.printf("В вагоне есть еще %d сидячих мест и %d стоячих мест", seat - people, standing);
        }
        else if (people > seat && people < sumspace) {
            System.out.printf("В вагоне нет сидячих мест, но есть %d стоячих мест", sumspace - people);
        }
        else if (people > sumspace) {
            System.out.printf("В вагоне нет свободных мест, %d человек не помесятятся в вагон", people - sumspace);
        }

    }
    public static void task7() {
        int age = 26;
        boolean childrenGarden = age >= 2 && age <= 6;
        boolean school = age >= 7 && age <= 18;
        boolean university = age >18 && age <= 24;

        if (childrenGarden)
            System.out.println("Тебе нужно ходить в детский сад");
        else
        if (school)
            System.out.println("Тебе нужно ходить в школу");
        else
        if (university)
            System.out.println("Тебе нужно ходить в университет");
        else
            System.out.println("Тебе нужно ходить на работу");

    }

    public static void task8() {
        int age = 15;
        boolean firstAge = age < 5;
        boolean limAllowedAge = age >= 5 && age <= 14;
        boolean allowedAge = age >= 14;

        if (firstAge)
            System.out.println("Нельзя кататься на аттракционе");
        else
        if (limAllowedAge)
            System.out.println("Можно кататья, но в сопровождении взрослого");

        else
            System.out.println("Можно кататья без взрослого");
    }

    public static void task9() {
        int one = 11;
        int two = 9;
        int three =5;
        boolean maxIsOne = one > two && two > three;
        boolean maxIsTwo = two > one && two > three;
        boolean maxIsThree = three > one && three > two;

        if (maxIsOne)
            System.out.printf("Большее число %d", one);
        else
        if (maxIsTwo)
            System.out.printf("Большее число %d", two);
        else
        if (maxIsThree)
            System.out.printf("Большее число %d", three);
    }
}
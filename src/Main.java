//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }

        System.out.println("Задача 1");

        byte age = 21;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " то он совершенолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + " то он не достиг совершеннолетия, нужно немного подождать.");
        }

        System.out.println("Задача 2");

        byte airTemperature = 6;
        if (airTemperature < 5) {
            System.out.println("На улице " + airTemperature + " градусов, нужно надеть шапку.");
        } else {
            System.out.println("На улице " + airTemperature + " градусов, можно идти без шапки.");
        }

        System.out.println("Задача 3");

        short speed = 63;
        if (speed <= 60) {
            System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно.");
        } else {
            System.out.println("Если скорость " + speed + " км/ч, то прийдется заплатить штраф.");
        }

        System.out.println("Задача 4");

        byte agePerson = 12;
        if (agePerson >= 2 && agePerson <= 6) {
            System.out.println("Если возраст человека равен " + agePerson + ", то ему нужно ходить в детский сад.");
        } else if (agePerson >=7 && agePerson <= 17) {
            System.out.println("Если возраст человека равен " + agePerson + ", то ему нужно ходить в школу.");
        } else if (agePerson >=18 && agePerson <= 24) {
            System.out.println("Если возраст человека равен " + agePerson + ", то его место в университете.");
        } else if (agePerson >24) {
            System.out.println("Если возраст человека равен " + agePerson + ", то ему пора ходить на работу.");
        }

        System.out.println("Задача 5");

        byte ageChild = 7;
        if (ageChild < 5) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему нельзя кататься на аттракционе.");
        }
        if (ageChild >=5 && ageChild < 14) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему можно кататься на аттракционе в сопровождении взрослого.");
        }
        if (ageChild >=14) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему можно кататься на аттракционе без сопровождения взрослого.");
        }

        System.out.println("Задача 6");

        byte seat = 60;
        int totalPlaces = 102;
        int passengers = 100;

        if (passengers <= seat) {
            System.out.println("В вагоне сидячее место.");
        } else {
        if (passengers > seat && passengers <= totalPlaces) {
            System.out.println("В вагоне стоячее место.");
        } else
            System.out.println("В вагоне свободных мест нет.");
        }

        System.out.println("Задача 7");

        int one = 10;
        int two = 15;
        int three = 3;

        if (one > two && one > three) {
            System.out.println(one);
        } else {
            if (two > one && two > three) {
                System.out.println(two);
            } else
                System.out.println(three);
        }
    }
}
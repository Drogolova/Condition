public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1.1");
        int age = 15;
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием");
        }
        if (age < 18) {
            System.out.println("Возраст совершеннолетия ещё не наступил, нужно немного подождать");
        }
        System.out.println("Задание 1.2");
        int age2 = 25;
        if (age2 >= 7 && age2 < 18) {
            System.out.println("Ходит в школу");
        }
        if (age2 >= 18 && age2 < 24) {
            System.out.println("Может отправляться в университет");
        }
        if (age2 >= 24) {
            System.out.println("Пора искать первую работу");
        }

        System.out.println("Задание 1.3");
        int seatTaken = 120;
        int capacity = 102;
        int seats = 60;
        int standingRoom = capacity - seats;
        if (seatTaken <= seats) {
            System.out.println("В вагоне есть сидячие и стоячие места");
        }
        if (seatTaken > seats && seatTaken < capacity) {
            System.out.println("В вагоне есть стоячие места");
        }
        if (seatTaken >= capacity) {
            System.out.println("Вагон полностью забит");}

        System.out.println("Задание 2.1");

        int age3 = 12;
        if (age3 >= 18) {
            System.out.println("Поздравляем с совершеннолетием");
        }
        else {
            System.out.println("Возраст совершеннолетия еще не наступил, нужно немного подождать");
        }
        System.out.println("Задание 2.2");
        int age4 = 25;
        if (age4 >= 24) {
            System.out.println("Пора искать первую работу");
        } else if (age4 >= 18) {
            System.out.println("Может отправляться в университет");
        } else if (age4 >= 7) {
            System.out.println("Ходит в школу");
        } else {
            System.out.println("Садик");
        }
        System.out.println("Задание 2.3");
        int seatTaken1 = 29;
        int capacity1 = 102;
        int seats1 = 60;
        int standingRoom1 = capacity1 - seats1;
        if (seatTaken1 >= capacity1) {
            System.out.println("Мест нет");}
        else if (seatTaken1 >= seats1) {
            System.out.println("Есть только стоячие места");
        }
        else {
            System.out.println("Есть сидячие и стоячие места");
        }
        System.out.println("Задание 3.1");
        int person = 40;
        boolean child = person >= 2 && person <= 6;
        boolean teens = person >= 7 && person <=18;
        boolean youngster = person > 18 && person < 24;
        if (child) {
            System.out.println("Нужно ходить в детский сад");
        } else if (teens) {
            System.out.println("Нужно ходить в школу");
        } else if (youngster) {
            System.out.println("Нужно ходить в университет");
        } else {
            System.out.println("Нужно ходить на работу");
        }


        System.out.println("Задание 3.2");
        int childAge = 100;
        boolean age14 = childAge >= 14;
        boolean age13_5 = childAge >=5;
        if (age14) {
            System.out.println("Может кататься без сопровождения взрослого");
        } else if (age13_5) {
            System.out.println("Может кататься только в сопровождении взрослого");
        } else {
            System.out.println("Не может кататься на аттракционе");
        }

        System.out.println("Задание 3.3");
        int one = 1;
        int two = 2;
        int free = 3;
        if (one > two && one > free) {
            System.out.println(one);}
        else if (two > free) {
            System.out.println(two);
        } else {
            System.out.println(free);
        }

    }
}

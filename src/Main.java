import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void printLeapYear(int year){
        if (year % 4 == 0 && year %  100 > 0){
            System.out.println(year + " год является високосным");
        }
        else if (year % 400 == 0){
            System.out.println(year + " год является високосным");
        }
        else{
            System.out.println(year + " год не является високосным");
        }
    }
    public static void task1() {
        System.out.println("Задача 1");
        int currentYear = 2022;
        printLeapYear(currentYear);

    }
    public static void printAppVersion(int operatingSystem, int deviceYear){
        int currentYear = LocalDate.now().getYear();
        if (operatingSystem == 0 && deviceYear >= currentYear){
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else if (operatingSystem == 1 && deviceYear >= currentYear){
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        else if (operatingSystem == 0 && deviceYear < currentYear){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        else{
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }
    public static void task2() {
        System.out.println("Задача 2");
        int clientOS = 0;
        int clientDeviceYear = 2015;
        printAppVersion(clientOS, clientDeviceYear);

    }
    public static void countDays(int distance){
        int days = 1;
        if (distance < 20){
            System.out.println("Потребуется дней: " + days);
        }
        else if (distance >= 20 && distance < 60){
            days += 1;
            System.out.println("Потребуется дней: " + days);
        }
        else if (distance >= 60 && distance < 100) {
            days += 2;
            System.out.println("Потребуется дней: " + days);
        }
        else{
            System.out.println("Свыше 100 км доставки нет");
        }
    }
    public static void task3() {
        System.out.println("Задача 3");
        int deliveryDistance = 95;
        countDays(deliveryDistance);

    }

}
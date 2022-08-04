public class Main {
    public static void main(String[] args) {
        System.out.println("1 задача:");
        {
            int clientOS = 1;
            if (clientOS == 1) ;
            {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
        System.out.println("\n" + "2 задача:");

        {
            int clientOS = 1;
            int clientDeviceYear = 2014;
            if (clientOS == 1) {
                if (clientDeviceYear < 2015)

                    System.out.println("Установите облегченную версию приложения для Android по ссылке");

                else System.out.println("Установите версию приложения для Android по ссылке");}
        }
        System.out.println("\n" + "3 задача:");
        {
            int year = 2022;
            if (year % 400 == 0)
            System.out.println(year + " год является високосным.");
            else if ((year % 4 == 0) && (year % 100 != 0)) {
                System.out.println(year + " год является високосным.");
            }else System.out.println(year + " год не является високосным.");
        }

            }
        }
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
        System.out.println("\n" + "4 задача:");
        {
            int deliveryDistance = 95;
            if (deliveryDistance <= 20) System.out.println("Потребуется дней: " + 1);
            if ((20 < deliveryDistance) && (deliveryDistance <= 60)) System.out.println("Потребуется дней: " + 2);
            if ((60 < deliveryDistance) && (deliveryDistance <= 100)) System.out.println("Потребуется дней: " + 3);
            }
        }
}
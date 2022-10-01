public class Main {
    public static void main(String[] args) {
        int year = 1773;
        leapYear(year);
        if (leapYear(year)) {
            System.out.println(year + " високосный год");
        } else {
            System.out.println(year + " не високосный год");
        }
        int currentYear = 2016; //int currentYear = LocalDate.now().getYear();
        boolean typeOS = true; // false — iOS или true — Android
        installationVersion(typeOS, currentYear);

        int deliveryDistance = 95; // Дистанция до клиента
        System.out.println("Потребуется дней: " + numDay(deliveryDistance) + " срок доставки");
    }

    public static Boolean leapYear(int year) { // Определение вида года висакосный/не висакосный
        boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
        if (isLeapYear) {
            return true;
        } else {
            return false;
        }
    }

    public static void installationVersion(boolean typeOS, int currentYear) { // Определение типа установки ОС
        if (typeOS) {
            if (currentYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        } else {
            if (currentYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        }
    }

    public static int numDay(int deliveryDistance) { // Вычисление количества дней доставки карты банка
        if (deliveryDistance <= 20) {
            return 1;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            return 2;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            return 3;
        } else {
            return 0; // В случай ошибки  >100
        }
    }
}
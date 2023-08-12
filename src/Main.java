public class Main {
    public static void printSeparator () {
        System.out.println("===============");
    }

    public static void main(String[] args) {
        printSeparator();
        int year = 2023;
        // определение високосного года
        determineYear(year);
        int clientDevice = 2010;
        // год выпуска телефона
        int modelDevice = 1;
        // модель телефона 0 - IOS; 1 - Android
        determineDevice(clientDevice, modelDevice);
        int deliveryDistance = 5;
        // расстояние до клиента
        determinesDelivery(deliveryDistance);

    }

    public static void determineYear(int variableYear) {
        System.out.println("Задача 1");
        if (variableYear % 400 == 0) {
            System.out.println(variableYear + " год являтся високосным");

    } else if (variableYear % 4 == 0 && variableYear % 100 != 0) {
        System.out.println(variableYear + " год являтся високосным");
    } else {
            System.out.println(variableYear + " год не является високосным");
        }
        printSeparator();
    }
    public static void determineDevice(int variableDeviceYear, int variableDeviceModel) {
        System.out.println("Задача 2");
        if (variableDeviceYear < 2015 && variableDeviceModel == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (variableDeviceYear < 2015 && variableDeviceModel == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (variableDeviceYear >= 2015 && variableDeviceModel == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (variableDeviceYear >= 2015 && variableDeviceModel == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        printSeparator();
        }

    public static void determinesDelivery(int variableDeliveryDistant) {
        System.out.println("Задача 3");
        int day = 1;
        if (variableDeliveryDistant <= 20) {
            System.out.println("Потребуется дней: " + day);
        } else if (variableDeliveryDistant >= 20 && variableDeliveryDistant <= 60) {
            System.out.println("Потребуется дней: " + (day + 1));
        } else if (variableDeliveryDistant >= 60 && variableDeliveryDistant <= 100) {
            System.out.println("Потребуется дней: " + (day + 2));
        } else if (variableDeliveryDistant > 100) {
            System.out.println("Доставки нет");
        }
        printSeparator();
    }
    }


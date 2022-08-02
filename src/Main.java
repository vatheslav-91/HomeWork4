public class Main {
    public static void main(String[] args) {

        int deliveryDistance = 95;
        if (deliveryDistance < 20) {
            System.out.println("Доставка за 1 день");
        }
        if (deliveryDistance < 60) {
            System.out.println("Доставка за 2 дня");
        }
        if (deliveryDistance < 100) {
            System.out.println("Доставка за 3 дня");
        }

        int monthNumber = 12;
        switch (monthNumber){
            case 12:
            case 1:
            case 2:
                    System.out.println("Зимний месяц");
                    break;
            case 3:
            case 4:
            case 5:
                        System.out.println("Весений месяц");
                        break;
            case 6:
            case 7:
            case 8:
                            System.out.println("Летний месяц");
                            break;
            case 9:
            case 10:
            case 11:
                                System.out.println("Осенний месяц");
            default:
                System.out.println("Нет такого месяца");
        }
    }
}




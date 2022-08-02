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
    }
}




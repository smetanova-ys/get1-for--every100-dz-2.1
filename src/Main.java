public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int transferAmount = 500;
        int bonus;
        int totalAmount;

        bonus = transferAmount > 1000 ? transferAmount / 100 : 0;

        totalAmount = balance + transferAmount + bonus;
        System.out.println("Количество бонусных рублей: " + bonus);
        System.out.println("У Вас на счету: " + totalAmount);

    }
}

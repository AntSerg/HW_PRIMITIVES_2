public class Main {
    public static void main(String[] args) {
        int initialBalance = 300;
        int cash = 1250;
        int bonus = 0;
        int finalBalance = initialBalance + cash;
        if (cash > 1000) {
            bonus = cash / 100;
            finalBalance += bonus;
        }
        System.out.println("Итоговый баланс: " + finalBalance + " рублей\nНачислено бонусов: " + bonus);
    }
}
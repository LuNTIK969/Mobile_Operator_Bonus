public class Main {
    public static void main(String[] args) {

        int balance = 354;
        int up = 8_700;
        int bonus;

        if (up > 1_001) {
            bonus = up *1 / 100;
        }
        else {
            bonus = 0;
        }

        int F_up = up + bonus;
        int F_balance = balance + F_up;

        System.out.println("Баланс пополнен на " + up + "р. \nТак как у нас проходит акция \"Пополни баланс от 1000р. единовременно и получи подарок!\"," +
                " сумма вашего пополения увеличена на " + bonus + "р. \nИтоговое пополнение баланса " + F_up + "р. \nТекущий баланс: " + F_balance + "р.");
    }
}
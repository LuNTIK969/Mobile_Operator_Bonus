public class Main {
    public static void main(String[] args) {

        int balance = 354;
        int up = 8_700;
        int bonus;

        if (up > 1_001) {
            bonus = up * 1 / 100;
        } else {
            bonus = 0;
        }

        int finalUp = up + bonus;
        int finalBalance = balance + finalUp;

        System.out.println("Баланс пополнен на " + up + "р. \nТак как у нас проходит акция \"Пополни баланс от 1000р. единовременно и получи подарок!\"," +
                " сумма вашего пополения увеличена на " + bonus + "р. \nИтоговое пополнение баланса " + finalUp + "р. \nТекущий баланс: " + finalBalance + "р.");
    }
}
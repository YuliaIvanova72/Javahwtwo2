public class Main {
    public static void main(String[] args) {

        int customerAccount = 200;
        int depositAmount = 1000;
        int amountOnAccount = (customerAccount + depositAmount);


        int bonusRubles;
        if (depositAmount >= 1000) {
            bonusRubles = (depositAmount / 100);
        } else {
            bonusRubles = 0;
        }
        int grandTotal = (customerAccount + depositAmount + bonusRubles);

        System.out.println("Счёт: " + grandTotal);
        System.out.println("Бонусные рубли: " + bonusRubles);

    }
}

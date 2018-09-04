package DZ2_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

class Shop {
    private static int cassa = 0;

    static int getCassa() {
        return cassa;
    }

    static void setCassa(int cassa) {
        Shop.cassa = cassa;
    }

    private Scanner scannerShop = new Scanner(System.in);

    void toChoose() {
        for (; ; ) {
            System.out.println();
            System.out.println("Выберите пункт меню:" + "\n" +
                    "1. Клиент" + "\n" +
                    "2. Администратор" + "\n" +
                    "3. Выход");
            System.out.println();
            try {
                switch (scannerShop.nextInt()) {
                    default:
                        break;
                    case 1:
                        toChooseClient();
                    case 2:
                        toChooseAdmin();
                    case 3:
                        System.exit(0);
                }
            } catch (InputMismatchException i) {
                toChoose();
            }
        }
    }


    private void toChooseClient() {
        Client client = new Client();
        if (Administrator.blackList.contains(Client.getNameClient())) {
            System.out.println("Вы в \"черном списке\"");
            toChooseClient();
        }
        for (; ; ) {
            System.out.println();
            System.out.println("Выберите пункт меню:" + "\n" +
                    "1. Сделать заказ" + "\n" +
                    "2. Оплатить" + "\n" +
                    "3. Выход");
            System.out.println();
            try {
                switch (scannerShop.nextInt()) {
                    default:
                        toChoose();
                    case 1:
                        client.toOrder();
                        break;
                    case 2:
                        client.toPay();
                        toChooseAdmin();
                        break;
                    case 3:
                        System.exit(0);
                        break;
                }
            } catch (InputMismatchException i) {
                toChooseClient();
            }
        }
    }

    private void toChooseAdmin() {
        Administrator administrator = new Administrator();
        System.out.println();
        System.out.println("Выберите пункт меню:" + "\n" +
                "1. Добавить товар в магазин" + "\n" +
                "2. Зарегистрировать продажу" + "\n" +
                "3. Выход");
        System.out.println();
        try {
            switch (scannerShop.nextInt()) {
                case 1:
                    administrator.toAddGoodsToShop();
                    break;
                case 2:
                    administrator.toRegisterSale();
                    break;
                case 3:
                    System.exit(0);
                    break;
            }
            toChoose();
        } catch (InputMismatchException i) {
            toChooseAdmin();
        }
    }
}
package DZ2_Exceptions;

import java.util.InputMismatchException;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

class Shop {
    private static int cassa = 0;

    public static int getCassa() {
        return cassa;
    }

    public static void setCassa(int cassa) {
        Shop.cassa = cassa;
    }

    Scanner scannerShop = new Scanner(System.in);

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
//                        Client client = new Client();
//                        System.out.println();
//                        System.out.println("Выберите пункт меню:" + "\n" +
//                                "1. Сделать заказ" + "\n" +
//                                "2. Оплатить" + "\n" +
//                                "3. Выход");
//                        System.out.println();
//                        switch (scannerShop.nextInt()) {
//                            case 1:
//                                client.toOrder();
//                                break;
//                            case 2:
//                                client.toPay();
//                                break;
//                            case 3:
//                                System.exit(0);
//                        }
//                        break;
                    case 2:
                        Administrator administrator = new Administrator();
                        System.out.println();
                        System.out.println("Выберите пункт меню:" + "\n" +
                                "1. Добавить товар в магазин" + "\n" +
                                "2. Зарегистрировать продажу" + "\n" +
                                "3. Добавить покупателя в черный список" + "\n" +
                                "4. Выход");
                        System.out.println();
                        switch (scannerShop.nextInt()) {
                            case 1:
                                administrator.toAddGoodsToShop();
                                break;
                            case 2:
                                administrator.toRegisterSale();
                                break;
                            case 3:
                                administrator.toAddToTheBlackList();
                                break;
                            case 4:
                                System.exit(0);
                        }
                        break;
                    case 3:
                        System.exit(0);
                }
            } catch (InputMismatchException i) {
                toChoose();
            }
        }
    }

//    Set<Client> clients = new LinkedHashSet<>();

    void toChooseClient() {
        Client client = new Client();
//        if (clients.add(client)) {

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
                            break;
                        case 3:
                            System.exit(0);
                            break;
                    }
                } catch (InputMismatchException i) {
                    toChooseClient();
                }
            }
//        }
//        for (; ; ) {
//            System.out.println();
//            System.out.println("Выберите пункт меню:" + "\n" +
//                    "1. Сделать заказ" + "\n" +
//                    "2. Оплатить" + "\n" +
//                    "3. Выход");
//            System.out.println();
//            try {
//                switch (scannerShop.nextInt()) {
//                    default:
//                        toChoose();
//                    case 1:
//                        client.toOrder();
//                        break;
//                    case 2:
//                        client.toPay();
//                        break;
//                    case 3:
//                        System.exit(0);
//                        break;
//                }
//            } catch (InputMismatchException i) {
//                toChooseClient();
//            }
//        }


    }
}
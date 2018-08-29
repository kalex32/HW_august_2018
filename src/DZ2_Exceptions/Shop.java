package DZ2_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

class Shop {

    void toChoose() {
        for (; ; ) {
            System.out.println("Выберите пункт меню:" + "\n" +
                    "1. Клиент" + "\n" +
                    "2. Администратор" + "\n" +
                    "3. Выход");

            Scanner scanner = new Scanner(System.in);
            try {
                switch (scanner.nextInt()) {
                    case 1:
                        Client client = new Client();
                        System.out.println("Выберите пункт меню:" + "\n" +
                                "1. Сделать заказ" + "\n" +
                                "2. Оплатить" + "\n" +
                                "3. Выход");
                        switch (scanner.nextInt()) {
                            case 1:
                                client.toOrder();
                            case 2:
                                client.toPay();
                            case 3:
                                System.exit(0);
                        }
                    case 2:
                        System.out.println("Выберите пункт меню:" + "\n" +
                                "1. Добавить товар в магазин" + "\n" +
                                "2. Зарегистрировать продажу" + "\n" +
                                "3. Добавить покупателя в черный список" + "\n" +
                                "4. Выход");
                        Administrator administrator = new Administrator();
                        switch (scanner.nextInt()) {
                            case 1:
                                administrator.toAddGoodsToShop();
                            case 2:
                                administrator.toRegisterSale();
                            case 3:
                                administrator.toAddToTheBlackList();
                            case 4:
                                System.exit(0);
                        }
                    case 3:
                        System.exit(0);
                }
            } catch (InputMismatchException i) {
                toChoose();
            }
        }
    }
}
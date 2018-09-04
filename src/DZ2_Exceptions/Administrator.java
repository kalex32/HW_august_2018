package DZ2_Exceptions;

import java.util.ArrayList;
import java.util.Scanner;

import static DZ2_Exceptions.Client.cart;

class Administrator implements Employees {
    private String nameAdmin;
    static ArrayList<String> blackList = new ArrayList<>();


    {
        System.out.println("Введите имя Администратора:");
    }

    private Scanner scannerAdmin = new Scanner(System.in);

    Administrator() {
        this.nameAdmin = scannerAdmin.nextLine();
    }

    String getNameAdmin() {
        return nameAdmin;
    }

//    public static ArrayList<String> getBlackList() {
//        return blackList;
//    }

    static ArrayList<Product> products = new ArrayList<>();

    @Override
    public void toAddGoodsToShop() {
        for (; ; ) {
            Product product = new Product();
            product.setId(product.getId() + products.size());
//            product.quantity();
            product.packingSize();
            product.price();
            products.add(product);
            for (Product p : products) System.out.println(p.toString());
            System.out.println();
            System.out.println("Добавить еще товар?:" + "\n" +
                    "1. Добавить" + "\n" +
                    "2. Нет");
            if (scannerAdmin.nextInt() != 1) break;
        }
    }

    @Override
    public void toRegisterSale() {
        System.out.println("Регистрация продажи");
        System.out.println();
        System.out.println("Сумма покупок клиента " + Client.getNameClient() + ": " + Client.sumCart(cart));
        System.out.println();
        System.out.println("Сумма покупок клиента " + Client.getNameClient() + ": " + Shop.getCassa());
        if (Client.sumCart(cart) - Shop.getCassa() <= 0) {
            System.out.println("Поздравляем с покупкой!!!");
            Shop.setCassa(0);
        } else System.out.println("Вы не выполнили условия сделки, добавляем Вас в \"черный список\" ");
        toAddToTheBlackList(blackList);
    }

    static void toAddToTheBlackList(ArrayList<String> blacklist) {
        blacklist.add(Client.getNameClient());
    }

//    static ArrayList p() {
//        for (Product p : products) System.out.println(p.toString());
//        return;
//    }
}

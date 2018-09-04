package DZ2_Exceptions;

import java.util.ArrayList;
import java.util.Scanner;

import static DZ2_Exceptions.Client.cart;

class Administrator implements Employees {
    private String nameAdmin;
    static ArrayList<String> blackList;


    {
        System.out.println("Введите имя Администратора:");
    }

    private Scanner scannerAdmin = new Scanner(System.in);

    Administrator() {
        this.nameAdmin = scannerAdmin.nextLine();
        blackList = new ArrayList<>();
    }

    String getNameAdmin() {
        return nameAdmin;
    }


    static ArrayList<Product> products = new ArrayList<>();

    @Override
    public void toAddGoodsToShop() {
        for (; ; ) {
            Product product = new Product();
            product.setId(product.getId() + products.size());
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

    private static void toAddToTheBlackList(ArrayList<String> blacklist) {
        blacklist.add(Client.getNameClient());
    }
}

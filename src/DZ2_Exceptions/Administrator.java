package DZ2_Exceptions;

import java.util.ArrayList;
import java.util.Scanner;

class Administrator implements Employees {
    private String nameAdmin;

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

    ArrayList<Product> products = new ArrayList<>();

    @Override
    public void toAddGoodsToShop() {
        for (; ; ) {
            Product product = new Product();
            product.setId(product.getId()+products.size());
            product.quantity();
            product.packingSize();
            product.price();
            products.add(product);
            for (Product p : products) {
                System.out.println(p.toString());
            }
            System.out.println();
            System.out.println("Добавить еще товар?:" + "\n" +
                    "1. Добавить" + "\n" +
                    "2. Нет");
            if (scannerAdmin.nextInt() != 1) break;
        }
    }

    @Override
    public void toRegisterSale() {

    }

    void toAddToTheBlackList() {

    }
}

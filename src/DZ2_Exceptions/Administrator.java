package DZ2_Exceptions;

import java.util.ArrayList;
import java.util.Scanner;

class Administrator implements Employees{
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

    @Override
    public void toAddGoodsToShop() {
        ArrayList<Product> products = new ArrayList<>();
        for (; ; ) {
            Product product = new Product();
            product.id();
            product.quantity();
            product.packingSize();
            products.add(product);
            for (Product p : products) {
                System.out.println(p.toString());
            }
            System.out.println("Добавить еще товар?:" + "\n" +
                    "1. Добавить" + "\n" +
                    "2. Нет");
            if (scannerAdmin.nextInt() != 1)break;
        }
    }

    @Override
    public void toRegisterSale() {

    }

    void toAddToTheBlackList(){

    }
}

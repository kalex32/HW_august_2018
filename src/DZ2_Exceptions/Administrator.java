package DZ2_Exceptions;

import java.util.ArrayList;
import java.util.Arrays;
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
        Product product = new Product();
        product.quantity();
        product.packingSize();
        products.add(product);
        System.out.println(products.toString());

    }

    @Override
    public void toRegisterSale() {

    }

    void toAddToTheBlackList(){

    }
}

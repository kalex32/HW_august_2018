package DZ2_Exceptions;

import java.util.Scanner;

class Administrator implements Employees{
    private String nameAdmin;

    {
        System.out.println("Введите имя Администратора:");
    }

    private Scanner scanner = new Scanner(System.in);

    Administrator() {
        this.nameAdmin = scanner.nextLine();
    }

    String getNameAdmin() {
        return nameAdmin;
    }

    @Override
    public void toAddGoodsToShop() {
        Product product = new Product();
        product.quantity();
        product.packingSize();
        product.shipping();

    }

    @Override
    public void toRegisterSale() {

    }

    void toAddToTheBlackList(){

    }
}

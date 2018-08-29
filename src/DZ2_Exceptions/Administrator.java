package DZ2_Exceptions;

import java.util.Scanner;

class Administrator implements Employees{
    String nameAdmin;

    {
        System.out.println("Введите имя Админитсратора:");
    }

    private Scanner scanner = new Scanner(System.in);

    Administrator() {
        this.nameAdmin = scanner.nextLine();
    }

    @Override
    public void toAddGoodsToShop() {

    }

    @Override
    public void toRegisterSale() {

    }

    void toAddToTheBlackList(){

    }
}

package DZ2_Exceptions;

import java.util.Scanner;

class Client implements Clients{
    private String nameClient;

    {
        System.out.println("Введите имя");
    }

   private Scanner scannerClient = new Scanner(System.in);

    Client() {
        this.nameClient = scannerClient.nextLine();
    }

    public String getNameClient() {
        return nameClient;
    }

    @Override
    public void toOrder() {

    }

    @Override
    public void toPay() {

    }
}

package DZ2_Exceptions;

import java.util.Scanner;

class Client implements Clients{
    private String nameClient;

    {
        System.out.println("Введите имя");
    }

   private Scanner scanner = new Scanner(System.in);

    public Client() {
        this.nameClient = scanner.nextLine();
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

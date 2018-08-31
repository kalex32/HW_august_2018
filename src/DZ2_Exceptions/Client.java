package DZ2_Exceptions;

import java.util.ArrayList;
import java.util.Scanner;

import static DZ2_Exceptions.Administrator.products;

class Client implements Clients {
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

    ArrayList<Product> cart = new ArrayList<>();
//    Administrator administrator = new Administrator();

    @Override
    public void toOrder() {
        try {
            for (; ; ) {
                System.out.println("Выберите, пожалуйста, товар:");
                for (Product p : products) System.out.println(p.toString());
                System.out.println();
                cart.add(products.get(scannerClient.nextInt() - 1));
                System.out.println("Ваша корзина:");
                System.out.println();
                for (Product p : cart) System.out.println(p.toString());
                System.out.println("Хотите добавить еще товар?:" + "\n" +
                        "1. Добавить" + "\n" +
                        "2. Нет");
                if (scannerClient.nextInt() != 1) break;
            }
        } catch (IndexOutOfBoundsException i){
            toOrder();
        }
    }
        @Override
        public void toPay () {

        }
    }

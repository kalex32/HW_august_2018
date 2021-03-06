package DZ2_Exceptions;

import java.util.ArrayList;
import java.util.Scanner;

import static DZ2_Exceptions.Administrator.products;

class Client implements Clients {
    private static String nameClient;
    static ArrayList<Product> cart;

    {
        System.out.println("Введите имя");
    }

    private Scanner scannerClient = new Scanner(System.in);

    Client() {
        nameClient = scannerClient.nextLine();
        cart = new ArrayList<>();

    }

    static String getNameClient() {
        return nameClient;
    }

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
                System.out.println();
                System.out.println("Общая сумма заказа:");
                System.out.println(sumCart(cart));
                System.out.println();
                System.out.println("Хотите добавить еще товар?:" + "\n" +
                        "1. Добавить" + "\n" +
                        "2. Нет");
                if (scannerClient.nextInt() != 1) break;
            }
        } catch (IndexOutOfBoundsException i) {
            toOrder();
        }
    }

    @Override
    public void toPay() {
        System.out.println("Сумма Ваших покупок: " + sumCart(cart));
        System.out.println("Введите сумму оплаты:");
        Shop.setCassa(Shop.getCassa() + scannerClient.nextInt());
        System.out.println("Добавлять будете?");
        if (scannerClient.next().equals("да")) Shop.setCassa(Shop.getCassa() + scannerClient.nextInt());

    }

    static int sumCart(ArrayList<Product> cart) {
        int sum = 0;
        for (Product i : cart) {
            sum += i.getPrice();
        }
        return sum;
    }
}

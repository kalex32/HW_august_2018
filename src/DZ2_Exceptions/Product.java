package DZ2_Exceptions;

import java.util.Scanner;

class Product implements Goods {
    private String productName;
    private int quantity;
    private int packingSize;
    private String shipping;

    {
        System.out.println("Введите наименование товара:");
    }

    private Scanner scanner = new Scanner(System.in);

    Product() {
        this.productName = scanner.nextLine();
    }

    String getProductName() {
        return productName;
    }

    private void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    int getQuantity() {
        return quantity;
    }

    int getPackingSize() {
        return packingSize;
    }

    private void setPackingSize(int packingSize) {
        this.packingSize = packingSize;
    }

    String getShipping() {
        return shipping;
    }

    private void setShipping(String shipping) {
        this.shipping = shipping;
    }

    @Override
    public void quantity() {
        System.out.println("Введите количество товара:");
        setQuantity(scanner.nextInt());
    }

    @Override
    public void packingSize() {
        System.out.println("Введите размер упаковки:");
        setPackingSize(scanner.nextInt());
    }

    @Override
    public void shipping() {
        System.out.println("Введите регионы доставки:");
        setShipping(scanner.nextLine());
    }
}

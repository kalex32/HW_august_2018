package DZ2_Exceptions;

import java.util.Scanner;

class Product implements Goods {
    private int id = 1;
    private String productName;
    private int quantity;
    private int packingSize;

    {
        System.out.println("Введите наименование товара:");
    }

    private Scanner scannerProduct = new Scanner(System.in);

    Product() {
        this.productName = scannerProduct.nextLine();
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

    int getId() {
        return id;
    }

    void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Товар " + getId() + " (" +
                "наименование='" + getProductName() + '\'' +
                ", количество=" + getQuantity() +
                ", упаковка=" + getPackingSize() +
                ')';
    }


    @Override
    public void quantity() {
        System.out.println("Введите количество товара:");
        setQuantity(scannerProduct.nextInt());
    }

    @Override
    public void packingSize() {
        System.out.println("Введите размер упаковки:");
        setPackingSize(scannerProduct.nextInt());
    }

}

package DZ2_Exceptions;

import java.util.Scanner;

class Product implements Goods {
    private int id = 1;
    private String productName;
    private int packingSize;
    private int price;

    {
        System.out.println("Введите наименование товара:");
    }

    private Scanner scannerProduct = new Scanner(System.in);

    Product() {
        this.productName = scannerProduct.nextLine();
    }

    private String getProductName() {
        return productName;
    }

    private int getPackingSize() {
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

    int getPrice() {
        return price;
    }

    private void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Товар " + getId() + " (" +
                "наименование='" + getProductName() + '\'' +
                ", упаковка=" + getPackingSize() +
                ", цена=" + getPrice() +
                ')';
    }

    @Override
    public void packingSize() {
        System.out.println("Введите размер упаковки:");
        setPackingSize(scannerProduct.nextInt());
    }

    @Override
    public void price() {
        System.out.println("Введите стоимость товара:");
        setPrice(scannerProduct.nextInt());
    }
}

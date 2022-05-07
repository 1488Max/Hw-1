import lombok.Data;

@Data
public class Product {

private int amountOfSale;
private double price;
private double salePrice;

    public Product(int amountOfSale, double price, double salePrice) {

        this.amountOfSale = amountOfSale;
        this.price = price;
        this.salePrice = salePrice;
    }

}

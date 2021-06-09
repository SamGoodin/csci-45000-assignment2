package Assignment2.client;

public class Item {

    String description;
    String title;
    String seller;
    int quantity;
    Float price;

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public String getTitle() {
        return title;
    }

    public String getSeller() {
        return seller;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getPrice() {
        return ("$" + price.toString());
    }

}

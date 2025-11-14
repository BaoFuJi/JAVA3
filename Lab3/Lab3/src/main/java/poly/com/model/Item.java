package poly.com.model;

public class Item {
    private String name;
    private String image;   // đường dẫn hoặc URL ảnh
    private double price;
    private double discount;

    public Item() {
    }

    public Item(String name, String image, double price, double discount) {
        this.name = name;
        this.image = image;
        this.price = price;
        this.discount = discount;
    }

    // Getter & Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    // Hàm tính giá sau giảm
    public double getFinalPrice() {
        return price - (price * discount);
    }
}

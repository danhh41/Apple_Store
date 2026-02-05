package V1;

public class Mac {

    private String id;
    private String name;
    private double price;
    private int quantity;
    private String description;
    private String categoryId;
    private String chip;
    private int ram;
    private int storage;

    public Mac(String id, String name, double price, int quantity,
               String description, String categoryId,
               String chip, int ram, int storage) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.description = description;
        this.categoryId = categoryId;
        this.chip = chip;
        this.ram = ram;
        this.storage = storage;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getChip() {
        return chip;
    }

    public void setChip(String chip) {
        this.chip = chip;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public double calculateDiscountedPrice(double percentage) {
        return price - price * percentage / 100;
    }

    public boolean isStockAvailable() {
        return quantity > 5;
    }

    public String getInfo() {
        return "Mac{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", chip='" + chip + '\'' +
                ", ram=" + ram +
                ", storage=" + storage +
                '}';
    }
}

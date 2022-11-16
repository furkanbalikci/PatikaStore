public class Notebook {
    private int id;
    private double price;
    private int discount;
    private int stockQuantity;
    private String name;
    private String brandName;
    private int ram;
    private int memorySize;
    private double screenSize;

    public Notebook(int id, double price, int stockQuantity, String name, String brandName, int ram, int memorySize, double screenSize) {
        this.id = id;
        this.price = price;
        this.stockQuantity = stockQuantity;
        this.name = name;
        this.brandName = brandName;
        this.ram = ram;
        this.memorySize = memorySize;
        this.screenSize = screenSize;
    }

    public String print(){
        return (getId() + " " + getName() + " " + getPrice() + " " + getBrandName() + " " + getMemorySize() + " " + getScreenSize() + " " + getRam());
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }
}

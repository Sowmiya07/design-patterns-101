package patterns.facade.subsystem;

public class Item {
    private int code;
    private String name;
    private int quantity;

    public Item(int code, int quantity) {
        this.code = code;
        this.quantity = quantity;
    }

    public Item(int code, String name, int quantity) {
        this.code = code;
        this.name = name;
        this.quantity = quantity;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Item{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}

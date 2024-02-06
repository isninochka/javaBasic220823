package lessons.lesson24.sklad.entity;

public class Product {

    private int id;
    private String name;
    private int count;

    private int category;

    public Product(int id, String name, int count, int category) {
        this.id = id;
        this.name = name;
        this.count = count;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

    public int getCategory() {
        return category;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", count=" + count +
                ", category=" + category +
                '}';
    }
}

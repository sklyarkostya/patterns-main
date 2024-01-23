package clothes;

public abstract class Clothes {
    private final String name;
    private final Integer max_price;

    public Clothes(String name, Integer max_price) {
        this.name = name;
        this.max_price = max_price;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return max_price;
    }
}

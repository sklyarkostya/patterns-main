package clothes_case;

public abstract class Clothes_case {
    private final String name;
    private final Integer price;
    private final String sale;

    public Clothes_case(String name, Integer price, String sale){
        this.name = name;
        this.price = price;
        this.sale = sale;
    }

    public String getName() {return name;}

    public Integer getPrice() {return price;}

    public String getSale() {return sale;}
}

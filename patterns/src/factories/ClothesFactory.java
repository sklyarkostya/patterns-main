package factories;

import clothes.Clothes;
import clothes.Shoes;
import clothes.Trousers;

public class ClothesFactory {
    public Clothes createTrousers() { return new Trousers(); }

    public Clothes createShoes() {
        return new Shoes();
    }
}

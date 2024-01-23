import clothes_case.Discount_shoes;
import factories.ClothesFactory;
import notifications.AdminNotifications;
import notifications.CustomerNotifications;
import notifications.StaffNotifications;
import observers.Observer;

public class Main {
    public static void main(String[] args) {
        ClothesFactory clothesFactory = new ClothesFactory();
        Promotion promotion = new Promotion();

        Observer customerNotifications = new CustomerNotifications("Kostya");
        Observer staffNotifications = new StaffNotifications(1);
        Observer adminNotifications = new AdminNotifications();

        System.out.println("-----Add observers-----");
        promotion.addObserver(customerNotifications);
        promotion.addObserver(staffNotifications);
        promotion.addObserver(adminNotifications);

        System.out.println("-----Add clothes-----");
        promotion.addClothes(clothesFactory.createShoes());
        promotion.addClothes_case(new Discount_shoes());

        System.out.println("-----Remove observer-----");
        promotion.removeObserver(adminNotifications);
    }
}
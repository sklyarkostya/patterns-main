import factories.InsuranceFactory;
import insurance_case.Car_stolen;
import notifications.AdminNotifications;
import notifications.CustomerNotifications;
import notifications.StaffNotifications;
import observers.Observer;

public class Main {
    public static void main(String[] args) {
        InsuranceFactory insuranceFactory = new InsuranceFactory();
        Accident accident = new Accident();

        Observer customerNotifications = new CustomerNotifications("John");
        Observer staffNotifications = new StaffNotifications(1);
        Observer adminNotifications = new AdminNotifications();

        System.out.println("-----Add observers-----");
        accident.addObserver(customerNotifications);
        accident.addObserver(staffNotifications);
        accident.addObserver(adminNotifications);

        System.out.println("-----Add info-----");
        accident.addInsurance(insuranceFactory.createKASKO());
        accident.addInsurance_case(new Car_stolen());

        System.out.println("-----Remove observer-----");
        accident.removeObserver(adminNotifications);

        System.out.println("-----Complete order-----");
        accident.calculateInsurance();
    }
}
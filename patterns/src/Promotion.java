import clothes.Clothes;
import clothes.Clothes;
import insurance_case.Insurance_case;
import observers.Observable;
import observers.Observer;

import java.util.ArrayList;
import java.util.List;

public class Accident implements Observable {

    private final List<Observer> observers = new ArrayList<>();
    private Clothes clothes;

    private Clothes_case clothes_case;

    public void addClothes(Clothes clothes) {
        this.clothes = clothes;
        notifyObservers(String.format("Insurance type is %s", clothes.getName()));
    }

    public void addClothes_case(Clothes_case clothes_case) {
        this.clothes_case = clothes_case;
        notifyObservers(String.format("Accident type is %s", clothes_case.getName()));
    }


    public void calculateInsurance() {
        notifyObservers("The final insurance payment");
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.notify(message);
        }
    }
}

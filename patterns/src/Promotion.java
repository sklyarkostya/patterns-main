import clothes.Clothes;
import clothes_case.Clothes_case;
import observers.Observable;
import observers.Observer;

import java.util.ArrayList;
import java.util.List;

public class Promotion implements Observable {

    private final List<Observer> observers = new ArrayList<>();
    private Clothes clothes;

    private Clothes_case clothes_case;

    public void addClothes(Clothes clothes) {
        this.clothes = clothes;
        notifyObservers(String.format("Clothes type is %s", clothes.getName()));
    }

    public void addClothes_case(Clothes_case clothes_case) {
        this.clothes_case = clothes_case;
        notifyObservers(String.format("The discount percentage is as follows %s", clothes_case.getSale()));
    }

    public void calculatePrice() {
        notifyObservers("The final clothing cost");
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

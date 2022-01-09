package observer.simple;

import java.util.ArrayList;
import java.util.List;

public class SimpleSubject implements Subject {

  private final List<Observer> observers;
  private int value;

  public SimpleSubject() {
    this.observers = new ArrayList<>();
  }

  @Override
  public void registerObserver(Observer o) {
    observers.add(o);
  }

  @Override
  public void removeObserver(Observer o) {
    observers.remove(o);
  }

  @Override
  public void notifyObservers() {
    observers.forEach(observer -> observer.update(value));
  }

  public void setValue(int value) {
    this.value = value;
    notifyObservers();
  }
}

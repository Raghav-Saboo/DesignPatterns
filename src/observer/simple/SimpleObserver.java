package observer.simple;

public class SimpleObserver implements Observer {

  private int value;
  private Subject subject;

  public SimpleObserver(Subject subject) {
    this.subject = subject;
    subject.registerObserver(this);
  }

  @Override
  public void update(int value) {
    this.value = value;
    display();
  }

  public void display() {
    System.out.println("Value: " + value);
  }
}

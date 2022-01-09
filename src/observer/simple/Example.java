package observer.simple;

public class Example {

  public static void main(String[] args) {
    SimpleSubject simpleSubject = new SimpleSubject();
    SimpleObserver simpleObserver = new SimpleObserver(simpleSubject);
    simpleSubject.setValue(80);
    simpleSubject.setValue(81);
    simpleSubject.removeObserver(simpleObserver);
    simpleSubject.setValue(82);
  }

}

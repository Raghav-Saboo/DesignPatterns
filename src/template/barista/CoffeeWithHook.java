package template.barista;

public class CoffeeWithHook extends CaffeineBeverageWithHook {

  public void brew() {
    System.out.println("Dripping Coffee through filter");
  }

  public void addCondiments() {
    System.out.println("Adding Sugar and Milk");
  }

  public boolean customerWantsCondiments() {
    String answer = getUserInput();
    return answer.toLowerCase().startsWith("y");
  }

  private String getUserInput() {
    System.out.print("Would you like milk and sugar with your coffee (y/n)? ");
    String answer = Utils.readStringInput();
    if (answer == null) {
      return "no";
    }
    return answer;
  }
}

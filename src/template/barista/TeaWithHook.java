package template.barista;

public class TeaWithHook extends CaffeineBeverageWithHook {

  public void brew() {
    System.out.println("Steeping the tea");
  }

  public void addCondiments() {
    System.out.println("Adding Lemon");
  }

  public boolean customerWantsCondiments() {
    String answer = getUserInput();
    return answer.toLowerCase().startsWith("y");
  }

  private String getUserInput() {
    // get the user's response
    System.out.print("Would you like lemon with your tea (y/n)? ");
    String answer = Utils.readStringInput();
    if (answer == null) {
      return "no";
    }
    return answer;
  }
}

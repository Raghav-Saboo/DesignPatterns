package command.party;

public class CeilingFanMediumCommand implements Command {

  CeilingFan ceilingFan;
  int prevSpeed;

  public CeilingFanMediumCommand(CeilingFan ceilingFan) {
    this.ceilingFan = ceilingFan;
  }

  public void execute() {
    prevSpeed = ceilingFan.getSpeed();
    ceilingFan.medium();
  }

  public void undo() {
    ceilingFan.undo(prevSpeed);
  }
}

package command.party;

public class CeilingFanOffCommand implements Command {

  CeilingFan ceilingFan;
  int prevSpeed;

  public CeilingFanOffCommand(CeilingFan ceilingFan) {
    this.ceilingFan = ceilingFan;
  }

  public void execute() {
    prevSpeed = ceilingFan.getSpeed();
    ceilingFan.off();
  }

  public void undo() {
    ceilingFan.undo(prevSpeed);
  }
}

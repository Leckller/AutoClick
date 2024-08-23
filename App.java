import java.awt.Robot;
import java.awt.event.InputEvent;

public class App {
  public static void main(String[] args) throws Exception {
    Robot robot = new Robot();
    Boolean rest = false;
    int count = 0;
    while (true) {
      while(rest) {
        count++;
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(300);
        if(count >= 15) {
          rest = false;
          count = 0;
        }
      }
      Thread.sleep(5000);
      rest = true;
    }
  }
}

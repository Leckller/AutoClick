import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class App {
  public static void main(String[] args) throws Exception {
    Robot robot = new Robot();
    Boolean rest = true;
    boolean side = false;
    int count = 0;
    while (true) {
      while(rest) {
        count++;
        if(side) {
          robot.keyPress(KeyEvent.VK_D);
        } else {
          robot.keyPress(KeyEvent.VK_A);
        }
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(300);
        if(count >= 15) {
          rest = false;
          side = !side;
          count = 0;
          robot.keyRelease(KeyEvent.VK_A);
          robot.keyRelease(KeyEvent.VK_D);
        }
      }
      if(side) {
        Thread.sleep(25000);
      }
      rest = true;
    }
  }
}

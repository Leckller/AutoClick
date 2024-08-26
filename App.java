import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class App {
  public static void main(String[] args) throws Exception {
    Robot robot = new Robot();
    int steps = 11;
    int rests = 0;
    int clicks = 0;
    Thread.sleep(2000);
    toBase(robot);

    while (true) {
      if(steps >= 10) {
        clicks++;
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(300);
        if(clicks >= 15) {
          clicks = 0;
          steps = 0;
          rests++;
          if(rests >= 5) {
            rests = 0;
            toBase(robot);
            steps = 11;
          }
        }
      } else {
        steps++;
        robot.keyPress(KeyEvent.VK_W);
        Thread.sleep(100);
        robot.keyRelease(KeyEvent.VK_W);
      }
    }
  };

  public static void toBase(Robot robot) {
      try {
          robot.keyPress(KeyEvent.VK_T);
          robot.keyRelease(KeyEvent.VK_T);
          Thread.sleep(100);
          
          robot.keyPress(KeyEvent.VK_ALT_GRAPH);
          robot.keyPress(KeyEvent.VK_Q);
          robot.keyRelease(KeyEvent.VK_Q);
          robot.keyRelease(KeyEvent.VK_ALT_GRAPH);
          Thread.sleep(100);
          
          robot.keyPress(KeyEvent.VK_C);
          robot.keyRelease(KeyEvent.VK_C);
          robot.keyPress(KeyEvent.VK_L);
          robot.keyRelease(KeyEvent.VK_L);
          robot.keyPress(KeyEvent.VK_A);
          robot.keyRelease(KeyEvent.VK_A);
          robot.keyPress(KeyEvent.VK_N);
          robot.keyRelease(KeyEvent.VK_N);
          robot.keyPress(KeyEvent.VK_SPACE);
          robot.keyRelease(KeyEvent.VK_SPACE);
          robot.keyPress(KeyEvent.VK_B);
          robot.keyRelease(KeyEvent.VK_B);
          robot.keyPress(KeyEvent.VK_A);
          robot.keyRelease(KeyEvent.VK_A);
          robot.keyPress(KeyEvent.VK_S);
          robot.keyRelease(KeyEvent.VK_S);
          robot.keyPress(KeyEvent.VK_E);
          robot.keyRelease(KeyEvent.VK_E);
          
          robot.keyPress(KeyEvent.VK_ENTER);
          robot.keyRelease(KeyEvent.VK_ENTER);
      } catch (InterruptedException ex) {
        System.out.println("Ehm");
      }
  }
}

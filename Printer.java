import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Printer {
    private static void starter (int ms) throws Exception{
        int count = 11;
        while (count > 1) {
            count --;
            System.out.println(String.format("Iniciando em %s", count));
            Thread.sleep(2000/10);
        }
    }

    public static void main(String[] args) throws Exception {
        Robot robot = new Robot();
        starter(2000);
        long count = 0;

        while (true) { 
            count++;
            printerLn(robot, String.format("fototeta?"));
        }
    }

    private static void click (Robot robot, int[] keys) {
        for (int key : keys) {
            robot.keyPress(key);
        }
        for (int key : keys) {
            robot.keyRelease(key);
        }
    }

    private static void reader(Robot robot, char letter) {
        switch (letter) {
            case 'a', 'A' -> click(robot, new int[] {KeyEvent.VK_A});
            case 'b', 'B' -> click(robot, new int[] {KeyEvent.VK_B});
            case 'c', 'C' -> click(robot, new int[] {KeyEvent.VK_C});
            case 'd', 'D' -> click(robot, new int[] {KeyEvent.VK_D});
            case 'e', 'E' -> click(robot, new int[] {KeyEvent.VK_E});
            case 'f', 'F' -> click(robot, new int[] {KeyEvent.VK_F});
            case 'g', 'G' -> click(robot, new int[] {KeyEvent.VK_G});
            case 'h', 'H' -> click(robot, new int[] {KeyEvent.VK_H});
            case 'i', 'I' -> click(robot, new int[] {KeyEvent.VK_I});
            case 'j', 'J' -> click(robot, new int[] {KeyEvent.VK_J});
            case 'k', 'K' -> click(robot, new int[] {KeyEvent.VK_K});
            case 'l', 'L' -> click(robot, new int[] {KeyEvent.VK_L});
            case 'm', 'M' -> click(robot, new int[] {KeyEvent.VK_M});
            case 'n', 'N' -> click(robot, new int[] {KeyEvent.VK_N});
            case 'o', 'O' -> click(robot, new int[] {KeyEvent.VK_O});
            case 'p', 'P' -> click(robot, new int[] {KeyEvent.VK_P});
            case 'q', 'Q' -> click(robot, new int[] {KeyEvent.VK_Q});
            case 'r', 'R' -> click(robot, new int[] {KeyEvent.VK_R});
            case 's', 'S' -> click(robot, new int[] {KeyEvent.VK_S});
            case 't', 'T' -> click(robot, new int[] {KeyEvent.VK_T});
            case 'u', 'U' -> click(robot, new int[] {KeyEvent.VK_U});
            case 'v', 'V' -> click(robot, new int[] {KeyEvent.VK_V});
            case 'w', 'W' -> click(robot, new int[] {KeyEvent.VK_W});
            case 'x', 'X' -> click(robot, new int[] {KeyEvent.VK_X});
            case 'y', 'Y' -> click(robot, new int[] {KeyEvent.VK_Y});
            case 'z', 'Z' -> click(robot, new int[] {KeyEvent.VK_Z});
            case '0' -> click(robot, new int[] {KeyEvent.VK_NUMPAD0});
            case '1' -> click(robot, new int[] {KeyEvent.VK_NUMPAD1});
            case '2' -> click(robot, new int[] {KeyEvent.VK_NUMPAD2});
            case '3' -> click(robot, new int[] {KeyEvent.VK_NUMPAD3});
            case '4' -> click(robot, new int[] {KeyEvent.VK_NUMPAD4});
            case '5' -> click(robot, new int[] {KeyEvent.VK_NUMPAD5});
            case '6' -> click(robot, new int[] {KeyEvent.VK_NUMPAD6});
            case '7' -> click(robot, new int[] {KeyEvent.VK_NUMPAD7});
            case '8' -> click(robot, new int[] {KeyEvent.VK_NUMPAD8});
            case '9' -> click(robot, new int[] {KeyEvent.VK_NUMPAD9});
            case ',' -> click(robot, new int[] {KeyEvent.VK_COMMA});
            case ' ' -> click(robot, new int[] {KeyEvent.VK_SPACE});
            case '?' -> click(robot, new int[] {KeyEvent.VK_ALT_GRAPH, KeyEvent.VK_W});
            case '@' -> click(robot, new int[] {KeyEvent.VK_SHIFT, KeyEvent.VK_2, KeyEvent.VK_ENTER});
        }
    }

    public static void printerLn (Robot robot, String frase) {
        robot.delay(500);
        for (char c : frase.toCharArray()) {
            reader(robot, c);
        }
        robot.keyPress(KeyEvent.VK_ENTER);
    } 
}

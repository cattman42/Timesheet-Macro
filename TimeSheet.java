import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;


public class TimeSheet
{
    public static void main(String[] args) throws AWTException 
    {
        Robot robot = new Robot();
        int counter = 0;
        robot.mouseMove(700,700);
        
        
        robot.mouseMove(700, 1500);
        robot.mousePress(InputEvent.BUTTON1_MASK);      // Block opens chrome
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        robot.delay(2000);
        
        robot.mouseMove(700,100);
        robot.mousePress(InputEvent.BUTTON1_MASK);      // Block opens voyager
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        robot.delay(3000);
       
        robot.mouseMove(700, 400);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK); 
        robot.delay(1000);
        
       
        robot.mouseMove(900, 700);          // Opens timesheet option   
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        robot.delay(1000);
        
        robot.mouseMove(150,550);
        robot.mousePress(InputEvent.BUTTON1_MASK);   // Clicks timesheet button
        robot.mouseRelease(InputEvent.BUTTON1_MASK);    
        robot.delay(3000);
        
        while(counter <= 1)
        {
        robot.mouseMove(1150,625);      // Click Tuesday
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);  
        robot.delay(3000);
        
        robot.mouseMove(400, 540);      // Sets mouse to am finish
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        robot.delay(100);
        robot.mouseMove(400, 575);      // Sets mouse to pm finish
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        robot.delay(100);
        
        robot.mouseMove(200, 540); // Sets mouse to start textbox and enters time
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        robot.delay(100);
        robot.keyPress(KeyEvent.VK_NUMPAD1);
        robot.keyRelease(KeyEvent.VK_NUMPAD1);
        robot.keyPress(KeyEvent.VK_NUMPAD0);
        robot.keyRelease(KeyEvent.VK_NUMPAD0);
        robot.keyPress(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_SEMICOLON);
        robot.keyRelease(KeyEvent.VK_SEMICOLON);
        robot.keyRelease(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_NUMPAD0);
        robot.keyRelease(KeyEvent.VK_NUMPAD0);
        robot.keyPress(KeyEvent.VK_NUMPAD0);
        robot.keyRelease(KeyEvent.VK_NUMPAD0);
        
        robot.mouseMove(350, 540);      // Enter finish time
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        robot.delay(100);
        robot.keyPress(KeyEvent.VK_NUMPAD1);
        robot.keyRelease(KeyEvent.VK_NUMPAD1);
        robot.keyPress(KeyEvent.VK_NUMPAD2);
        robot.keyRelease(KeyEvent.VK_NUMPAD2);
        robot.keyPress(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_SEMICOLON);
        robot.keyRelease(KeyEvent.VK_SEMICOLON);
        robot.keyRelease(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_NUMPAD0);
        robot.keyRelease(KeyEvent.VK_NUMPAD0);
        robot.keyPress(KeyEvent.VK_NUMPAD0);
        robot.keyRelease(KeyEvent.VK_NUMPAD0);
        robot.mouseMove(150, 720);  // Click back to Time Sheet
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        robot.delay(3000);
        
        robot.mouseMove(1475,625);  // Click Thursday
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        robot.delay(3000);
        
        robot.mouseMove(400, 540);      // Sets mouse to am finish
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        robot.delay(100);
        robot.mouseMove(400, 575);      // Sets mouse to pm finish
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        robot.delay(100);
        
        robot.mouseMove(200, 540); // Sets mouse to start textbox and enters time
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        robot.delay(100);
        robot.keyPress(KeyEvent.VK_NUMPAD1);
        robot.keyRelease(KeyEvent.VK_NUMPAD1);
        robot.keyPress(KeyEvent.VK_NUMPAD0);
        robot.keyRelease(KeyEvent.VK_NUMPAD0);
        robot.keyPress(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_SEMICOLON);
        robot.keyRelease(KeyEvent.VK_SEMICOLON);
        robot.keyRelease(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_NUMPAD0);
        robot.keyRelease(KeyEvent.VK_NUMPAD0);
        robot.keyPress(KeyEvent.VK_NUMPAD0);
        robot.keyRelease(KeyEvent.VK_NUMPAD0);
        
        robot.mouseMove(350, 540);      // Enter finish time
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        robot.delay(100);
        robot.keyPress(KeyEvent.VK_NUMPAD1);
        robot.keyRelease(KeyEvent.VK_NUMPAD1);
        robot.keyPress(KeyEvent.VK_NUMPAD2);
        robot.keyRelease(KeyEvent.VK_NUMPAD2);
        robot.keyPress(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_SEMICOLON);
        robot.keyRelease(KeyEvent.VK_SEMICOLON);
        robot.keyRelease(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_NUMPAD3);
        robot.keyRelease(KeyEvent.VK_NUMPAD3);
        robot.keyPress(KeyEvent.VK_NUMPAD0);
        robot.keyRelease(KeyEvent.VK_NUMPAD0);
        robot.mouseMove(150, 720);  // Click back to Time Sheet
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        robot.delay(3000);
       
        if(counter < 1)
        {
        robot.mouseMove(700,700); // Clicks next to move to next week
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        robot.delay(3000);
        }
        counter++;
        }
        
        
    }

}

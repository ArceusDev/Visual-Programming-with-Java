package Main;

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 *
 * @author Hamza Afzal
 */
public class HelloWorld {

    public static void main(String[] args) {
        // create a JFrame container
        JFrame myFirstForm = new JFrame("My first GUI");
        // Give the frame an initial size.
        myFirstForm.setSize(500, 200);
        // Terminate the program when the user closes the application.
        myFirstForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Create a text-based label.
        JLabel helloWorldLabel = new JLabel("Hello World");
        // Setting Custom font of the label.
        helloWorldLabel.setFont(new Font("Algerian", Font.PLAIN, 30));
        // Center Aligning Text
        helloWorldLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // Add the label to the content pane.
        myFirstForm.add(helloWorldLabel);
        // Display the frame.
        myFirstForm.setVisible(true);
    }
}

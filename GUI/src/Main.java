import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        // Create a JFrame (window)
        JFrame frame = new JFrame("Dropdown Menu Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Create a JPanel to hold components
        JPanel panel = new JPanel();

        // Create a label to display the selected option
        JLabel label = new JLabel("Selected option: ");

        // Create a String array with the options
        String[] options = {"Option 1", "Option 2", "Option 3", "Option 4"};

        // Create a JComboBox (dropdown menu)
        JComboBox<String> dropdown = new JComboBox<>(options);

        // Add an ActionListener to the dropdown menu
        dropdown.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedOption = (String) dropdown.getSelectedItem();
                label.setText("Selected option: " + selectedOption);
            }
        });

        // Add components to the panel
        panel.add(dropdown);
        panel.add(label);

        // Add the panel to the frame
        frame.add(panel);

        // Set the frame visible
        frame.setVisible(true);
    }
}

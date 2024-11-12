import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        // Create a JFrame for the Movie Tickets form
        JFrame frame = new JFrame("MOVIE TICKETS");

        // Create an instance of the MovieTickets class
        MovieTickets movieTickets = new MovieTickets();  // Action listeners are handled in MovieTickets class
        frame.setContentPane(movieTickets.panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        // Create the menu (actions will be handled in MovieTickets class)
        JMenuBar mb = new JMenuBar();
        JMenu x = new JMenu("File");
        JMenu y = new JMenu("Tools");

        // Create menu items
        JMenuItem m1 = new JMenuItem("Exit");
        JMenuItem m2 = new JMenuItem("Process");
        JMenuItem m3 = new JMenuItem("Clear");

        // Add action listeners to menu items
        m1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Exit the application
                System.exit(0);
            }
        });

        m2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Process data and display the report
                movieTickets.processData(); // Calls processData method in MovieTickets
            }
        });

        m3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Clear the form data
                movieTickets.clearData(); // Calls clearData method in MovieTickets
            }
        });

        // Add menu items to the menus
        x.add(m1); // Exit item under "File"
        y.add(m2); // Process item under "Tools"
        y.add(m3); // Clear item under "Tools"

        // Add menus to the menu bar
        mb.add(x);
        mb.add(y);

        // Set the menu bar for the frame
        frame.setJMenuBar(mb);
    }
}

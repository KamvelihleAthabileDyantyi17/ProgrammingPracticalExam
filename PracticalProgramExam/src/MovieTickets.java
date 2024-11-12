import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MovieTickets implements IMoviesTickets.IMovies {
    private JTextField textField1; // Movie name
    private JTextField textField2; // Ticket price
    private JTextField ticketCountField; // Number of tickets
    private JComboBox<String> comboBox1;
    private JTextArea textArea1; // Report area
    public JPanel panel;

    // Fields to store ticket details
    private String movieName;
    private double ticketPrice;
    private int numberOfTickets;

    public MovieTickets() {
        // Optionally add action listeners here if needed
    }

    // Implementing the IMovies interface methods
    @Override
    public String getMovieName() {
        return movieName;
    }

    @Override
    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    @Override
    public double getTicketPrice() {
        return ticketPrice;
    }

    @Override
    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    @Override
    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    @Override
    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    // displays the things in that lkower box
    public void processData() {
        try {
            // Retrieve values from input fields
            String movieName = textField1.getText().trim();
            if (movieName.isEmpty()) {
                JOptionPane.showMessageDialog(panel, "Movie name cannot be empty.");
                return;
            }

            double ticketPrice = Double.parseDouble(textField2.getText());
            if (ticketPrice < 0) {
                JOptionPane.showMessageDialog(panel, "Ticket price must be a positive number.");
                return;
            }

            int ticketCount = Integer.parseInt(ticketCountField.getText());
            if (ticketCount <= 0) {
                JOptionPane.showMessageDialog(panel, "Number of tickets must be a positive integer.");
                return;
            }

            // Calculate the total with 14% VAT
            double total = ticketPrice * ticketCount;
            double totalWithVAT = total * 1.14;  // Adding 14% VAT

            // Create the report to display in textArea1
            String report = String.format("Movie Sales Report\n" +
                            "-------------------\n" +
                            "Movie Name: %s\n" +
                            "Ticket Price: %.2f\n" +
                            "Number of Tickets: %d\n" +
                            "Total Price (incl. 14%% VAT): %.2f",
                    movieName, ticketPrice, ticketCount, totalWithVAT);

            // Display the report in textArea1
            textArea1.setText(report);

        } catch (NumberFormatException e) {
            // Show error if input fields are not valid numbers
            JOptionPane.showMessageDialog(panel, "Please enter valid numbers for price and ticket count.");
        }
    }

    public void clearData() {
        // Clear the text fields
        textField1.setText("");  // Clear movie name field
        textField2.setText("");  // Clear ticket price field
        ticketCountField.setText("");  // Clear number of tickets field

        // Reset the combo box to the first item (default value)
        comboBox1.setSelectedIndex(0);

        // Clear the text area
        textArea1.setText("");
    }

}

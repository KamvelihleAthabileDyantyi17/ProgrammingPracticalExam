public class IMoviesTickets {
    public interface IMovies {
        // Getters and Setters for movie ticket properties
        String getMovieName();
        void setMovieName(String movieName);

        double getTicketPrice();
        void setTicketPrice(double ticketPrice);

        int getNumberOfTickets();
        void setNumberOfTickets(int numberOfTickets);
    }

}

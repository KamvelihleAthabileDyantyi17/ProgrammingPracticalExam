public class QuestionOne implements IMovieTickets {
    private String[] movies = {"Napolean", "Oppenheimer"};
    private int[][] movieSales = {
            {3000, 1500, 1700},
            {3500, 1200, 1600}
    };

    public static void main(String[] args) {
        QuestionOne questionOne = new QuestionOne();

        // Display the header
        System.out.println("Movie Ticket Sales:");
        System.out.println();
        System.out.println("Movies\t\t\tJanuary\t\tFebruary\tMarch");
        System.out.println("-----------------------------------------------------------");

        // Display the movie sales
        for (int i = 0; i < questionOne.movies.length; i++) {
            System.out.print(questionOne.movies[i] + "\t\t");
            for (int sale : questionOne.movieSales[i]) {
                System.out.print(sale + "\t\t");
            }
            System.out.println();
        }

        // Display total movie sales
        double[] totalSales = questionOne.calculateTotalSales();
        System.out.println("\nTotal sales:");
        for (int i = 0; i < questionOne.movies.length; i++) {
            System.out.printf("%s: %.2f\n", questionOne.movies[i], totalSales[i]);
        }

        // Display the top-performing movie
        String topMovie = questionOne.getTopPerformingMovie();
        System.out.printf("\nTop-performing movie: %s\n", topMovie);
    }

    @Override
    public double[] calculateTotalSales() {
        double[] totalSales = new double[movies.length];
        for (int i = 0; i < movies.length; i++) {
            for (int sale : movieSales[i]) {
                totalSales[i] += sale;
            }
        }
        return totalSales;
    }

    @Override
    public String getTopPerformingMovie() {
        double[] totalSales = calculateTotalSales();
        int topMovieIndex = totalSales[0] > totalSales[1] ? 0 : 1;
        return movies[topMovieIndex];
    }
}

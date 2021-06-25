package com.pluralsight.bridge;

public class BridgeMovieDemo {

    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setClassification("Action");
        movie.setTitle("Matrix");
        movie.setRuntime("2:35");
        movie.setYear("1999");

        Formatter printFormatter = new PrintFormatter();
        Printer moviePrinter = new MoviePrinter(movie);

        String printedMaterial = moviePrinter.print(printFormatter);
        System.out.println(printedMaterial);
    }
}

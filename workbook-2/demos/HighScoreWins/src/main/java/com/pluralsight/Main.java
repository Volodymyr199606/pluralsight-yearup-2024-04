package com.pluralsight;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);


        // Prompt user for game score
        System.out.print("Please Enter a game score (Format: Home:Visitor|21:9 or Slytherin:Gryffindor|23:59): ");
        String input = userInput.nextLine();

        // Split input string into team names and scores
        String[] parts = input.split("\\|");
        String[] teams = parts[0].trim().split(":");
        String[] scores = parts[1].trim().split(":");

        // Extract team names and scores
        String homeTeam = teams[0].trim();
        String visitorTeam = teams[1].trim();
        int homeScore = Integer.parseInt(scores[0].trim());
        int visitorScore = Integer.parseInt(scores[1].trim());

        // Determine winning team
        String winningTeam;
        if (homeScore > visitorScore) {
            winningTeam = homeTeam;
        } else if (homeScore < visitorScore) {
            winningTeam = visitorTeam;
        } else {
            winningTeam = "It's a tie";
        }

        // Display winning team
        System.out.println("Winner: " + winningTeam);
    }
}
package com.pluralsight;

import java.util.Scanner;

public class TryCatch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quotePosition;
        String[] quotes = {
                "The way of the transgressor is exceedingly long and difficult.",
                "I was too ashamed to take so I gave. It wasn't a virtue, it was a disguise.",
                "Kill two birds with one stone.",
                "Everything that is hard to attain is easily assailed by the generality of man.",
                "The secret of getting ahead is getting started.",
                "Whether you think you can or think you can't, you're right.",
                "Do what you can, with what you have, where you are.",
                "Don't wish it were easier. Wish you were better.",
                "It's so freeing to to have a great failure.",
                "All work and no play makes jack a dull boy."
        };

        do {
            System.out.print("Which quote is do you want to see?" +
                    "\nhit (1-10) OR hit (0) for random: ");
            quotePosition = Integer.parseInt(scanner.nextLine());

            try {
                if (quotePosition == 0){
                    int randomPull = (int)(Math.random() * (10 - 1 + 1)) + 1;
                    System.out.printf("%d. %s%n%n", randomPull, quotes[randomPull]);
                } else {
                    System.out.printf("%d. %s%n", quotePosition, quotes[quotePosition - 1]);
                }
            } catch (Exception e) {
                System.out.println("Your number was out of range!");
                e.printStackTrace();
            }
        } while (quotePosition != -1);
        scanner.close();
    }
}


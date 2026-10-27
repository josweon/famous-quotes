package com.pluralsight;

import java.util.Scanner;

public class TryCatch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] quotes = {
                "The way of the transgressor is exceeding long and difficult.",
                "I was too ashamed to take so I gave. It wasn't a virtue, it was a disguise.",
                "You can kill two birds with one stone.",
                "Everything that is hard to attain is easily assailed by the generality of man.",
                "The secret of getting is getting started.",
                "Whether you think you can or think you can't, you're right.",
                "Do what you can, with what you have, where you are.",
                "Don't wish it were easier. Wish you were better.",
                "It's so freeing to to have a great failure.",
                "All work and no play make jack a dull boy."
        };

        System.out.print("Which quote is do you want to see (1-10)?");
    }
}

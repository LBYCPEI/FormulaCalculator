/*
 * File: Main.java
 * ---------------------
 * This class is the menu application responsible for summoning the formulas
 * Responsibilities: Print the menu and I/O only
 * Author: Cobalt -mkc
 *
 */

import acm.program.ConsoleProgram;

public class Main extends ConsoleProgram {

    private VolumeFormula volumeFormula;
    private CoulombsLaw coulombsFormula;

    public void run() {

        // Initialize the objects
        volumeFormula = new VolumeFormula();
        coulombsFormula = new CoulombsLaw();

        int choice = 0;
        do {

            println("\n================================");
            println("           Main Menu    ");
            println("================================");
            println(" 1. Formula 1: Volume Formula   ");
            println(" 2. Formula 2: Coulombs Law  ");
            println(" 3. Exit ");
            println("================================\n");

            choice = readInt(">> ");
            switch (choice) {
                case 1:
                    while (true) {
                        println("\nFormula 1: Volume Formula");
                        println(volumeFormula.showMenu());
                        volumeFormula.setChoice(readInt(">> "));
                        if (volumeFormula.getChoice() == 5) {
                            break;
                        }
                        println(volumeFormula.showPrompt());
                        volumeFormula.readInput(readDouble(">> "), readDouble(">> "), readDouble(">> "));
                        println(volumeFormula.showResult());
                    }
                    break;
                case 2:
                    while (true) {
                        println("Formula 2: Coulomb's law");
                        println(coulombsFormula.showMenu());
                        coulombsFormula.setChoice(readInt(">> "));
                        if (coulombsFormula.getChoice() == 5) {
                            break;
                        }
                        println(coulombsFormula.showPrompt());
                        coulombsFormula.readInput(readDouble(">> "), readDouble(">> "), readDouble(">> "));
                        println(coulombsFormula.showResult());
                    }
                    break;
                case 3:
                    println("Exiting ....");
                    pause(1000);
                    exit();
                    break;
                default:
                    println("Invalid");
            }
        } while (choice != 3);
    }


    // Solves java.lang.NoClassDefFoundError
    public static void main(String[] args) {
        (new Main()).start(args);
    }
}


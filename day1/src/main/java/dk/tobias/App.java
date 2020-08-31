package dk.tobias;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/*
 * My Solution to the 1st day of Advent of Code 2019.
 * Puzzle description: https://adventofcode.com/2019/day/1
 *
 * Author: Tobias Kristensen
 */

public class App {
    public static void main( String[] args ) {
        Spacecraft spacecraft = new Spacecraft();
        addModulesToSpacecraft(spacecraft);
        FuelCounter.fuelSpacecraft(spacecraft);
        System.out.println(spacecraft.getFuelRequirement());
    }

    private static void addModulesToSpacecraft(Spacecraft spacecraft) {
        try(Scanner scanner = new Scanner(new File("./src/main/java/dk/tobias/puzzleInput.txt"))) {
            while (scanner.hasNextLine()) {
                SpacecraftModule module = new SpacecraftModule(Integer.parseInt(scanner.nextLine()));
                spacecraft.addSpacecraftModule(module);
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}

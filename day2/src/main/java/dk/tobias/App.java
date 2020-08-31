package dk.tobias;

import dk.tobias.intcodeComputer.Computer;
import dk.tobias.intcodeComputer.IntcodeComputer;

/**
  * My Solution to the 2nd day of Advent of Code 2019.
  * Puzzle description: https://adventofcode.com/2019/day/2
  *
  * Author: Tobias Kristensen
  */
public class App {
    public static void main( String[] args ) {
        Computer computer = new IntcodeComputer();

        // Part 1
        /*PuzzleInputLoader.loadInput(computer);
        computer.runProgram();
        System.out.println(computer.getIndexValue(0));*/

        // Part 2
        /*for (int noun = 0; noun < 100; noun++) {
            for (int verb = 0; verb < 100; verb++) {
                PuzzleInputLoader.loadInput(computer);
                computer.setIndexValue(1, noun);
                computer.setIndexValue(2, verb);
                computer.runProgram();

                if (computer.getIndexValue(0) == 19690720) {
                    System.out.println("Noun: " + noun + "\nVerb: " + verb);
                    System.out.println("Solution: " + (100 * noun + verb));
                    break;
                }
            }
        }*/
    }
}
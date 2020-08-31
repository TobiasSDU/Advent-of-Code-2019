package dk.tobias;

import dk.tobias.intcodeComputer.Computer;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PuzzleInputLoader {

    public static void loadInput(Computer computer) {
        try(Scanner scanner = new Scanner(
            new File("./src/main/java/dk/tobias/intcodeInstructions/puzzleInput.txt")
        ).useDelimiter(",")) {
            List<Integer> puzzleInput = new ArrayList<>();

            while (scanner.hasNext()) {
                puzzleInput.add(Integer.parseInt(scanner.next()));
            }

            computer.loadProgram(puzzleInput);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}

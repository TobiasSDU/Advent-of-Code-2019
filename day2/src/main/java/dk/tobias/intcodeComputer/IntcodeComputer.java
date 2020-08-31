package dk.tobias.intcodeComputer;

import dk.tobias.intcodeInstructions.Instruction;
import dk.tobias.intcodeInstructions.IntcodeInstruction;
import java.util.ArrayList;
import java.util.List;

public class IntcodeComputer implements Computer {
    private List<Integer> intcodeProgram;
    private int position;
    private Instruction currentInstruction;

    public IntcodeComputer() {
        position = 0;
    }

    public void loadProgram(List<Integer> program) {
        intcodeProgram = program;
    }

    public void runProgram() {
        position = 0;

        while (intcodeProgram.get(position) != 99) {
            setCurrentInstruction();
            executeInstruction();
        }
    }

    public int getIndexValue(int index) {
        return intcodeProgram.get(index);
    }

    public void setIndexValue(int index, int value) {
        intcodeProgram.set(index, value);
    }

    private void setCurrentInstruction() {
        List<Integer> instructions = new ArrayList<>();

        switch (intcodeProgram.get(position)) {
            case 1:
            case 2:
                for (int i = 0; i < 4; i++) {
                    instructions.add(intcodeProgram.get(position));
                    position++;
                }
                break;
        }

        currentInstruction = new IntcodeInstruction(instructions);
    }

    private void executeInstruction() {
        switch (currentInstruction.getOpcode()) {
            case 1:
                int add1 = intcodeProgram.get(currentInstruction.getIndexValue(1));
                int add2 = intcodeProgram.get(currentInstruction.getIndexValue(2));
                intcodeProgram.set(currentInstruction.getIndexValue(3), add1 + add2);
                break;
            case 2:
                int multiply1 = intcodeProgram.get(currentInstruction.getIndexValue(1));
                int multiply2 = intcodeProgram.get(currentInstruction.getIndexValue(2));
                intcodeProgram.set(currentInstruction.getIndexValue(3), multiply1 * multiply2);
                break;
        }
    }
}

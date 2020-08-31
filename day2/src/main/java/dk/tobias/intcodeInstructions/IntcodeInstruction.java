package dk.tobias.intcodeInstructions;

import java.util.List;

public class IntcodeInstruction implements Instruction {
    private List<Integer> instructionList;

    public IntcodeInstruction(List<Integer> instructions) {
        instructionList = instructions;
    }

    public int getOpcode() {
        return instructionList.get(0);
    }

    public int getIndexValue(int index) {
        return instructionList.get(index);
    }
}

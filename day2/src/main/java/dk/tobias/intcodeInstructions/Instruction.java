package dk.tobias.intcodeInstructions;

public interface Instruction {
    int getOpcode();
    int getIndexValue(int index);
}

package dk.tobias.intcodeComputer;

import java.util.List;

public interface Computer {
    void loadProgram(List<Integer> program);
    void runProgram();
    int getIndexValue(int index);
    void setIndexValue(int index, int value);
}

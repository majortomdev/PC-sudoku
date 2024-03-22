package sudoku.cubedproblem;

import java.io.IOException;

public interface IFsafe {
    void updateProgression(SudokuGame gm) throws IOException;
    SudokuGame getGameProgression() throws IOException;
}

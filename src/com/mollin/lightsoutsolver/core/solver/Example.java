package com.mollin.lightsoutsolver.core.solver;

import com.mollin.lightsoutsolver.core.base.GridInterface;
import com.mollin.lightsoutsolver.core.base.PatternInterface;
import com.mollin.lightsoutsolver.core.solver.solution.Solutions;
import com.mollin.lightsoutsolver.core.utils.Utils;

/**
 * Classe d'exemple
 *
 * @author MOLLIN Florian
 */
public class Example {
    private static final int ROWS = 4;
    private static final int COLUMNS = 4;

    public static void main(String[] args) {
        GridInterface startGrid = Utils.getEmptyGrid(ROWS, COLUMNS);
        GridInterface endGrid = Utils.getFullGrid(ROWS, COLUMNS);
        PatternInterface pattern = Utils.getClassicPattern();

        Solver solver = new Solver(startGrid, endGrid, pattern);
        Solutions solutions = solver.solve();

        System.out.println(solutions);
    }
}

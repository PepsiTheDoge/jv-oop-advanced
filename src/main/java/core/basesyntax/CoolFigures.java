package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class CoolFigures {
    public static void main(String[] args) {
        printFigures(drawArrayOfRandomFigures(6));
    }

    public static Figure[] drawArrayOfRandomFigures(int n) {
        Figure[] randomFigures = new Figure[n];
        for (int i = 0; i < n; i++) {
            randomFigures[i] = FigureSupplier.getRandomFigure();
        }
        return randomFigures;
    }

    public static void printFigures(Figure[] figures) {
        for (Figure figure : figures) {
            System.out.println(figure);
        }
    }
}
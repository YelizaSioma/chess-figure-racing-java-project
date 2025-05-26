package figurefactory;

import figure.Figure;
import figure.RedBishop;
import figure.RedPawn;
import figure.RedQueen;

public class RedFigureFactory implements FigureFactory{
    @Override
    public Figure createPawn() {
        return new RedPawn();
    }

    @Override
    public Figure createBishop() {
        return new RedBishop();
    }

    @Override
    public Figure createQueen() {
        return new RedQueen();
    }
}

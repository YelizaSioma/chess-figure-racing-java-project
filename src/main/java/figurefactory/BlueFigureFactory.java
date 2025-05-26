package figurefactory;

import figure.BlueBishop;
import figure.BluePawn;
import figure.BlueQueen;
import figure.Figure;

public class BlueFigureFactory implements FigureFactory{
    @Override
    public Figure createPawn() {
        return new BluePawn();
    }

    @Override
    public Figure createBishop() {
        return new BlueBishop();
    }

    @Override
    public Figure createQueen() {
        return new BlueQueen();
    }
}

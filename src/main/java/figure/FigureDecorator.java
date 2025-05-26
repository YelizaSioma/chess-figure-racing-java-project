package figure;

public abstract class FigureDecorator implements Figure{
    protected Figure decoratedFigure;

    public FigureDecorator(Figure decoratedFigure) {
        this.decoratedFigure = decoratedFigure;
    }

    @Override
    public int getPosition() {
        return decoratedFigure.getPosition();
    }
}

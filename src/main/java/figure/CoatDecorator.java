package figure;

public class CoatDecorator extends FigureDecorator implements Figure{

    public CoatDecorator(Figure figure) {
        super(figure);
    }

    @Override
    public void move() {
        this.decoratedFigure.move();
        this.decoratedFigure.setPosition(this.decoratedFigure.getPosition()+3);
    }

    @Override
    public void setPosition(int position) {
        this.decoratedFigure.setPosition(position);
    }
}

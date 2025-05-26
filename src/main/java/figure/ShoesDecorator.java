package figure;

public class ShoesDecorator extends FigureDecorator implements Figure{

    public ShoesDecorator(Figure figure) {
        super(figure);
    }

    @Override
    public void move() {
        this.decoratedFigure.move();
        this.decoratedFigure.move();
    }

    @Override
    public void setPosition(int position) {
        this.decoratedFigure.setPosition(position);
    }
}

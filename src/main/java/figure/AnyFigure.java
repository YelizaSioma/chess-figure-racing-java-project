package figure;

public class AnyFigure implements Figure{
    //attributes
    private int position;
    private final int steps;

    //constructor
    public AnyFigure(int steps){
        this.position = 0;
        this.steps = steps;
    }

    //___________Public methods___________
    @Override
    public void move() {
        position += steps;
    }

    @Override
    public int getPosition() {
        return position;
    }

    @Override
    public void setPosition(int position) {
        validatePosition(position);
        this.position = position;
    }

    //validation methods
    public void validatePosition(int position){
        if (position < 0) {
            throw new IllegalArgumentException("position cannot be negative.");
        }
    }
}

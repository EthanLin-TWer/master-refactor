package refactor.howto.linesh.tw.smells.switchstatements;

public class Position {
    private int x;
    private int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Position setX(int x) {
        this.x = x;
        return this;
    }

    public Position setY(int y) {
        this.y = y;
        return this;
    }
}

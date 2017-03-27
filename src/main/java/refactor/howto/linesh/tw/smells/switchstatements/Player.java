package refactor.howto.linesh.tw.smells.switchstatements;

public class Player {

    private final Position position;

    public Player(int x, int y) {
        this.position = new Position(x, y);
    }

    public Position move(String towards) {
        switch (towards) {
            case "left":
                return this.position.setX(this.position.getX() - 1);
            case "right":
                return this.position.setX(this.position.getX() + 1);
            case "forward":
                return this.position.setY(this.position.getY() + 1);
            case "backward":
                return this.position.setY(this.position.getY() - 1);
            default:
                return this.position;
        }
    }
}

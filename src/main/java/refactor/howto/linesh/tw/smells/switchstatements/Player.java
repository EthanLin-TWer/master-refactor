package refactor.howto.linesh.tw.smells.switchstatements;

public class Player {

    private final Position position;

    public Player(int x, int y) {
        this.position = new Position(x, y);
    }

    public Position move(String towards) {
        if (towards.equals("left")) {
            this.position.x -= 1;
        }
        if (towards.equals("right")) {
            this.position.x += 1;
        }
        if (towards.equals("forward")) {
            this.position.y += 1;
        }
        if (towards.equals("backward")) {
            this.position.y -= 1;
        }
        return this.position;
    }
}

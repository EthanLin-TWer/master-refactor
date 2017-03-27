package refactor.howto.linesh.tw.smells.switchstatements;

public class Player {

    private final Position position;

    public Player(int x, int y) {
        this.position = new Position(x, y);
    }

    public Position move(String towards) {
        switch (towards) {
            case "left":
                this.position.x -= 1;
                break;
            case "right":
                this.position.x += 1;
                break;
            case "forward":
                this.position.y += 1;
                break;
            case "backward":
                this.position.y -= 1;
                break;
        }

        return this.position;
    }
}

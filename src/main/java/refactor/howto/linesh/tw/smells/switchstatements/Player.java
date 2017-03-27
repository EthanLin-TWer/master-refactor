package refactor.howto.linesh.tw.smells.switchstatements;

class Player {

    private final Position position;

    Player(int x, int y) {
        this.position = new Position(x, y);
    }

    public Position move(String towards) {
        switch (towards) {
            case "left":
                this.position.setX(this.position.getX() - 1); break;
            case "right":
                this.position.setX(this.position.getX() + 1); break;
            case "forward":
                this.position.setY(this.position.getY() + 1); break;
            case "backward":
                this.position.setY(this.position.getY() - 1); break;
        }
        return this.position;
    }
}

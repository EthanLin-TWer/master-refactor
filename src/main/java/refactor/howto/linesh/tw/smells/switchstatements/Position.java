package refactor.howto.linesh.tw.smells.switchstatements;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
class Position {
    Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    private int x;
    private int y;
}

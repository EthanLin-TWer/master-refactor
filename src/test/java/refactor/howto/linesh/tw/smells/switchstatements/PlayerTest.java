package refactor.howto.linesh.tw.smells.switchstatements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {
    @Test
    void should_return_01_when_player_turn_left_given_origin_position_is_11() {
        Player player = new Player(1, 1);

        Position position = player.move("left");
        assertAll("player position",
                () -> assertEquals(0, position.x),
                () -> assertEquals(1, position.y)
        );
    }

    @Test
    void should_return_21_when_player_turn_right_given_origin_position_is_11() {
        Player player = new Player(1, 1);

        Position position = player.move("right");
        assertAll("player position",
                () -> assertEquals(2, position.x),
                () -> assertEquals(1, position.y)
        );
    }

    @Test
    void should_return_12_when_player_move_forward_given_origin_position_is_11() {
        Player player = new Player(1, 1);

        Position position = player.move("forward");
        assertAll("player position",
                () -> assertEquals(1, position.x),
                () -> assertEquals(2, position.y)
        );
    }

    @Test
    void should_return_10_when_player_move_backward_given_origin_position_is_11() {
        Player player = new Player(1, 1);

        Position position = player.move("backward");
        assertAll("player position",
                () -> assertEquals(1, position.x),
                () -> assertEquals(0, position.y)
        );

    }
}
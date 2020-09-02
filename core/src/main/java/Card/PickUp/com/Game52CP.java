package Card.PickUp.com;

import com.badlogic.gdx.ApplicationAdapter;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class Game52CP extends BaseGame {
    @Override
    public void create() {
        setScreen(new GameScreen(this));
    }
}
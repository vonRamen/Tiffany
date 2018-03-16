package dk.sdu.mmmi.cbse.coreofgame;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class Application {

    private LwjglApplication application;

    public Application() {
        final LwjglApplicationConfiguration cfg
                = new LwjglApplicationConfiguration();
        cfg.title = "Test";
        cfg.width = 500;
        cfg.height = 400;
        cfg.useGL30 = false;
        cfg.resizable = true;

        application = new LwjglApplication(new Game(), cfg);

    }

    public void stop() {
        application.stop();
    }
}

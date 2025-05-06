package safir.cosmic;

import javafx.scene.Group;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.Button;


public class LevelManager {
	private static Level currentLevel;

    public static void switchTo(Level newLevel) {
        if (currentLevel != null) currentLevel.exit();
        currentLevel = newLevel;
        currentLevel.enter();
    }

    public static void update(GraphicsContext gc) {
        if (currentLevel != null) currentLevel.update(gc);
    }

    public static void handleClick(MouseEvent e) {
        if (currentLevel != null) currentLevel.handleClick(e);
    }
	
}

package safir.cosmic;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;

public class LevelManager {

    private static LevelManager instance; // Singleton instance
    private Level currentLevel;

    private LevelManager() {
        // Private constructor prevents external instantiation
    }

    public static LevelManager getInstance() {
        if (instance == null) {
            instance = new LevelManager();
        }
        return instance;
    }

    public void switchTo(Level newLevel, GraphicsContext gc) {
        if (currentLevel != null) currentLevel.exit();
        currentLevel = newLevel;
        currentLevel.enter(gc);
    }

    public void update(GraphicsContext gc) {
        if (currentLevel != null) currentLevel.update(gc);
    }

    public void handleClick(MouseEvent e) {
        if (currentLevel != null) currentLevel.handleClick(e);
    }
}
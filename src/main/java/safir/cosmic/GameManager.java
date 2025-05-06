package safir.cosmic;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.Group;

public class GameManager {

    private LevelManager levelManager;
   
    private HintManager hintManager;
    private GraphicsContext gc;
    

    // ✅ Fixed constructor to include root
    public GameManager(GraphicsContext gc) {
        this.gc = gc;
        
        this.levelManager = new LevelManager();
        
        this.hintManager = new HintManager();
    }

    public void startGame() {
        levelManager.switchTo(new Level0());
        
    }

    public void update() {
        levelManager.update(gc);
        
    }

    public void handleMouseClick(MouseEvent e) {
        
            levelManager.handleClick(e);
        }
    }


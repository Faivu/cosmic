package safir.cosmic;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.Group;

public class GameManager {

    private LevelManager levelManager;
   
    
    private GraphicsContext gc;
    

    
    public GameManager(GraphicsContext gc) {
        this.gc = gc;
        
        this.levelManager = LevelManager.getInstance();
 
    }


	public void startGame() {
		LevelManager.getInstance().switchTo(new Level0(), gc);
        
    }

    public void update() {
        levelManager.update(gc);
        
    }

    public void handleMouseClick(MouseEvent e) {
        
            levelManager.handleClick(e);
        }
    }


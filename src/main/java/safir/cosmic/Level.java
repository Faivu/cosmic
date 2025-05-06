package safir.cosmic;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;

public interface Level {
	// Setup UI and logic for each level
    void enter(GraphicsContext gc);
    
    void update(GraphicsContext gc);
    
    boolean handleClick(MouseEvent e);   
    // Remove UI, stop animations
    void exit(); 
    
}

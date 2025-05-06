package safir.cosmic;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;

public interface Level {
	
    void enter(GraphicsContext gc);
    
    void update(GraphicsContext gc);
    
    boolean handleClick(MouseEvent e);   
    
    void exit(); 
    
}

package safir.cosmic;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;

public interface Level {
    void enter();  // Setup UI and logic
    void exit();   // Remove UI, stop animations
    void update(GraphicsContext gc);  // Called each frame
    boolean handleClick(MouseEvent e);
}

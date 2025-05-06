package safir.cosmic;

import javafx.application.Platform;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;

public class Level0 implements Level {
    private Background background;
    private UIButton startButton;
    private UIButton leaveButton;

    @Override
    public void enter(GraphicsContext gc) {
        background = GameObjectFactory.createBackground(gc, "/menu_background.png");

        startButton = GameObjectFactory.createUIButton(
        	    gc,
        	    275, 270, // ⬅ centered horizontally & raised vertically
        	    250, 150,
        	    "/start_btn.png",
        	    () -> LevelManager.getInstance().switchTo(new Level1(), gc)
        	);

        	leaveButton = GameObjectFactory.createUIButton(
        	    gc,
        	    275, 420, // ⬅ same horizontal center, placed below start button
        	    250, 150,
        	    "/leave_btn.png",
        	    () -> Platform.exit()
        	);
    }

    @Override
    public void exit() {
        // no visual node to remove in this setup
    }

    @Override
    public void update(GraphicsContext gc) {
        background.update();
        startButton.update();
        leaveButton.update();
    }

    @Override
    public boolean handleClick(MouseEvent e) {
        // Start button first, then leave
        return startButton.handleClick(e) || leaveButton.handleClick(e);
    }
}
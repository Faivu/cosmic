package safir.cosmic;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;

public class Level0 implements Level {
	

	private Image background;
	private Image startButtonImage;
	private double buttonX = 350;
	private double buttonY = 280;
	private double buttonWidth = 250;
	private double buttonHeight = 150;
    @Override
    public void enter() {
    	background = new Image(getClass().getResource("/resources/menu_background.png").toExternalForm());
    	startButtonImage = new Image(getClass().getResource("/resources/start_btn.png").toExternalForm());
           }
    
    

    @Override
    public void exit() {
        //App.getRoot().getChildren().remove(//smtg);
    }

    @Override
    public void update(GraphicsContext gc) {
        gc.drawImage(background, 0, 0, 800, 600);
        gc.drawImage(startButtonImage, buttonX, buttonY, buttonWidth, buttonHeight);
    }

    @Override
    public boolean handleClick(MouseEvent e) {
        double mx = e.getX();
        double my = e.getY();

        boolean clicked = mx >= buttonX && mx <= buttonX + buttonWidth &&
                          my >= buttonY && my <= buttonY + buttonHeight;

        if (clicked) {
            LevelManager.switchTo(new Level1());
            return true;
        }
        return false;
    }

}

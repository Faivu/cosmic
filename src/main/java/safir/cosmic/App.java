package safir.cosmic;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.animation.AnimationTimer;
import javafx.scene.input.MouseEvent;

public class App extends Application {

    private GameManager gameManager;
    private static Group root; // Static root, shared globally

    @Override
    public void start(Stage primaryStage) {
        Canvas canvas = new Canvas(800, 600);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        root = new Group(canvas);

        // ✅ Fixed: pass both gc and root
        gameManager = new GameManager(gc);
        gameManager.startGame();
        
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Cosmic Add-Venture");
        primaryStage.show();

        new AnimationTimer() {
            @Override
            public void handle(long now) {
                gc.clearRect(0, 0, 800, 600);
                LevelManager.getInstance().update(gc);
            }
        }.start();

        canvas.setOnMouseClicked((MouseEvent e) -> {
            gameManager.handleMouseClick(e);
        });
    }
    
    public static Group getRoot() {
    	return root;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
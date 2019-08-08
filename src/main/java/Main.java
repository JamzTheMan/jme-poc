import com.jayfella.jme.jfx.JavaFxUI;
import com.jme3.app.SimpleApplication;
import javafx.scene.control.Button;

public class Main extends SimpleApplication {

  public static void main(String... args) {
    Main main = new Main();
    main.start();
  }

  //  TestJavaFx() {
  //    super(new StatsAppState());
  //  }

  @Override
  public void simpleInitApp() {

    JavaFxUI.initialize(this);

    Button button = new Button("Click Me?");
    button.setOnAction(event -> System.out.println("I'm clicked."));
    JavaFxUI.getInstance().attachChild(button);

    inputManager.setCursorVisible(true);

    // Fixes cursor not showing
    flyCam.setEnabled(false);

    //    setShowSettings(false);
    //    setDisplayFps(false);
    //    setDisplayStatView(false);

    //    JavaFxUI.getInstance().showDialog(new Label("Weee"));
  }
}

package Client;
import Client.core.*;
import javafx.application.Application;
import javafx.stage.Stage;

public class RunApp extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        ModelFactory modelFactory = ModelFactory.getModelFactoryInstance();
        ViewModelFactory viewModelFactory = ViewModelFactory.getInstance(modelFactory);
        ViewHandler viewFactory = ViewHandler.getViewHandler(viewModelFactory, primaryStage);
        viewFactory.getVinylListController();
    }
}
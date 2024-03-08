package main.Factories;

import View.AddVinylController;
import View.VinylListController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ViewFactory
{
    private ViewModelFactory viewModelFactory;
    private VinylListController vinylListController;
    private AddVinylController addVinylController;

    private final Stage primaryStage;
    private FXMLLoader fxmlLoader;


    public ViewFactory(ViewModelFactory viewModelFactory, Stage primaryStage)
    {
        this.viewModelFactory = viewModelFactory;
        this.primaryStage = primaryStage;
    }

    public VinylListController getVinylListController() throws IOException
    {
        if(vinylListController == null)
        {
            fxmlLoader = new FXMLLoader(getClass().getResource("/View/VinylListView.fxml"));
            fxmlLoader.setControllerFactory(controllerClass -> new VinylListController(viewModelFactory.getVinylListViewModel()));

            Scene vinylListScene = new Scene(fxmlLoader.load());
            primaryStage.setTitle("View Users");
            primaryStage.setScene(vinylListScene);
            primaryStage.show();
            vinylListController = fxmlLoader.getController();
        }
        return vinylListController;
    }

    public AddVinylController getAddVinylController() throws IOException
    {
        if(addVinylController == null)
        {
            fxmlLoader = new FXMLLoader(getClass().getResource("/View/AddVinylView.fxml"));
            fxmlLoader.setControllerFactory(controllerClass -> new AddVinylController(viewModelFactory.getAddVinylViewModel()));

            Scene addVinylScene = new Scene(fxmlLoader.load());
            Stage secondaryStage = new Stage();
            secondaryStage.setTitle("Add vinyl");
            secondaryStage.setScene(addVinylScene);
            secondaryStage.show();
            addVinylController = fxmlLoader.getController();
        }
        return addVinylController;
    }
}
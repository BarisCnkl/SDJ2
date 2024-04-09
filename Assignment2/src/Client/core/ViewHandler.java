package Client.core;

import Client.View.ChatViewController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ViewHandler
{
    private static ViewHandler instance;
    private ViewModelFactory viewModelFactory;
    private ChatViewController chatViewController;

    private final Stage primaryStage;
    private FXMLLoader fxmlLoader;


    private ViewHandler(ViewModelFactory viewModelFactory, Stage primaryStage)
    {
        this.viewModelFactory = viewModelFactory;
        this.primaryStage = primaryStage;
    }
    public static ViewHandler getViewHandler(ViewModelFactory viewModelFactory, Stage primaryStage)
    {
        if (instance == null)
        {
            instance = new ViewHandler(viewModelFactory,primaryStage);
        }
        return instance;
    }

    public ChatViewController getVinylListController() throws IOException
    {
        if(chatViewController == null)
        {
            fxmlLoader = new FXMLLoader(getClass().getResource("/Client/View/ChatView.fxml"));
            fxmlLoader.setControllerFactory(controllerClass -> new ChatViewController(viewModelFactory.getChatViewmodel()));

            Scene vinylListScene = new Scene(fxmlLoader.load());
            primaryStage.setTitle("View Users");
            primaryStage.setScene(vinylListScene);
            primaryStage.show();
            chatViewController = fxmlLoader.getController();
        }
        return chatViewController;
    }
}
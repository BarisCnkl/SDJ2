package main;
import Datafiles.Vinyl.Vinyl;
import main.Factories.ModelFactory;
import main.Factories.ViewFactory;
import main.Factories.ViewModelFactory;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application
{
    public static void main(String[] args)
    {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        ModelFactory modelFactory = new ModelFactory();
        ViewModelFactory viewModelFactory = new ViewModelFactory(modelFactory);
        ViewFactory viewFactory = new ViewFactory(viewModelFactory, primaryStage);

        viewFactory.getAddVinylController();
        viewFactory.getVinylListController();

        modelFactory.getModel().addVinyl("Titel","Semicenk","2022");
        modelFactory.getModel().addVinyl("Titel","Semicenk","2023");
        modelFactory.getModel().addVinyl("Titel","Semicenk","2026");
        modelFactory.getModel().addVinyl("Titel","Semicenk","2019");
        modelFactory.getModel().addVinyl("Titel","Semicenk","2012");
        modelFactory.getModel().addVinyl("Titel","Semicenk","2024");
        modelFactory.getModel().addVinyl("Titel","Semicenk","2029");
        modelFactory.getModel().addVinyl("Titel","Semicenk","2010");

        Thread thread1 = new Thread(new Simulation(modelFactory.getModel()));
        Thread thread2 = new Thread(new Simulation(modelFactory.getModel()));
        Thread thread3 = new Thread(new Simulation(modelFactory.getModel()));
        Thread thread4 = new Thread(new Simulation(modelFactory.getModel()));
        Thread thread5 = new Thread(new Simulation(modelFactory.getModel()));
        Thread thread6 = new Thread(new Simulation(modelFactory.getModel()));

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();

    }
}
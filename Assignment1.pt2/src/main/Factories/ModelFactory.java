package main.Factories;

import Model.VinylListModel;

public class ModelFactory
{
    private VinylListModel model;

    public VinylListModel getModel()
    {
        if(model == null)
        {
            model = new VinylListModel();
        }
        return model;
    }
}
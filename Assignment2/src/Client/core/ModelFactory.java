package Client.core;

import Client.model.ChatModel;

public class ModelFactory
{
    private static ModelFactory modelFactoryInstance;
    private ChatModel model;

    private ModelFactory()
    {
        model = new ChatModel();
    }

    public static ModelFactory getModelFactoryInstance()
    {
        if (modelFactoryInstance == null)
        {
            modelFactoryInstance = new ModelFactory();
        }
        return modelFactoryInstance;
    }

    public ChatModel getModel() {
        return model;
    }
}
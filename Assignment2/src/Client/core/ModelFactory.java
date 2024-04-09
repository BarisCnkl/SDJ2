package Client.core;

import Client.model.ChatModel;

public class ModelFactory
{
    private ChatModel model;

    public ChatModel getModel()
    {
        if(model == null)
        {
            model = new ChatModel();
        }
        return model;
    }
}
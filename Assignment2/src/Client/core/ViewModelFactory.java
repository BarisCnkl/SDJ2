package Client.core;
import Client.*;
import Client.Viewmodel.ChatViewmodel;

public class ViewModelFactory
{
    private static ViewModelFactory instance;
    private ChatViewmodel chatViewmodel;
    private ModelFactory modelFactory;

    private ViewModelFactory(ModelFactory modelFactory)
    {
        this.modelFactory = modelFactory;
    }
    public static ViewModelFactory getInstance(ModelFactory modelFactory)
    {
        if (instance == null)
        {
            instance = new ViewModelFactory(modelFactory);
        }
        return instance;
    }

    public ChatViewmodel getChatViewmodel()
    {
        if(chatViewmodel == null)
        {
            chatViewmodel = new ChatViewmodel(modelFactory.getModel());
        }
        return chatViewmodel;
    }
}
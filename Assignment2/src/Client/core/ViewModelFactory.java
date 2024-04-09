package Client.core;
import Client.*;
import Client.views.ChatViewModel;

public class ViewModelFactory
{
    private ChatViewModel chatViewmodel;
    private ModelFactory modelFactory;

    public ViewModelFactory(ModelFactory modelFactory)
    {
        this.modelFactory = modelFactory;
    }

    public ChatViewModel getChatViewmodel()
    {
        if(chatViewmodel == null)
        {
            chatViewmodel = new ChatViewModel(modelFactory.getModel());
        }
        return chatViewmodel;
    }
}
package main.Factories;
import ViewModel.AddVinylViewModel;
import ViewModel.VinylListViewModel;

public class ViewModelFactory
{
    private VinylListViewModel vinylListViewModel;
    private AddVinylViewModel addVinylViewModel;

    private ModelFactory modelFactory;

    public ViewModelFactory(ModelFactory modelFactory)
    {
        this.modelFactory = modelFactory;
    }

    public VinylListViewModel getVinylListViewModel()
    {
        if(vinylListViewModel == null)
        {
            vinylListViewModel = new VinylListViewModel(modelFactory.getModel());
        }
        return vinylListViewModel;
    }

    public AddVinylViewModel getAddVinylViewModel()
    {
        if(addVinylViewModel == null)
        {
            addVinylViewModel = new AddVinylViewModel(modelFactory.getModel());
        }
        return addVinylViewModel;
    }
}
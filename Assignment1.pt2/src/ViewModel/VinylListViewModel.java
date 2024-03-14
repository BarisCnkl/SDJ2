package ViewModel;


import Datafiles.User;
import Datafiles.Vinyl.Vinyl;
import Model.VinylListModel;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.beans.PropertyChangeEvent;
import java.util.ArrayList;
import java.util.List;

public class VinylListViewModel
{
    private VinylListModel model;
    private ObservableList<Vinyl> vinyls;
    private IntegerProperty integerProperty;

    public VinylListViewModel(VinylListModel model) {
        this.model = model;
        vinyls = FXCollections.observableArrayList();
        model.addPropertyChangeListener("vinylUpdate", this::refresh);
        integerProperty = new SimpleIntegerProperty();
    }

    public ObservableList<Vinyl> getVinyls() {
        return vinyls;
    }

    public void refresh(PropertyChangeEvent event)
    {
        List<Vinyl> vinyls1 = (List<Vinyl>) event.getNewValue();
        vinyls.clear();
        vinyls.addAll(vinyls1);
    }

    public IntegerProperty integerPropertyProperty()
    {
        return integerProperty;
    }

    public void removeVinyl(Vinyl vinyl)
    {
        model.removeVinyl(vinyl);
    }

    public void borrowVinyl(Vinyl vinyl)
    {
        model.borrowVinyl(vinyl, model.getLoggedInUser());
    }

    public void reserveVinyl(Vinyl vinyl)
    {
        model.reserveVinyl(vinyl, model.getLoggedInUser());
    }

    public void returnVinyl(Vinyl vinyl)
    {
        model.returnVinyl(vinyl, model.getLoggedInUser());
    }
    public void logIn()
    {
        model.setLoggedInUser(new User(integerProperty.get()));
    }

}

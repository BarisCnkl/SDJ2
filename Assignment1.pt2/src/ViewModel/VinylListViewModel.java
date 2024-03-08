package ViewModel;


import Datafiles.Vinyl.Vinyl;
import Model.VinylListModel;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.beans.PropertyChangeEvent;
import java.util.ArrayList;
import java.util.List;

public class VinylListViewModel
{
    private VinylListModel model;
    private ObservableList<Vinyl> vinyls;

    public VinylListViewModel(VinylListModel model) {
        this.model = model;
        vinyls = FXCollections.observableArrayList();
        model.addPropertyChangeListener("vinylUpdate", this::refresh);
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

    public void removeVinyl(Vinyl vinyl)
    {
        model.removeVinyl(vinyl);
    }

    public void borrowVinyl(Vinyl vinyl)
    {
        model.borrowVinyl(vinyl);
    }

    public void reserveVinyl(Vinyl vinyl)
    {
        model.reserveVinyl(vinyl);
    }

    public void returnVinyl(Vinyl vinyl)
    {
        model.returnVinyl(vinyl);
    }

}

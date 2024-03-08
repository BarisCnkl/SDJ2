package ViewModel;

import Datafiles.Vinyl.Vinyl;
import Model.VinylListModel;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class AddVinylViewModel
{
    private VinylListModel model;
    private StringProperty titelProperty;
    private StringProperty artistProperty;
    private StringProperty dateProperty;

    public AddVinylViewModel(VinylListModel model) {
        this.model = model;
        titelProperty = new SimpleStringProperty();
        artistProperty = new SimpleStringProperty();
        dateProperty = new SimpleStringProperty();
    }

    public void addVinyl()
    {
        model.addVinyl(titelProperty.get(), artistProperty.get(), dateProperty.get());
    }

    public StringProperty titelPropertyProperty() {
        return titelProperty;
    }

    public StringProperty artistPropertyProperty() {
        return artistProperty;
    }

    public StringProperty datePropertyProperty() {
        return dateProperty;
    }
}

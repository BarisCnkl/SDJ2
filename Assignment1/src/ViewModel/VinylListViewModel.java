package ViewModel;

import Model.Model;
import Model.Vinyl;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.beans.PropertyChangeEvent;
import java.util.List;

public class VinylListViewModel
{
  private Model model;
  private ObservableList<Vinyl> vinyls;

  public VinylListViewModel(Model model)
  {
    this.model = model;
    vinyls = FXCollections.observableArrayList();
    model.addPropertyChangeListener("vinylUpdate", this:: refresh);
  }

  public ObservableList<Vinyl> getVinyls()
  {
    return vinyls;
  }
  public void refresh(PropertyChangeEvent event)
  {
    vinyls.clear();
    vinyls.addAll((List<Vinyl>) event.getNewValue());
  }
}

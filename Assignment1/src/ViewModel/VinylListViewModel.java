package ViewModel;

import Model.Model;
import Model.Vinyl;
import Model.User;
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
  public void removeVinyl(Vinyl vinyl)
  {
    model.removeVinyl(vinyl);
  }
  public void borrowVinyl(Vinyl vinyl, User user)
  {
    model.borrowVinyl(vinyl, user);
  }
  public void reserveVinyl(Vinyl vinyl, User user)
  {
    model.reserveVinyl(vinyl,user);
  }
  public void returnVinyl(Vinyl vinyl)
  {
    model.returnVinyl(vinyl);
  }
}

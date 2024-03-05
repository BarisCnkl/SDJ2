package View;

import Model.States.VinylState;
import Model.User;
import Model.Vinyl;
import ViewModel.VinylListViewModel;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.awt.*;

public class VinylListController
{
  @FXML TableView tableView;
  @FXML TableColumn<Vinyl, String> titelTableView;
  @FXML TableColumn<Vinyl, String> artistTableView;
  @FXML TableColumn<Vinyl, String> releaseYearTableView;
  @FXML TableColumn<Vinyl, VinylState> statusTableView;
  @FXML TableColumn<Vinyl, User> reservedIdTableView;
  @FXML Button addVinylButton;
  @FXML Button removeVinylButton;
  @FXML Button borrowButton;
  @FXML Button reserveButton;
  @FXML Button returnButton;
  private VinylListViewModel vinylListViewModel;

  public VinylListController(VinylListViewModel vinylListViewModel)
  {
    this.vinylListViewModel = vinylListViewModel;
  }
  public void initialize()
  {
    titelTableView.setCellValueFactory(new PropertyValueFactory<>("titel"));
    artistTableView.setCellValueFactory(new PropertyValueFactory<>("artist"));
    releaseYearTableView.setCellValueFactory(new PropertyValueFactory<>("date"));
    statusTableView.setCellValueFactory(new PropertyValueFactory<>("vinylState"));
    reservedIdTableView.setCellValueFactory(new PropertyValueFactory<>("user"));
    tableView.getItems().addAll(vinylListViewModel.getVinyls());
  }
}

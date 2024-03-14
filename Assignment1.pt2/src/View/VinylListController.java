package View;

import Datafiles.Vinyl.States.VinylState;
import Datafiles.Vinyl.Vinyl;
import ViewModel.VinylListViewModel;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.util.converter.NumberStringConverter;

public class VinylListController
{
    @FXML
    TableView<Vinyl> vinylList;
    @FXML
    TableColumn<Vinyl, String> titleColumn;
    @FXML
    TableColumn<Vinyl, String> artistColumn;
    @FXML
    TableColumn<Vinyl, String> releaseYearColumn;
    @FXML
    TableColumn<Vinyl, VinylState> statusColumn;
    @FXML
    TableColumn<Vinyl, VinylState> ReservedId;
    @FXML
    TableColumn<Vinyl, VinylState> BorrowedId;
    @FXML
    Button removeVinyl;
    @FXML
    Button borrowVinyl;
    @FXML
    Button reserveVinyl;
    @FXML
    Button returnVinyl;
    @FXML
    Button LogInButton;
    @FXML TextField IdTextField;

    VinylListViewModel vinylListViewModel;

    public VinylListController(VinylListViewModel vinylListViewModel) {
        this.vinylListViewModel = vinylListViewModel;
    }

    public void initialize()
    {
        vinylList.setItems(vinylListViewModel.getVinyls());
        titleColumn.setCellValueFactory(new PropertyValueFactory<>("title"));
        artistColumn.setCellValueFactory(new PropertyValueFactory<>("artist"));
        releaseYearColumn.setCellValueFactory(new PropertyValueFactory<>("releaseYear"));
        statusColumn.setCellValueFactory(new PropertyValueFactory<>("currentState"));
        ReservedId.setCellValueFactory(new PropertyValueFactory<>("reservedBy"));
        BorrowedId.setCellValueFactory(new PropertyValueFactory<>("borrowedBy"));
        IdTextField.textProperty().bindBidirectional(vinylListViewModel.integerPropertyProperty(),new NumberStringConverter());
    }

    public void onRemoveVinylButtonPressed()
    {
        Vinyl vinyl = (Vinyl) vinylList.getSelectionModel().getSelectedItem();
        vinylListViewModel.removeVinyl(vinyl);

    }

    public void onBorrowVinylButtonPressed()
    {
        Vinyl vinyl = (Vinyl) vinylList.getSelectionModel().getSelectedItem();
        vinylListViewModel.borrowVinyl(vinyl);
    }

    public void onReserveVinylButtonPressed()
    {
        Vinyl vinyl = (Vinyl) vinylList.getSelectionModel().getSelectedItem();
        vinylListViewModel.reserveVinyl(vinyl);
    }
    public void onReturnVinylButtonPressed()
    {
        Vinyl vinyl = (Vinyl) vinylList.getSelectionModel().getSelectedItem();
        vinylListViewModel.returnVinyl(vinyl);
    }
    public void onLogInButtonPressed()
    {
        vinylListViewModel.logIn();
    }
}
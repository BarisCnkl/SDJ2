package View;

import ViewModel.AddVinylViewModel;
import javafx.fxml.FXML;

import javafx.scene.control.*;

public class AddVinylController {

    @FXML
    TextField titelfield;
    @FXML
    TextField artistField;
    @FXML
    TextField releaseYearField;
    @FXML
    Button addVinylButton;

    AddVinylViewModel addVinylViewModel;

    public AddVinylController(AddVinylViewModel addVinylViewModel) {
        this.addVinylViewModel = addVinylViewModel;
    }

    public void initialize()
    {
        this.titelfield.textProperty().bindBidirectional(addVinylViewModel.titelPropertyProperty());
        this.artistField.textProperty().bindBidirectional(addVinylViewModel.artistPropertyProperty());
        this.releaseYearField.textProperty().bindBidirectional(addVinylViewModel.datePropertyProperty());
    }

    public void onAddVinylButtonPressed()
    {
        addVinylViewModel.addVinyl();
    }
}

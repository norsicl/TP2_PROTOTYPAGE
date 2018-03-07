package m1.piu.Controller;

import javafx.beans.property.ReadOnlyIntegerWrapper;
import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

public class ControllerMainContactPanel implements Initializable {

    @FXML
    public TableView<String> tableView;

    @FXML
    private ListView<String> bookAdress;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        bookAdress.getItems().add("All contacts");
        bookAdress.getItems().add("Private contacts");
        bookAdress.getItems().add("Professional contacts");
        bookAdress.getItems().add("Student contacts");

        List<Integer> intValues = Arrays.asList(1, 2, 3, 4, 5);
        List<String> stringValues = Arrays.asList("One", "Two", "Three", "Four", "Five");

        TableView<String> table = tableView;
        for (int i = 0; i < intValues.size() && i < stringValues.size(); i++) {
            table.getItems().add(String.valueOf(i));
        }

        TableColumn<Integer, Number> intColumn = new TableColumn<>("Value");
        intColumn.setCellValueFactory(cellData -> {
            Integer rowIndex = cellData.getValue();
            return new ReadOnlyIntegerWrapper(intValues.get(rowIndex));
        });

        TableColumn<Integer, String> nameColumn = new TableColumn<>("Name");
        nameColumn.setCellValueFactory(cellData -> {
            Integer rowIndex = cellData.getValue();
            return new ReadOnlyStringWrapper(stringValues.get(rowIndex));
        });

       // todo : pour afficher des info dans le tableau

    }
}

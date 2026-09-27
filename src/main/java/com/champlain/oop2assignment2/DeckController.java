package com.champlain.oop2assignment2;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.Alert;

public class DeckController {
    @FXML
    private TextArea aDeckTextArea;

    private final Deck aDeck = new Deck();

    public void initialize() {
        this.displayDeck();
    }

    @FXML
    protected void onShuffleButtonClick() {
        this.aDeck.shuffle();
        this.displayDeck();
    }

    @FXML
    protected void onSortButtonClick() {
        this.aDeck.sort();
        this.displayDeck();
    }

//    @FXML
//    protected void onSortButtonClick() {
//        this.aDeckTextArea.setText("This does not sort anything yet.");
//    }

    @FXML
    protected void onShowButtonClick() {
        for (Card card : aDeck) {
            Alert confirmationAlert = new Alert(Alert.AlertType.CONFIRMATION, card.toString());
            confirmationAlert.showAndWait();
        }
    }
//    @FXML
//    protected void onShowButtonClick() {
//        this.aDeckTextArea.setText("This does not step through anything yet.");
//    }

    private void displayDeck () {
        this.aDeckTextArea.setText(this.aDeck.toString());
    }
}
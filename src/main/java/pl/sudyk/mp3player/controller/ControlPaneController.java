package pl.sudyk.mp3player.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.control.ToggleButton;

public class ControlPaneController {

    @FXML
    private Button nextButton;

    @FXML
    private ToggleButton playButton;

    @FXML
    private Button previousButton;

    @FXML
    private Slider progressSlider;

    @FXML
    private Slider volumeSlider;

    public void initialize() {
        System.out.println("Control controller created");
        configureButtons();
        configureSliders();
    }

    private void configureSliders() {
        volumeSlider.valueProperty().addListener((observable, oldValue, newValue) ->
                System.out.println("Zmiana głośności " + newValue.doubleValue()));

        progressSlider.valueProperty().addListener(observable ->
                System.out.println("Przesuniecie piosneki"));
    }

    private void configureButtons() {
        previousButton.setOnAction(event -> System.out.println("Poprzednia piosenka"));
        nextButton.setOnAction(x -> System.out.println("Następna piosenka"));
        playButton.setOnAction(event -> {
            if(playButton.isSelected()) {
                System.out.println("Play");
            } else {
                System.out.println("Stop");
            }
        });
    }

}

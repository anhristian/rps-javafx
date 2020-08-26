package edu.cnm.deepdive.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ToggleButton;

public class RpsController {


  @FXML private ToggleButton toggleRun;
  @FXML private Button reset; //this comes from rps.fxml file

  @FXML
  private void reset(ActionEvent actionEvent) {
    //TODO Reinitialize Arena
  }
  @FXML
  private void toggleRun(ActionEvent actionEvent) {
    //TODO Toggle running state of model
  }
}

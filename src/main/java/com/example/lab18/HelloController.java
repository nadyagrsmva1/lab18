package com.example.lab18;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class HelloController {
    @FXML
    private TextArea txtChat;
    @FXML
    private TextField txtMsg;

    protected void sendMessage() {
        txtChat.setText(txtChat.getText() + "\nYour message: " + txtMsg.getText());
        txtMsg.setText("");
    }
    @FXML
    protected void onBtnSendClicked() {
        sendMessage();
    }
    @FXML
    protected void onTxtMsgKeyDown(KeyEvent key) {
        if (key.getCode() == KeyCode.ENTER)
            sendMessage();
    }
}
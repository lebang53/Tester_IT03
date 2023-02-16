package com.nthop.mavenproject1;

import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        int a = 10;
        if(a > 0 && a < 9)
            App.setRoot("secondary");
    }
}

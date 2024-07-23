module mp3player {
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;
    exports pl.sudyk.mp3player.main to javafx.graphics;
    opens pl.sudyk.mp3player.controller to javafx.fxml;
}
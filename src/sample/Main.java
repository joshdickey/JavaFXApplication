package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        GridPane grid = new GridPane();
        grid.setMinWidth(600);
        grid.setMinHeight(400);

        grid.setVgap(5);
        grid.setHgap(20);
        grid.setGridLinesVisible(false);

        Label tableArea = new Label("this is where tasks table will come");
        tableArea.setMinWidth(600);

        GridPane.setConstraints(tableArea, 1,1,3,1);

        TextField taskName = new TextField();
        taskName.setPromptText("Enter Task Name");
        taskName.setMinWidth(300);
        GridPane.setConstraints(taskName, 2, 2);

//        TextField another = new TextField();
//        taskName.setPromptText("Enter Task Name");
//        GridPane.setConstraints(another, 2, 3);
        ComboBox priority = new ComboBox();
        priority.getItems().addAll("High", "Low", "Medium");
        priority.setPromptText("Enter Priority");
        GridPane.setConstraints(priority, 3, 2);

        grid.getChildren().addAll(tableArea, taskName, priority);
//        grid.setGridLinesVisible(true);
//        grid.setHgap(10);
//        grid.setVgap(10);
//
//        Button b1= new Button("First Button");
//        Button b2= new Button("second Button");
//        Button b3= new Button("three");
//        Button b4= new Button("four");
//
//        GridPane.setConstraints(b1, 1, 1);
//        GridPane.setConstraints(b2, 2, 3);
//        GridPane.setConstraints(b3, 3, 4);
//        GridPane.setConstraints(b4, 1, 4);
//
//        BorderPane borderPane = new BorderPane();
//        borderPane.setTop(new Button("top"));
//        borderPane.setBottom(new Button("bottom"));
//        borderPane.setLeft(new Button("Left"));
//        borderPane.setRight(new Button("Right"));
//        GridPane.setConstraints(borderPane, 1, 3, 1, 1);
//
//        grid.getChildren().addAll(b1, b2, b3, b4, borderPane);

        Scene scene = new Scene(grid , 600, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Do-It");
        primaryStage.setAlwaysOnTop(true);
        primaryStage.setResizable(false);
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}

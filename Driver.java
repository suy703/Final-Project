import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Driver extends Application {

	Scene scene1, scene2, scene3;
	
	public static void main(String[] args) {
        launch(args);
    }
	
	public void start(Stage stage) {
		
		scene1(stage, scene1);
		scene2(stage, scene2);
		scene3(stage, scene3);
		stage.setTitle("Auto Insurance Quote Form"); // Set the stage title
		stage.setScene(scene1); // Place the scene in the stage
		stage.show(); // Display the stage
	}
	
	private void scene1(Stage stage, Scene scene) {
		BorderPane borderPane = new BorderPane();
		borderPane.setPrefSize(600, 400);
		VBox topPane = new VBox();
		Pane centerPane1 = new Pane();
		HBox bottomPane = new HBox();
		bottomPane.setPrefHeight(69);
		bottomPane.setAlignment(Pos.CENTER);
		
		borderPane.setTop(topPane);
		borderPane.setCenter(centerPane1);
		borderPane.setBottom(bottomPane);
		
		//MENU PROPERTIES
		MenuBar menuBar = new MenuBar();
		Menu menuFile = new Menu("File");
		MenuItem exit = new MenuItem("Exit");
		exit.setOnAction(e -> {
		    System.exit(0);
		});
		
		//TITLE
		Label title1 = new Label("General Information");
		title1.setLayoutX(230);
		title1.setLayoutY(27);
		
		// add Labels, TextFields, ChoiceBox, & CheckBox HERE
		//
		//
		//
	
		//NEXT BUTTON
		Button next = new Button("Next");
		next.setOnAction(e -> {
			stage.setScene(scene2);
			//
			// next window statements
			//
		});
		
		menuBar.getMenus().add(menuFile);
		menuFile.getItems().add(exit);
		
		topPane.getChildren().add(menuBar);
		centerPane1.getChildren().addAll(title1);
		bottomPane.getChildren().add(next);
		scene1 = new Scene(borderPane);
	}
	
	private void scene2(Stage stage, Scene scene) {
		BorderPane borderPane = new BorderPane();
		borderPane.setPrefSize(600, 400);
		VBox topPane = new VBox();
		Pane centerPane = new Pane();
		HBox bottomPane = new HBox();
		bottomPane.setPrefHeight(69);
		bottomPane.setAlignment(Pos.CENTER);
		
		borderPane.setTop(topPane);
		borderPane.setCenter(centerPane);
		borderPane.setBottom(bottomPane);
		
		//MENU PROPERTIES
		MenuBar menuBar = new MenuBar();
		Menu menuFile = new Menu("File");
		MenuItem exit = new MenuItem("Exit");
		exit.setOnAction(e -> {
		    System.exit(0);
		});
		
		//TITLE
		Label title = new Label("Vehicle Information");
		title.setLayoutX(230);
		title.setLayoutY(27);
		
		// add Labels, TextFields, ChoiceBox, & CheckBox HERE
		//
		//
		//
		
		//BACK BUTTON
		Button back = new Button("Back");
		back.setOnAction(e -> {
			stage.setScene(scene1);
			//
			// next window statements
			//
		});
	
		//NEXT BUTTON
		Button next = new Button("Next");
		next.setOnAction(e -> {
			stage.setScene(scene3);
			//
			// next window statements
			//
		});
		
		menuBar.getMenus().add(menuFile);
		menuFile.getItems().add(exit);
		
		topPane.getChildren().add(menuBar);
		centerPane.getChildren().addAll(title);
		bottomPane.getChildren().addAll(back, next);
		scene2 = new Scene(borderPane);
	}
	
	private void scene3(Stage stage, Scene scene) {
		BorderPane borderPane = new BorderPane();
		borderPane.setPrefSize(600, 400);
		VBox topPane = new VBox();
		Pane centerPane = new Pane();
		HBox bottomPane = new HBox();
		bottomPane.setPrefHeight(69);
		bottomPane.setAlignment(Pos.CENTER);
		
		borderPane.setTop(topPane);
		borderPane.setCenter(centerPane);
		borderPane.setBottom(bottomPane);
		
		//MENU PROPERTIES
		MenuBar menuBar = new MenuBar();
		Menu menuFile = new Menu("File");
		MenuItem exit = new MenuItem("Exit");
		exit.setOnAction(e -> {
		    System.exit(0);
		});
		
		//TITLE
		Label title = new Label("Driver Information");
		title.setLayoutX(230);
		title.setLayoutY(27);
		
		// add Labels, TextFields, ChoiceBox, & CheckBox HERE
		//
		//
		//
		
		//BACK BUTTON
		Button back = new Button("Back");
		back.setOnAction(e -> {
			stage.setScene(scene2);
			
			//
			// next window statements
			//
		});
	
		//NEXT BUTTON
		Button submit = new Button("Submit");
		submit.setOnAction(e -> {
			System.exit(0);
		});
		
		menuBar.getMenus().add(menuFile);
		menuFile.getItems().add(exit);
		
		topPane.getChildren().add(menuBar);
		centerPane.getChildren().addAll(title);
		bottomPane.getChildren().addAll(back, submit);
		scene3 = new Scene(borderPane);
	}
}

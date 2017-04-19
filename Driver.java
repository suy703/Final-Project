import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Driver extends Application implements ClientInfo {

	Scene scene1, scene2, scene3;
	
	public static void main(String[] args) {
        launch(args);
    }
	
	public void start(Stage stage) {
		
		generalInfo(stage, scene1);
		vehicleInfo(stage, scene2);
		driverInfo(stage, scene3);
		stage.setTitle("Auto Insurance Quote Form"); // Set the stage title
		stage.setScene(scene1); // Place the scene in the stage
		stage.show(); // Display the stage
	}
	
	public void generalInfo(Stage stage, Scene scene) {
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
	
	public void vehicleInfo(Stage stage, Scene scene) {
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
	
	public void driverInfo(Stage stage, Scene scene) {
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
		
		Label driver1Name = new Label("Driver #1 Name:");
		driver1Name.setLayoutX(14);
		driver1Name.setLayoutY(66);
		Label driver2Name = new Label("Driver #2 Name:");
		driver2Name.setLayoutX(14);
		driver2Name.setLayoutY(130);
		Label driver3Name = new Label("Driver #3 Name:");
		driver3Name.setLayoutX(14);
		driver3Name.setLayoutY(194);
		
		Label dob1 = new Label("Date of Birth:");
		dob1.setLayoutX(152);
		dob1.setLayoutY(66);
		Label dob2 = new Label("Date of Birth:");
		dob2.setLayoutX(152);
		dob2.setLayoutY(130);
		Label dob3 = new Label("Date of Birth:");
		dob3.setLayoutX(152);
		dob3.setLayoutY(194);

		Label license1 = new Label("License #:");
		license1.setLayoutX(256);
		license1.setLayoutY(66);
		Label license2 = new Label("License #:");
		license2.setLayoutX(256);
		license2.setLayoutY(130);
		Label license3 = new Label("License #:");
		license3.setLayoutX(256);
		license3.setLayoutY(194);
	
		Label age1 = new Label("Age First License:");
		age1.setLayoutX(359);
		age1.setLayoutY(66);
		Label age2 = new Label("Age First License:");
		age2.setLayoutX(359);
		age2.setLayoutY(130);
		Label age3 = new Label("Age First License:");
		age3.setLayoutX(359);
		age3.setLayoutY(194);

		Label status1 = new Label("Marital Status:");
		status1.setLayoutX(460);
		status1.setLayoutY(66);
		Label status2 = new Label("Marital Status:");
		status2.setLayoutX(460);
		status2.setLayoutY(130);
		Label status3 = new Label("Marital Status:");
		status3.setLayoutX(460);
		status3.setLayoutY(194);

		TextField driver1Text = new TextField();
		driver1Text.setLayoutX(14);
		driver1Text.setLayoutY(81);
		driver1Text.setPrefWidth(122);
		driver1Text.setPrefHeight(25);
		TextField driver2Text = new TextField();
		driver2Text.setLayoutX(14);
		driver2Text.setLayoutY(145);
		driver2Text.setPrefWidth(122);
		driver2Text.setPrefHeight(25);
		TextField driver3Text = new TextField();
		driver3Text.setLayoutX(14);
		driver3Text.setLayoutY(209);
		driver3Text.setPrefWidth(122);
		driver3Text.setPrefHeight(25);
		
		TextField dob1Text = new TextField();
		dob1Text.setLayoutX(152);
		dob1Text.setLayoutY(81);
		dob1Text.setPrefWidth(88);
		dob1Text.setPrefHeight(25);
		TextField dob2Text = new TextField();
		dob2Text.setLayoutX(152);
		dob2Text.setLayoutY(145);
		dob2Text.setPrefWidth(88);
		dob2Text.setPrefHeight(25);
		TextField dob3Text = new TextField();
		dob3Text.setLayoutX(152);
		dob3Text.setLayoutY(209);
		dob3Text.setPrefWidth(88);
		dob3Text.setPrefHeight(25);
		
		TextField lic1Text = new TextField();
		lic1Text.setLayoutX(256);
		lic1Text.setLayoutY(81);
		lic1Text.setPrefWidth(89);
		lic1Text.setPrefHeight(25);
		TextField lic2Text = new TextField();
		lic2Text.setLayoutX(256);
		lic2Text.setLayoutY(145);
		lic2Text.setPrefWidth(89);
		lic2Text.setPrefHeight(25);
		TextField lic3Text = new TextField();
		lic3Text.setLayoutX(256);
		lic3Text.setLayoutY(209);
		lic3Text.setPrefWidth(89);
		lic3Text.setPrefHeight(25);
		
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
		centerPane.getChildren().addAll(title, driver1Name, driver2Name, driver3Name, dob1, dob2, dob3, license1,
				license2, license3, age1, age2, age3, status1, status2, status3, driver1Text, driver2Text,
				driver3Text, dob1Text, dob2Text, dob3Text, lic1Text, lic2Text, lic3Text);
		bottomPane.getChildren().addAll(back, submit);
		scene3 = new Scene(borderPane);
	}
}

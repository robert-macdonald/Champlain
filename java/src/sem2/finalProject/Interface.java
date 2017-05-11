package sem2.finalProject;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.control.Button;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Interface extends Application {
	//Create text area
	private TextArea textArea = new TextArea();
	
	//Create buttons
	private Button readButton = new Button("Read list");
	private Button sortButton = new Button("Sort list");
	private Button removeButton = new Button("Remove some");
	
	//Create list
	private LinkedList birds = new LinkedList();
	
	public static void main(String[] args) {
		//Launches the interface
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) {
		//Setup dimensions for the text area
		textArea.setPrefColumnCount(20);
		textArea.setPrefRowCount(30);
		
		//Register event handlers for buttons
		readButton.setOnAction(new ReadButtonHandler());
		sortButton.setOnAction(new SortButtonHandler());
		removeButton.setOnAction(new RemoveButtonHandler());
		
		//Put buttons in HBox
		HBox hbox = new HBox(10, textArea, readButton, sortButton, removeButton);
		//align HBox
		hbox.setAlignment(Pos.CENTER);
		hbox.setPadding(new Insets(10));
		
		//Create scene and display it
		Scene scene = new Scene(hbox);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	//Event Handler class for the "Read List" button
	class ReadButtonHandler implements EventHandler<ActionEvent> {
		@Override
		public void handle(ActionEvent event) {

			try {

				File file = new File("birds1.txt");
				Scanner fileReader = new Scanner(file);

				while (fileReader.hasNextLine()){
					birds.add(fileReader.nextLine());
				}

				textArea.setText(birds.toString());

			} catch (FileNotFoundException e){
				System.out.println(e.getMessage());
			}

		}
	}
	
	class SortButtonHandler implements EventHandler<ActionEvent> {
		@Override
		public void handle(ActionEvent event) {
			
			birds.sort();
			textArea.setText(birds.toString());
			
		}
	}
	
	class RemoveButtonHandler implements EventHandler<ActionEvent> {
		@Override
		public void handle(ActionEvent event) {

			try {

				int count = 0;

				File file = new File("birds_2.txt");
				Scanner fileReader = new Scanner(file);

				while (fileReader.hasNextLine()){
					String currentBird = fileReader.nextLine();

					if (birds.find(currentBird)){
						birds.removeIndex(count);
					} else {
						count++;
					}
				}

				textArea.setText(birds.toString());

			} catch (FileNotFoundException e){
				System.out.println(e.getMessage());
			}
			
		}
	}
}


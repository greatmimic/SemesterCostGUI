package application;

import javafx.application.*;
import javafx.collections.FXCollections;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;


//This program assumes the user to select both the Dorm Name and the Meal Plan to calculate the total cost of both charges.

public class SemesterCost extends Application {

	//variables
	String dormName;
	String mealPlan;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		//title
		primaryStage.setTitle("Semester Cost Calculator");
		//title label
		Label titleLabel = new Label("Semester Cost Calculator");
		
		//choice box menu
		String dorm[] = {
				"Allen Hall",
				"Pike Hall",
				"Farthing Hall",
				"University Suites"
		};
		String meal[] = {
				"7 Meals",
				"14 Meals",
				"Unlimited Meals"
		};
		//choice box label
		Label dormLabel = new Label("Select Dorm");
		Label mealLabel = new Label("Select Plan");
		
		//result label
		Label result = new Label();
		Label resultLabel = new Label("Total Charges For This Semester: ");
	
		
		//dorm choice box
		ChoiceBox<String> ch1 = new ChoiceBox<String>(FXCollections.observableArrayList(dorm));
		//choice box set dormName value via selection
		ch1.setOnAction(e->{
			dormName = ch1.getSelectionModel().getSelectedItem();
		});
		
		//meal plan choice box
		ChoiceBox <String> ch2 = new ChoiceBox<String>(FXCollections.observableArrayList(meal));
		//choice box set mealPlan value via selection
		ch2.setOnAction(e ->{
			mealPlan = ch2.getSelectionModel().getSelectedItem();
		});
		
		
		//submit button
		Button submit = new Button("Submit");
		//submit button on action nested switch statements to check for dorm name and meal plan. 
		submit.setOnAction(e ->{
			double dormCost = 0.0;
			double mealCost = 0.0;
			double total = 0.0;
			
			switch(dormName) {
			
			case "Allen Hall" :
				dormCost = 1800;
				switch(mealPlan) {
				case "7 Meals" :
					mealCost = 600;
					total = dormCost + mealCost;
					break;
				case "14 Meals" :
					mealCost = 1100;
					total = dormCost + mealCost;
					break;
				case "Unlimited Meals" :
					mealCost = 1800;
					total = dormCost + mealCost;
					break;
				default:
					break;
				}
				break;
			case "Pike Hall" :
				dormCost = 2200;
				switch(mealPlan) {
				case "7 Meals" :
					mealCost = 600;
					total = dormCost + mealCost;
					break;
				case "14 Meals" :
					mealCost = 1100;
					total = dormCost + mealCost;
					break;
				case "Unlimited Meals" :
					mealCost = 1800;
					total = dormCost + mealCost;
					break;
				default:
					break;
				}
				break;
			case "Farthing Hall" :
				dormCost = 2800;
				switch(mealPlan) {
				case "7 Meals" :
					mealCost = 600;
					total = dormCost + mealCost;
					break;
				case "14 Meals" :
					mealCost = 1100;
					total = dormCost + mealCost;
					break;
				case "Unlimited Meals" :
					mealCost = 1800;
					total = dormCost + mealCost;
					break;
				default:
					break;
				}
				break;
			case "University Suites" :
				dormCost = 3000;
				switch(mealPlan) {
				case "7 Meals" :
					mealCost = 600;
					total = dormCost + mealCost;
					break;
				case "14 Meals" :
					mealCost = 1100;
					total = dormCost + mealCost;
					break;
				case "Unlimited Meals" :
					mealCost = 1800;
					total = dormCost + mealCost;
					break;
				default:
					break;
				}
				break;
			default: break;
			}
			result.setText(String.format("$%, .2f Dollars", total));
		});
		
		//VBox for choice box
		VBox choice = new VBox(10, dormLabel, ch1, mealLabel, ch2);
		choice.setAlignment(Pos.CENTER);
		
		//HBox for Cost 
		HBox cost = new HBox(10, resultLabel, result);
		cost.setAlignment(Pos.CENTER);
		
		//VBox
		VBox mainBox = new VBox(40, titleLabel, choice, submit, cost);
		mainBox.setAlignment(Pos.CENTER);
		
		//print scene
		Scene scene = new Scene(mainBox, 600,400);
		primaryStage.setScene(scene);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.show();
		
	}

}

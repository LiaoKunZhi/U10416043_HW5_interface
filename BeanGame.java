//U1049643   廖崑智

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;

//Class
public class BeanGame extends Application {

	//Create a no-arg constructor
	public BeanGame () {
	}

	@Override

	//Method
	public void start (Stage primaryStage) {

		//Create a new pane
		Pane pane = new Pane();

		//Make the machine
		Line L1=new Line();
		L1.setStartX(180);
		L1.setStartY(39);
		L1.setEndX(285);
		L1.setEndY(168);

		Line L2=new Line();
		L2.setStartX(285);
		L2.setStartY(210);
		L2.setEndX(45);
		L2.setEndY(210);

		Line L3=new Line();
		L3.setStartX(150);
		L3.setStartY(39);
		L3.setEndX(45);
		L3.setEndY(168);

		Line L4=new Line();
		L4.setStartX(285);
		L4.setStartY(168);
		L4.setEndX(285);
		L4.setEndY(210);

		Line L5=new Line();
		L5.setStartX(45);
		L5.setStartY(210);
		L5.setEndX(45);
		L5.setEndY(168);

		Line L6=new Line();
		L6.setStartX(180);
		L6.setStartY(39);
		L6.setEndX(180);
		L6.setEndY(24);

		Line L7=new Line();
		L7.setStartX(150);
		L7.setStartY(39);
		L7.setEndX(150);
		L7.setEndY(24);

		Line L8=new Line();
		L8.setStartX(75);
		L8.setStartY(168);
		L8.setEndX(75);
		L8.setEndY(210);

		Line L9=new Line();
		L9.setStartX(105);
		L9.setStartY(168);
		L9.setEndX(105);
		L9.setEndY(210);

		Line L10=new Line();
		L10.setStartX(135);
		L10.setStartY(168);
		L10.setEndX(135);
		L10.setEndY(210);

		Line L11=new Line();
		L11.setStartX(165);
		L11.setStartY(168);
		L11.setEndX(165);
		L11.setEndY(210);

		Line L12=new Line();
		L12.setStartX(195);
		L12.setStartY(168);
		L12.setEndX(195);
		L12.setEndY(210);

		Line L13=new Line();
		L13.setStartX(255);
		L13.setStartY(168);
		L13.setEndX(255);
		L13.setEndY(210);

		Line L14=new Line();
		L14.setStartX(225);
		L14.setStartY(168);
		L14.setEndX(225);
		L14.setEndY(210);

		Ellipse D1 = new Ellipse(165,60,5,5);
		Ellipse D2 = new Ellipse(150,78,5,5);
		Ellipse D3 = new Ellipse(180,78,5,5);
		Ellipse D4 = new Ellipse(165,96,5,5);
		Ellipse D5 = new Ellipse(195,96,5,5);
		Ellipse D6 = new Ellipse(135,96,5,5);
		Ellipse D7 = new Ellipse(120,114,5,5);
		Ellipse D8 = new Ellipse(210,114,5,5);
		Ellipse D9 = new Ellipse(150,114,5,5);
		Ellipse D10 = new Ellipse(180,114,5,5);
		Ellipse D11 = new Ellipse(225,132,5,5);
		Ellipse D12 = new Ellipse(105,132,5,5);
		Ellipse D13 = new Ellipse(135,132,5,5);
		Ellipse D14 = new Ellipse(165,132,5,5);
		Ellipse D15 = new Ellipse(195,132,5,5);
		Ellipse D16 = new Ellipse(240,150,5,5);
		Ellipse D17 = new Ellipse(90,150,5,5);
		Ellipse D18 = new Ellipse(120,150,5,5);
		Ellipse D19 = new Ellipse(150,150,5,5);
		Ellipse D20 = new Ellipse(180,150,5,5);
		Ellipse D21 = new Ellipse(210,150,5,5);
		Ellipse D22 = new Ellipse(255,168,5,5);
		Ellipse D23 = new Ellipse(75,168,5,5);
		Ellipse D24 = new Ellipse(105,168,5,5);
		Ellipse D25 = new Ellipse(135,168,5,5);
		Ellipse D26 = new Ellipse(165,168,5,5);
		Ellipse D27 = new Ellipse(195,168,5,5);
		Ellipse D28 = new Ellipse(225,168,5,5);

		//Add all things in pane
		pane.getChildren().addAll(L1,L2,L3,L4,L5,L6,L7,L8,L9,L10,L11,L12,L13,L14,D1,D2,D3,D4,D5,D6,D7,D8,D9,D10,D11,D12,D13,D14,D15,D16,D17,D18,D19,D20,D21,D22,D23,D24,D25,D26,D27,D28);
		//Add the pane in the scene
		Scene scene = new Scene(pane, 480, 240);
		//Add scene in the stage
		primaryStage.setScene(scene);
		//Show the stage
		primaryStage.show();
	}
}

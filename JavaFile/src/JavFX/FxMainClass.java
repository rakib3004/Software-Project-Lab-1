package JavFX;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.chart.*;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FxMainClass extends Application {



    public static void main(String[] args)
    {
        Application.launch(args);
    }
    @Override
    public void start(Stage stage) {

        Label label = new Label("\"Recommendation Tool for Library Management\"");

        Label label2 = new Label("\"All Statistical Analysis For Library Books\"");

        VBox vBox = new VBox();
        vBox.getChildren().addAll(label,label2);



     //   vBox.setMinSize(550, 650);
           vBox.setSpacing(5);

        vBox.setStyle("-fx-padding: 5;" +
                "-fx-border-style: solid inside;" +
                "-fx-border-width: 2;" +
                "-fx-border-insets: 5;" +
                "-fx-border-radius: 0;" +
                "-fx-border-color: white;" +
                "-fx-background-color: lime;");

        // Create the Scene

        // Create the Scene

        CategoryAxis categoryAxis = new CategoryAxis();
        categoryAxis.setLabel("Destination");

        NumberAxis numberAxis = new NumberAxis();
        numberAxis.setLabel("No. of Train");

        BarChart barChart = new BarChart(categoryAxis,numberAxis);

        XYChart.Series series1 = new XYChart.Series();
        series1.setName("Train");

        series1.getData().add(new XYChart.Data("Mohanganj",3));
        series1.getData().add(new XYChart.Data("Deyanganj",5));
        series1.getData().add(new XYChart.Data("Chattragam",7));

        barChart.getData().add(series1);

        XYChart.Series series2 = new XYChart.Series();
        series2.setName("Station");

        series2.getData().add(new XYChart.Data("Mohanganj",17));
        series2.getData().add(new XYChart.Data("Deyanganj",23));
        series2.getData().add(new XYChart.Data("Chattragam",38));

        barChart.getData().add(series2);

        XYChart.Series series3 = new XYChart.Series();
        series3.setName("Passengers");

        series3.getData().add(new XYChart.Data("Mohanganj",27));
        series3.getData().add(new XYChart.Data("Deyanganj",30));
        series3.getData().add(new XYChart.Data("Chattragam",18));

        barChart.getData().add(series3);


        XYChart.Series series4 = new XYChart.Series();
        series4.setName("Distance");

        series4.getData().add(new XYChart.Data("Mohanganj",37));
        series4.getData().add(new XYChart.Data("Deyanganj",25));
        series4.getData().add(new XYChart.Data("Chattragam",12));

        barChart.getData().add(series4);

 XYChart.Series series5 = new XYChart.Series();
        series5.setName("Distance");

        series5.getData().add(new XYChart.Data("Mohanganj",37));
        series5.getData().add(new XYChart.Data("Deyanganj",25));
        series5.getData().add(new XYChart.Data("Chattragam",12));

        barChart.getData().add(series5);






        PieChart pieChart = new PieChart();

        PieChart.Data slice1 = new PieChart.Data("Golpo", 23);
        PieChart.Data slice2 = new PieChart.Data("Kobita"  , 17);
        PieChart.Data slice3 = new PieChart.Data("Kisore Uponnash" , 36);
        PieChart.Data slice4 = new PieChart.Data("Romantic Uponnash" , 26);
        PieChart.Data slice5 = new PieChart.Data("History" , 14);
        PieChart.Data slice6 = new PieChart.Data("General Knowledge" , 17);
        PieChart.Data slice7 = new PieChart.Data("Science Fiction" , 9);
        PieChart.Data slice8 = new PieChart.Data("Probondho" , 33);
        PieChart.Data slice9 = new PieChart.Data("Rocona Somogro" , 26);

        pieChart.getData().add(slice1);
        pieChart.getData().add(slice2);
        pieChart.getData().add(slice3);
        pieChart.getData().add(slice4);
        pieChart.getData().add(slice5);
        pieChart.getData().add(slice6);
        pieChart.getData().add(slice7);
        pieChart.getData().add(slice8);
        pieChart.getData().add(slice9);

        HBox hBox1 = new HBox(barChart,pieChart);
;



        VBox vBox1 = new VBox();
       vBox1.getChildren().addAll(vBox,hBox1);

        vBox1.setMaxSize(850, 650);
        vBox1.setSpacing(5);

//scrollPane.pannableProperty().set(true);
//scrollPane.fitToHeightProperty().set(true);
//scrollPane.fitToWidthProperty().set(true);
//scrollPane.vbarPolicyProperty().setValue(ScrollPane.ScrollBarPolicy.NEVER);
        Scene scene1 = new Scene(vBox1,900,700);

        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setContent(vBox1);
// Add the scene to the Stage
        stage.setScene(scene1);
// Set the title of the Stage
        stage.setTitle("Books Statistics");
// Display the Stage
        stage.show();


    }


}
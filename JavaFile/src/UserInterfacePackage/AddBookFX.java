package UserInterfacePackage;

import AHPalgorithm.AHPcalculation;
import AHPalgorithm.AHPprocessImplementation;
import MainPackage.BookNumber;
import MainPackage.Processing;
import ObjectOriented.AHPcriteriaWeight;
import ObjectOriented.PriorityData;
import TableViewPackage.Book;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AddBookFX extends Application {
    PriorityData[] priorityData;
    AHPcriteriaWeight ahPcriteriaWeight;
int positionLocator=85;
    int numberOfBooks;
    Processing processing = new Processing();
    BookNumber bookNumber = new BookNumber();

    AHPcalculation ahPcalculation = new AHPcalculation();
    AHPprocessImplementation ahPprocessImplementation = new AHPprocessImplementation();
    @Override
    public void start(Stage primaryStage){
        Button back = new Button("Back");
        Button exit = new Button("Exit");


        back.setTranslateX(0);
        back.setTranslateY(650);
        exit.setTranslateX(1100);
        exit.setTranslateY(650);



        back.setOnAction(actionEvent -> {
            ChooseType chooseType = new ChooseType();

            try {
                chooseType.start(primaryStage);
            } catch (Exception exception) {
                exception.printStackTrace();
            }

        });

        exit.setOnAction(actionEvent -> {
            System.exit(0);

        });
        


        setStyle(exit);
        setStyle(back);


        back.setPrefSize(200, 80);
        exit.setPrefSize(200, 80);





        Text bookNameText = new Text();
        Text writerNameText = new Text();
        Text typeNameText = new Text();
        Text bookPriceText = new Text();
        Text bookInformationText = new Text();

        bookNameText.setText("Book Name : ");
        writerNameText.setText("Writer Name : ");
        typeNameText.setText("Type Name : ");
        bookPriceText.setText("Book price : ");
        bookInformationText.setText("Book Info : ");


        setStyle(bookNameText);
        setStyle(writerNameText);
        setStyle(typeNameText);
        setStyle(bookPriceText);
        setStyle(bookInformationText);

        bookNameText.setFill(Color.GREENYELLOW);
        writerNameText.setFill(Color.GREENYELLOW);
        typeNameText.setFill(Color.GREENYELLOW);
        bookPriceText.setFill(Color.GREENYELLOW);
        bookInformationText.setFill(Color.GREENYELLOW);

        bookNameText.setTranslateX(200);
        writerNameText.setTranslateX(200);
        typeNameText.setTranslateX(200);
        bookPriceText.setTranslateX(200);
        bookInformationText.setTranslateX(200);

        bookNameText.setTranslateY(200-positionLocator);
        writerNameText.setTranslateY(300-positionLocator);
        typeNameText.setTranslateY(400-positionLocator);
        bookPriceText.setTranslateY(500-positionLocator);
        bookInformationText.setTranslateY(700-positionLocator);


        TextField bookNameTextField = new TextField();
        TextField writerNameTextField = new TextField();
        TextField typeNameTextField = new TextField();
        TextField bookPriceTextField = new TextField();
        TextField bookInformationTextField = new TextField();

        setStyle(bookNameTextField);
        setStyle(writerNameTextField);
        setStyle(typeNameTextField);
        setStyle(bookPriceTextField);
        setStyle(bookInformationTextField);

        bookNameTextField.setTranslateX(450);
        writerNameTextField.setTranslateX(450);
        typeNameTextField.setTranslateX(450);
        bookPriceTextField.setTranslateX(450);
        bookInformationTextField.setTranslateX(450);

        bookNameTextField.setTranslateY(155-positionLocator);
        writerNameTextField.setTranslateY(255-positionLocator);
        typeNameTextField.setTranslateY(355-positionLocator);
        bookPriceTextField.setTranslateY(455-positionLocator);
        bookInformationTextField.setTranslateY(655-positionLocator);



        bookNameTextField.setPrefSize(400,60);
        writerNameTextField.setPrefSize(400,60);
        typeNameTextField.setPrefSize(400,60);
        bookPriceTextField.setPrefSize(400,60);
        bookInformationTextField.setPrefSize(850,60);


        Button addItem = new Button("Add Item");


        addItem.setTranslateX(480);
        addItem.setTranslateY(450);




        addItem.setOnAction(actionEvent -> {
try{
    bookInformationTextField.setText(bookNameTextField.getText()+"-"+
            writerNameTextField.getText()+"-"+typeNameTextField.getText()+
            "-"+bookPriceTextField.getText());
    Stage infoStage = new Stage();
    GridPane gridPane = new GridPane();
    gridPane.setAlignment(Pos.CENTER);
    Label label3 = new Label("Your Book is Added:");
    setStyle(label3);
   // TextField Ve = new TextField();
    gridPane.add(label3,1,3,2,1);
   // VELO.add(Ve,3,10,1,1);
    Scene S = new Scene(gridPane, 450, 350);
    infoStage.setTitle("Velocity");
    infoStage.setScene(S);
    infoStage.show();

}
catch (Exception exception){
    System.out.println("Blank Text");
}
        });

        setStyle(addItem);
        addItem.setPrefSize(220, 65);



        MenuItem uponnash = new MenuItem("Uponnash");
        uponnash.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {

         typeNameTextField.setText(uponnash.getText());

            } });


        MenuItem kobita = new MenuItem("Kobita");

        kobita.setOnAction(new EventHandler<ActionEvent>() {
            @Override  public void handle(ActionEvent e) {

                typeNameTextField.setText(kobita.getText());

            }
        });

        MenuItem rochonaboli = new MenuItem("Rochonaboli");
        rochonaboli.setOnAction(new EventHandler<ActionEvent>() {
            @Override  public void handle(ActionEvent e) {

                typeNameTextField.setText(rochonaboli.getText());
            }
        });
        MenuItem religion = new MenuItem("Religion");
        religion.setOnAction(new EventHandler<ActionEvent>() {
            @Override  public void handle(ActionEvent e) {

                typeNameTextField.setText(religion.getText());
            }
        });


        MenuItem biggan = new MenuItem("Biggan");
        biggan.setOnAction(new EventHandler<ActionEvent>() {
            @Override  public void handle(ActionEvent e) {

                typeNameTextField.setText(biggan.getText());
            } });

        MenuItem sciFi = new MenuItem("Sci Fi");
        sciFi.setOnAction(new EventHandler<ActionEvent>() {
            @Override  public void handle(ActionEvent e) {

                typeNameTextField.setText(sciFi.getText());
            }
        });

        MenuItem shishuShahitto = new MenuItem("Shishu Shahitto");
        shishuShahitto.setOnAction(new EventHandler<ActionEvent>() {
            @Override  public void handle(ActionEvent e)
            {
                typeNameTextField.setText(shishuShahitto.getText());
            }
        });



        MenuItem kisoreUponnash = new MenuItem("Kisore Uponnash");
        kisoreUponnash.setOnAction(new EventHandler<ActionEvent>() {
            @Override  public void handle(ActionEvent e) {

                typeNameTextField.setText(kisoreUponnash.getText());
            } });
        MenuItem biography = new MenuItem("Biography");
        biography.setOnAction(new EventHandler<ActionEvent>() {
            @Override  public void handle(ActionEvent e) {

                typeNameTextField.setText(biography.getText());
            }
        });

        MenuItem gobesona = new MenuItem("Gobesona");
        gobesona.setOnAction(new EventHandler<ActionEvent>() {
            @Override  public void handle(ActionEvent e) {

                typeNameTextField.setText(gobesona.getText());
            }
        });
        MenuItem onubad = new MenuItem("Onubad");

        onubad.setOnAction(new EventHandler<ActionEvent>() {
            @Override  public void handle(ActionEvent e) {
                typeNameTextField.setText(onubad.getText());

            }
        });
        MenuItem others = new MenuItem("Others");
        others.setOnAction(new EventHandler<ActionEvent>() {
            @Override  public void handle(ActionEvent e) {

                typeNameTextField.setText(others.getText());
            }
        });

        MenuButton bookType = new MenuButton("Choose Your Type");
        bookType.getItems().addAll( uponnash, kobita, rochonaboli, religion,
                biggan, sciFi, shishuShahitto, kisoreUponnash,biography,
                gobesona, onubad,others);

        bookType.setTranslateX(880);
        bookType.setTranslateY(355-positionLocator);
        bookType.setPrefSize(200,55);






        MenuItem humayonAhmed = new MenuItem("Humayon Ahmed");
        humayonAhmed.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {

writerNameTextField.setText(humayonAhmed.getText());

            } });



        MenuItem muhammadJafarIqbal = new MenuItem("Muhammad Jafar Iqbal");

        muhammadJafarIqbal.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {

                writerNameTextField.setText(muhammadJafarIqbal.getText());

            }
        });

        MenuItem rokibHasan = new MenuItem("Rokib Hasan");
        rokibHasan.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {

                writerNameTextField.setText(rokibHasan.getText());

            }
        });
        MenuItem emdadulHaqueMilon = new MenuItem("Emdadul Haque Milon");
        emdadulHaqueMilon.setOnAction(new EventHandler<ActionEvent>() {

            @Override public void handle(ActionEvent e) {

                writerNameTextField.setText(emdadulHaqueMilon.getText());

            }
        });


        MenuItem kaziNazrulIslam = new MenuItem("Kazi Nazrul Islam");
        kaziNazrulIslam.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                writerNameTextField.setText(kaziNazrulIslam.getText());

            } });

        MenuItem kaziAnwarHossain = new MenuItem("Kazi Anwar Hossain");
        kaziAnwarHossain.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                writerNameTextField.setText(kaziAnwarHossain.getText());

            }
        });

        MenuItem sharatChandraChattropadhay = new MenuItem("Sharat Chandra Chattropadhay");
        sharatChandraChattropadhay.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                writerNameTextField.setText(sharatChandraChattropadhay.getText());

            }
        });



        MenuItem rabindranathTagore = new MenuItem("Rabindranath Tagore");
        rabindranathTagore.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {

                writerNameTextField.setText(rabindranathTagore.getText());

            } });


        MenuItem sunilGangoPaddahay = new MenuItem("Sunil Gango Paddahay");
        sunilGangoPaddahay.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                writerNameTextField.setText(sunilGangoPaddahay.getText());

            }
        });


        MenuItem samareshMajumdar = new MenuItem("Samaresh majumdar");
        samareshMajumdar.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                writerNameTextField.setText(samareshMajumdar.getText());

            }
        });


        MenuItem emdadiyaPustokaloy = new MenuItem("Emdadiya Pustokaloy");

        emdadiyaPustokaloy.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                writerNameTextField.setText(emdadiyaPustokaloy.getText());


            }
        });




        MenuButton writerMenu = new MenuButton("Choose The Writer");
        writerMenu.getItems().addAll( humayonAhmed, muhammadJafarIqbal, rokibHasan, emdadulHaqueMilon,
                kaziNazrulIslam, kaziAnwarHossain, sharatChandraChattropadhay, rabindranathTagore, sunilGangoPaddahay,
                samareshMajumdar, emdadiyaPustokaloy);


        writerMenu.setTranslateX(880);
        writerMenu.setTranslateY(255-positionLocator);
        writerMenu.setPrefSize(200, 55);


        Image image = new Image("libraryBackground6.jpg");
        Canvas canvas = new Canvas(1500,950);
        Group group = new Group();
        group.getChildren().addAll(canvas,exit,back,bookNameText,writerNameText,
                typeNameText,bookPriceText,bookInformationText,bookNameTextField,
                writerNameTextField,typeNameTextField,
                bookPriceTextField,bookInformationTextField,
                addItem,bookType,writerMenu);


        GraphicsContext graphicsContext = canvas.getGraphicsContext2D();
        graphicsContext.drawImage(image,0,0);


        Scene scene1 = new Scene(group,1500,950);


        primaryStage.setScene(scene1);
        primaryStage.setTitle("Books Statistics");
        primaryStage.setFullScreen(true);
        primaryStage.show();

    }



    public Button setStyle( Button button)
    {
        button.setStyle("-fx-padding: 8 15 15 15;\n" +
                "    -fx-background-insets: 0,0 0 5 0, 0 0 6 0, 0 0 7 0;\n" +
                "    -fx-background-radius: 8;\n" +
                "    -fx-background-color: \n" +
                "        linear-gradient(from 0% 93% to 0% 100%, #8d9092 0%, #717375 100%),\n" +
                "        #8d9092,\n" +
                "        #717375,\n" +
                "        radial-gradient(center 50% 50%, radius 100%, #ffffff, #a1a3a6);\n" +
                "    -fx-effect: dropshadow( gaussian , rgba(0,0,0,0.75) , 4,0,0,1 );\n" +
                "    -fx-font-weight: bold;\n" +
                "    -fx-font-size: 2.1em;");
        return  button;
    }
    public Text setStyle(Text text)
    {
        text.setStyle("-fx-padding: 8 15 15 15;\n" +
                "    -fx-background-insets: 0,0 0 5 0, 0 0 6 0, 0 0 7 0;\n" +
                "    -fx-background-radius: 8;\n" +
                "    -fx-background-color:\n" +
                "        linear-gradient(from 0% 93% to 0% 100%, #8d9092 0%, #717375 100%),\n" +
                "        #8d9092,\n" +
                "        #717375,\n" +
                "        radial-gradient(center 50% 50%, radius 100%, #ffffff, #a1a3a6);\n" +
                "    -fx-effect: dropshadow( gaussian , rgba(0,0,0,0.75) , 4,0,0,1 );\n" +
                "    -fx-font-weight: bold;\n" +
                "    -fx-font-size: 2.1em;");
        return  text;
    }

 public Label setStyle(Label label)
    {
        label.setStyle("-fx-padding: 8 15 15 15;\n" +
                "    -fx-background-insets: 0,0 0 5 0, 0 0 6 0, 0 0 7 0;\n" +
                "    -fx-background-radius: 8;\n" +
                "    -fx-background-color:\n" +
                "        linear-gradient(from 0% 93% to 0% 100%, #8d9092 0%, #717375 100%),\n" +
                "        #8d9092,\n" +
                "        #717375,\n" +
                "        radial-gradient(center 50% 50%, radius 100%, #ffffff, #a1a3a6);\n" +
                "    -fx-effect: dropshadow( gaussian , rgba(0,0,0,0.75) , 4,0,0,1 );\n" +
                "    -fx-font-weight: bold;\n" +
                "    -fx-font-size: 2.1em;");
        return  label;
    }

    public TextField setStyle(TextField textField)
    {
        textField.setStyle("-fx-padding: 8 15 15 15;\n" +
                "    -fx-background-insets: 0,0 0 5 0, 0 0 6 0, 0 0 7 0;\n" +
                "    -fx-background-radius: 8;\n" +
                "    -fx-background-color:\n" +
                "        linear-gradient(from 0% 93% to 0% 100%, #8d9092 0%, #717375 100%),\n" +
                "        #8d9092,\n" +
                "        #717375,\n" +
                "        radial-gradient(center 50% 50%, radius 100%, #ffffff, #a1a3a6);\n" +
                "    -fx-effect: dropshadow( gaussian , rgba(0,0,0,0.75) , 4,0,0,1 );\n" +
                "    -fx-font-weight: bold;\n" +
                "    -fx-font-size: 2.1em;");
        return  textField;
    }
}
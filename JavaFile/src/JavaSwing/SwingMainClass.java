package JavaSwing;

import AHPalgorithm.AHPcalculation;
import AHPalgorithm.AHPprocessImplementation;
import Calculation.MultipleLinearRegression;
import MainPackage.BookNumber;
import MainPackage.Processing;
import ObjectOriented.AHPcriteriaWeight;
import ObjectOriented.PriorityData;
import PageRankAlgorithm.PageRankCalculation;

import javax.swing.*;
import java.io.IOException;

public class SwingMainClass {

    public static void main(String[] args) {
        PriorityData[] priorityData;
        AHPcriteriaWeight ahPcriteriaWeight;

        int numberOfBooks;
        Processing processing = new Processing();
        BookNumber bookNumber = new BookNumber();

        AHPcalculation ahPcalculation = new AHPcalculation();
        AHPprocessImplementation ahPprocessImplementation = new AHPprocessImplementation();
        MultipleLinearRegression multipleLinearRegression = new MultipleLinearRegression();

        int input;
        String stringInput;
      stringInput =  JOptionPane.showInputDialog("What do you want???\n1.Multivariable Linear Regression \n" +
                "2.Analytic Heirarcy Process\n3.Page Rank Algorithm");

      input = Integer.parseInt(stringInput);

      if(input==1){
          try {
          priorityData = processing.fileReaderMethods();
          numberOfBooks = bookNumber.bookNumberFindingMethods();
          multipleLinearRegression.multipleLinearRegressionMethods(priorityData, numberOfBooks);

          } catch (IOException e) {
              e.printStackTrace();
          }


      }
      else if(input==2){
          try {
              priorityData = processing.fileReaderMethods();
              numberOfBooks = bookNumber.bookNumberFindingMethods();
              ahPcriteriaWeight =  ahPcalculation.AHPcalculationMethods(priorityData,numberOfBooks);

              ahPprocessImplementation.ahpProcessImplementationMethods(ahPcriteriaWeight,priorityData,numberOfBooks);

          } catch (IOException e) {
              e.printStackTrace();
          }

      }
      else{
          PageRankCalculation pageRankCalculation = new PageRankCalculation();

          try {

              priorityData = processing.fileReaderMethods();
              numberOfBooks = bookNumber.bookNumberFindingMethods();
              pageRankCalculation.pageRankCalculationMethods(priorityData,numberOfBooks);
              System.exit(0);


          }

          catch (Exception exception) {
              exception.printStackTrace();
          }
      }

    }
}

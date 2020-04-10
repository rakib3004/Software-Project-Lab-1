package MainPackage;

import Collection.BorrowCollection;
import Collection.TimeCollection;
import Collection.TypeCollection;
import JavFX.FxDatabase;
import JavFX.FxMainClass;
import Methods.Searching;
import ObjectOriented.PriorityData;
import Collection.WriterCollection;

import javax.swing.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ResultClass {
Searching searching = new Searching();
WriterCollection writerCollection = new WriterCollection();
TypeCollection typeCollection = new TypeCollection();
TimeCollection timeCollection  = new TimeCollection();
BorrowCollection borrowCollection = new BorrowCollection();
    int iterator;

    public void sortingProcess(PriorityData[] priorityData, int numberOfBooks){

      /*  for (iterator = 0; iterator < numberOfBooks; iterator++) {
            System.out.println(iterator+"->->->->->"+priorityData[iterator].getBookPriority()+">>>>>>"+priorityData[iterator].bookData.bookName);
            System.out.println();
        }*/
        double temporary;
        int temp;
        PriorityData tempData ;
        for(iterator=0;iterator<numberOfBooks;iterator++){
            for(int j=0;j<numberOfBooks;j++){
                if(priorityData[iterator].getWeight()>priorityData[j].getWeight()){

                tempData =priorityData[iterator];
                priorityData[iterator] = priorityData[j];
                priorityData[j] = tempData;
                }
            }
        }

try {


    String aString = JOptionPane.showInputDialog("Chose OPtion :\n1.Type Base Statitics " +
            "\n2.Writer Based Statistics \n3.Issue Date Base Statitics " +
            "\n4.Borrow Based Statistics" + "\n5.Searching by Alphabets");
    //     optimizedResult(priorityData,numberOfBooks);

    int anInt = Integer.parseInt(aString);
    JOptionPane.showMessageDialog(null, "You Pressed "+anInt);

    if (anInt == 1) {

        typeCollection.typeCollectionMethods(priorityData, numberOfBooks);

    } else if (anInt == 2) {

        writerCollection.writerCollectionMethods(priorityData, numberOfBooks);

    } else if (anInt == 3) {

        timeCollection.timeCollectionMethods(priorityData, numberOfBooks);

    } else if (anInt == 4) {

        borrowCollection.borrowCollectionMethods(priorityData, numberOfBooks);

    } else if (anInt == 5) {

        searching.search(priorityData, numberOfBooks);

    } else {
        JOptionPane.showMessageDialog(null, "Empty Command");
    }

}
catch (NullPointerException nullPointerException){
    System.out.println("");

}

     //   FxMainClass fxMainClass = new FxMainClass(priorityData,numberOfBooks);
    }

    public void optimizedResult(PriorityData[] priorityData,int numberOfBooks){
        String string="";

       try {
            for (iterator = 0; iterator < numberOfBooks; iterator++) {
                System.out.println(iterator+"_____M R :"+priorityData[iterator].getWeight()+">>>>>>"+priorityData[iterator].bookData.bookName);
                string = string + (iterator + "_____M R :" + priorityData[iterator].getWeight() + ">>>>>>" + priorityData[iterator].bookData.bookName+"\n");
            }

        }
        catch (NullPointerException nullPointerException){
            System.out.println("Null Pointer Exception");
        }


String FILENAME = "New Output5.txt";

            try {

                // Open given file in append mode.
                BufferedWriter out = new BufferedWriter(
                        new FileWriter(FILENAME, true));
                out.write(string);
                out.write(" --------------------------------------------------" +
                        "---------------------------------------------------------------" +
                        "------------------------------------------------");
                out.write(" ---------------------------------------------------" +
                        "-------------------------------------------------------------" +
                        "-------------------------------------------------");
                out.write(" ----------------------------------------------------" +
                        "------------------------------------------------------------------" +
                        "-------------------------------------------");

                                        out.close();
                                        JOptionPane.showMessageDialog(null,"Successful Programme Activation");
            }
            catch (IOException e) {
                System.out.println("exception occoured" + e);
            }


    }

    }


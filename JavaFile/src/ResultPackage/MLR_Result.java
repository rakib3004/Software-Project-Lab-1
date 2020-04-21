package ResultPackage;

import Collection.BorrowCollection;
import Collection.TimeCollection;
import Collection.TypeCollection;
import Methods.Searching;
import ObjectOriented.PriorityData;
import Collection.WriterCollection;

import javax.swing.*;

public class MLR_Result {
    Searching searching = new Searching();
    WriterCollection writerCollection = new WriterCollection();
    TypeCollection typeCollection = new TypeCollection();
    TimeCollection timeCollection = new TimeCollection();
    BorrowCollection borrowCollection = new BorrowCollection();
    int iterator;

    public void MLR_ResultMethods(PriorityData[] priorityData, int numberOfBooks) {




    }
    
    public void printOptionMethods(PriorityData[] priorityData, int numberOfBooks){



        double temporary;
        int temp;
        PriorityData tempData;
      /*  for (iterator = 0; iterator < numberOfBooks; iterator++) {
            for (int j = 0; j < numberOfBooks; j++) {
                if (priorityData[iterator].getMLRweight() > priorityData[j].getMLRweight()) {

                    tempData = priorityData[iterator];
                    priorityData[iterator] = priorityData[j];
                    priorityData[j] = tempData;
                }
            }
        }*/

        try {


            String aString = JOptionPane.showInputDialog("Chose OPtion :\n1.Type Base Statitics " +
                    "\n2.Writer Based Statistics \n3.Issue Date Base Statitics " +
                    "\n4.Borrow Based Statistics" + "\n5.Searching by Alphabets");
            //     optimizedResult(priorityData,numberOfBooks);

            int anInt = Integer.parseInt(aString);
            JOptionPane.showMessageDialog(null, "You Pressed " + anInt);

            if (anInt == 1) {

                typeCollection.typeCollectionMLRMethods(priorityData, numberOfBooks);

            } else if (anInt == 2) {

                writerCollection.writerCollectionMLRMethods(priorityData, numberOfBooks);

            } else if (anInt == 3) {

                timeCollection.timeCollectionMLRMethods(priorityData, numberOfBooks);

            } else if (anInt == 4) {

                borrowCollection.borrowCollectionMLRMethods(priorityData, numberOfBooks);

            } else if (anInt == 5) {

                searching.search(priorityData, numberOfBooks);

            } else {
                JOptionPane.showMessageDialog(null, "Empty Command");
            }

        } catch (NullPointerException nullPointerException) {
            System.out.println();

        }



    }

}
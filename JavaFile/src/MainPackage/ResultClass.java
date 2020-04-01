package MainPackage;

import Collection.TypeCollection;
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
    public void sortingProcess(PriorityData[] priorityData, int numberOfBooks){


      /*  for (int i = 0; i < numberOfBooks; i++) {
            System.out.println(i+"->->->->->"+priorityData[i].getBookPriority()+">>>>>>"+priorityData[i].bookData.bookName);
            System.out.println();
        }*/
        double temporary;
        int temp;
        PriorityData tempData ;
        for(int i=0;i<numberOfBooks;i++){
            for(int j=0;j<numberOfBooks;j++){
                if(priorityData[i].getWeight()>priorityData[j].getWeight()){

                tempData =priorityData[i];
                priorityData[i] = priorityData[j];
                priorityData[j] = tempData;
                }
            }
        }

      String  aString=  JOptionPane.showInputDialog("Chose OPtion :\n1.Type Base Statitics \n2.Writer Based Statistics \n3.Searching by Alphabets");
        optimizedResult(priorityData,numberOfBooks);

      int a = Integer.parseInt(aString);
      if(a==1){
          typeCollection.typeCollectionMethods(priorityData,numberOfBooks);

      }
      else if(a==2){
          writerCollection.writerCollectionMethods(priorityData,numberOfBooks);

      }
      else if(a==3){
          searching.search(priorityData,numberOfBooks);

      }


    }

    public void optimizedResult(PriorityData[] priorityData,int numberOfBooks){
        int start= 20;
        String string="";

       try {
            for (int i = 0; i < numberOfBooks; i++) {
                System.out.println(i+"_____M R :"+priorityData[i].getWeight()+">>>>>>"+priorityData[i].bookData.bookName);
                string = string + (i + "_____M R :" + priorityData[i].getWeight() + ">>>>>>" + priorityData[i].bookData.bookName+"\n");
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


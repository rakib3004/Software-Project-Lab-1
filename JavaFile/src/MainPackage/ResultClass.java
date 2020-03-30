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
                if(priorityData[i].getBookPriority()>priorityData[j].getBookPriority()){

                tempData =priorityData[i];
                priorityData[i] = priorityData[j];
                priorityData[j] = tempData;
                }
            }
        }

optimizedResult(priorityData,numberOfBooks);

       // searching.search(priorityData,numberOfBooks);
       //writerCollection.writerCollectionMethods(priorityData,numberOfBooks);
        //typeCollection.typeCollectionMethods(priorityData,numberOfBooks);
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


String FILENAME = "New Output3.txt";

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


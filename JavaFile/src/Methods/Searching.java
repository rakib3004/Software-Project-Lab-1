package Methods;

import ObjectOriented.BookData;
import ObjectOriented.PriorityData;

public class Searching {


    public void search(PriorityData[] priorityData, int numberOfBooks) {
        char ch;
        String string = " ";
        int iterator, jterator;
        System.out.println("##########Sorting by Book Name############" );
        System.out.println();
        for (iterator = 65; iterator <=90; iterator++) {
            ch = (char) iterator;
            string = Character.toString(ch);
            System.out.println("____________________________" );
            System.out.println("_____________"+ch+"_____________" );
            System.out.println("____________________________" );


            for (jterator = 0; jterator < numberOfBooks; jterator++) {
                if (priorityData[jterator].bookData.bookName.charAt(0) == ch) {
                    System.out.println("Book Name : " + priorityData[jterator].bookData.bookName + "\t Book price : " + priorityData[jterator].bookData.bookPrice);
                    //  }


                }

            }
        }
        System.out.println();
        System.out.println();
        System.out.println("########################################Sorting by Writer Name#########################" );


        for (iterator = 65; iterator <=90; iterator++) {
            ch = (char) iterator;
            string = Character.toString(ch);
            System.out.println("____________________________" );
            System.out.println("_____________"+ch+"_____________" );
            System.out.println("____________________________" );
            for (jterator = 0; jterator < numberOfBooks; jterator++) {
                if (priorityData[jterator].bookData.writerName.charAt(0) == ch) {
                    System.out.println("Writer Name : " + priorityData[jterator].bookData.writerName + "\t Book weight : " + priorityData[jterator].weight);

                }

            }
        }







    }
}

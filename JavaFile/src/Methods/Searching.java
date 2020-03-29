package Methods;

import ObjectOriented.BookData;
import ObjectOriented.PriorityData;

public class Searching {


    public void search(PriorityData[] priorityData, int numberOfBooks) {
        char ch;
        String string = " ";
        int i, j;
        System.out.println("##########Sorting by Book Name############" );
        System.out.println();
        for (i = 65; i <=90; i++) {
            ch = (char) i;
            string = Character.toString(ch);
            System.out.println("____________________________" );
            System.out.println("_____________"+ch+"_____________" );
            System.out.println("____________________________" );


            for (j = 0; j < numberOfBooks; j++) {
                if (priorityData[j].bookData.bookName.charAt(0) == ch) {
                    System.out.println("Book Name : " + priorityData[j].bookData.bookName + "\t Book weight : " + priorityData[j].weight);
                    //  }


                }

            }
        }
        System.out.println();
        System.out.println();
        System.out.println("########################################Sorting by Writer Name#########################" );


        for (i = 65; i <=90; i++) {
            ch = (char) i;
            string = Character.toString(ch);
            System.out.println("____________________________" );
            System.out.println("_____________"+ch+"_____________" );
            System.out.println("____________________________" );
            for (j = 0; j < numberOfBooks; j++) {
                if (priorityData[j].bookData.writerName.charAt(0) == ch) {
                    System.out.println("Writer Name : " + priorityData[j].bookData.writerName + "\t Book weight : " + priorityData[j].weight);

                }

            }
        }




    }
}

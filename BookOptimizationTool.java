package BasicJava;
import java.io.*;

import java.io.IOException;

public class OutStream {

    public static void main(String [] args) throws IOException{

        File file = new File("C:\\Users\\Rakib\\Desktop\\IIT_SPL.txt");
        FileReader fr = new FileReader(file);
        char [] a = new char[12050];
        fr.read(a);   // reads the content to the array

        String bookName [] = new String[1050];
        String writerName [] = new String[1050];
        String bookId [] = new String[1050];

        String bookType [] = new String[1050];

        String priority [] = new  String[1050];
        int priority2 [] = new int[1050];

        String borrowCount [] = new String[1050];
        int borrowCount2 [] = new int[1050];

        String monthCount [] = new String[1050];
        int monthCount2 [] = new int[1050];
        int x=1;
        int t=0,t1=1;
      for(int i =0 ;a[i]!='\0';i++) {
          if(a[i]=='\t'){
              i++;
              t++;
              t=t%7;
          }
          if(a[i]=='\n'){
              i++;
              t++;
              if(t==7){
                  t1=1;
              }
              t=t%7;
            //  priority2[x] = Integer.parseInt(priority[x]);
            //  borrowCount2[x] = Integer.parseInt(borrowCount[x]);
              System.out.println(bookName[x]);
              System.out.println(writerName[x]);
              System.out.println(bookId[x]);
              System.out.println(bookType[x]);
              System.out.println(priority[x]);
              System.out.println(borrowCount[x]);
              System.out.println(monthCount[x]);
              System.out.println();
              System.out.println();
              x++;
              bookName [x] = "\0";
               writerName [x]  = "\0";
               bookId [x] = "\0";
               bookType [x] = "\0";
               priority [x] = "\0";
               borrowCount [x] ="\0";
               monthCount [x] = "\0";

          }
          if(t==0){

              bookName[x]  =bookName[x] + a[i];
          }
else if(t==1){
    writerName[x] = writerName[x]+a[i];

          }
else if(t==2){
    bookId[x] = bookId[x]+a[i];

          }
     else if(t==3){
    bookType[x] = bookType[x]+a[i];

          }
     else if(t==4){
    priority[x] = priority[x]+a[i];

          }
     else if(t==5){
    borrowCount[x] = borrowCount[x]+a[i];

          }
     else if(t==6){
         if(t1==1){
             t1++;
             continue;
         }
         else{
             monthCount[x] = monthCount[x]+a[i];


         }

          }


      }

      fr.close();


        System.out.println();

     //   for(int s : monthCount2)
     //   System.out.println(s);
        for (int j=0;j<50;j++){
            System.out.println(bookName[j]);

        } for (int j=0;j<50;j++){
            System.out.println(writerName[j]);

        } for (int j=0;j<50;j++){
            System.out.println(bookId[j]);

        } for (int j=0;j<50;j++){
            System.out.println(priority[j]);

        } for (int j=0;j<50;j++){
            System.out.println(bookType[j]);

        }
        for (int j=0;j<50;j++){
            System.out.println(monthCount[j]);
              monthCount2[x] = Integer.parseInt(monthCount[x]);


        }for (int j=0;j<50;j++){
            System.out.println(borrowCount[j]);

        }
      }
}

//java code five 

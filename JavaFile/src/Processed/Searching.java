package Processed;

import ObjectOriented.BookData;

public class Searching {


    public void search(BookData[] bookData, int numberOfBooks){
char ch;
String string;
int i,j;

for(i=65;i<91;i++){
    ch = (char) i;
    string =  ch+"";
    System.out.println("Books Rank , Start with : "+ch);
    for(j=0;j<numberOfBooks;j++){
        if(bookData[j].bookName.startsWith(string)==(true)){
            System.out.println("Book Name : "+bookData[j].bookName+"\t Book Rank : "+bookData[j].rank[0]);
        }


    }

}


    }
}

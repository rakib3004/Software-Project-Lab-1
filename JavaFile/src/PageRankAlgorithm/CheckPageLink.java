package PageRankAlgorithm;

public class CheckPageLink {
    public boolean checkPageLinkMethods(){
        boolean linkPageBool = true;

        boolean borrowLinkBool,typeLinkBool,writerLinkBool,alphabetLinkBool;
        borrowLinkBool = checkBorrowLinkBool();
        typeLinkBool = checkTypeLinkBool();
        writerLinkBool = checkWriterLinkBool();
        alphabetLinkBool = checkAlphabetLinkBool();

        linkPageBool = (borrowLinkBool&&typeLinkBool&&writerLinkBool&&alphabetLinkBool);
        return linkPageBool;

    }

    public boolean checkBorrowLinkBool(){
        return  true;

    }
     public boolean checkTypeLinkBool(){
         return  true;

     }
     public boolean checkWriterLinkBool(){
         return  true;

     }
     public boolean checkAlphabetLinkBool(){
         return  true;

     }

}

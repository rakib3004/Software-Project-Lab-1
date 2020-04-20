package AHPalgorithm;

import ObjectOriented.PriorityData;

public class AHPSubCriteriaProcess {

int iterator1;
    public int[] priceCriteriaCalculationMethods(PriorityData[] priorityData, int numberOfBooks){
        int [] priceCounter = new int[3];
priceCounter[0] =1;priceCounter[1] =1;priceCounter[2] =1;

        for (iterator1 = 0; iterator1 < numberOfBooks; iterator1++) {
            if (Integer.parseInt(priorityData[iterator1].bookData.bookPrice) <= 180) {
                priceCounter[0]++;
                //System.out.println(iterator1 + ":::: 180 er niche dam");
            }
            else if (Integer.parseInt(priorityData[iterator1].bookData.bookPrice) <= 250) {
                //System.out.println(iterator1 + ":::: 250 er niche dam");
                priceCounter[1]++;
            }

            else /*if (Integer.parseInt(priorityData[iterator1].bookData.bookPrice) <= 750) */{
                //System.out.println(iterator1 + ":::: 250 er niche dam");
                priceCounter[2]++;
            }

        }

        System.out.println("Price Count :  ");
        for(iterator1=0;iterator1<3;iterator1++){
            System.out.println(priceCounter[iterator1]);
        }
return  priceCounter;
    }


    public int[] countCriteriaCalculationMethods(PriorityData[] priorityData, int numberOfBooks){
        int [] countCounter = new int[4];
        for (iterator1 = 0; iterator1 < numberOfBooks; iterator1++) {
            if (priorityData[iterator1].borrowPriority <= 10) {
                //System.out.println(iterator1 + ":::: 10 er niche");
                countCounter[0]++;
            } else if (priorityData[iterator1].borrowPriority <= 20) {
                //System.out.println(iterator1 + ":::: 20 er niche");
                countCounter[1]++;

            } else if (priorityData[iterator1].borrowPriority <= 30) {
                //System.out.println(iterator1 + ":::: 30 er niche");
                countCounter[2]++;

            } else if (priorityData[iterator1].borrowPriority <= 40) {
                //System.out.println(iterator1 + ":::: 40 er niche");
                countCounter[3]++;

            }
        }


        return  countCounter;
    }

    public int[] monthCriteriaCalculationMethods(PriorityData[] priorityData, int numberOfBooks){
        int [] monthCounter = new int[5];


        for (iterator1 = 0; iterator1 < numberOfBooks; iterator1++) {
            if (priorityData[iterator1].timePriority <= 4.00) {
                monthCounter[0]++;

                //System.out.println(iterator1 + "::::latest book");
            } else if (priorityData[iterator1].timePriority <= 6.00) {
                monthCounter[1]++;

                //System.out.println(iterator1 + "::::newly book");
            }  else if (priorityData[iterator1].timePriority <= 8.00) {
                monthCounter[2]++;

                //System.out.println(iterator1 + "::::recently old book");
            }  else if (priorityData[iterator1].timePriority <= 10.00) {
                monthCounter[3]++;

                //System.out.println(iterator1 + "::::old book");
            }  else if (priorityData[iterator1].timePriority <= 12.00) {
                monthCounter[4]++;

                //System.out.println(iterator1 + "::::oldest book");
            }
        }



        return  monthCounter;
    }

    public int[] typeCriteriaCalculationMethods(PriorityData[] priorityData, int numberOfBooks){
        int [] typeCounter = new int[6];

        for (iterator1 = 0; iterator1 < numberOfBooks; iterator1++) {
            if (priorityData[iterator1].bookData.bookId.substring(0,2).equals("01")) {
                //System.out.println(iterator1 + ":::: Uponnash");
          typeCounter[0]++;
            } else if (priorityData[iterator1].bookData.bookId.substring(0,2).equals("05")) {
                //System.out.println(iterator1 + ":::: Rochonaboli");

                typeCounter[0]++;
            } else if (priorityData[iterator1].bookData.bookId.substring(0,2).equals("02")) {
                //System.out.println(iterator1 + ":::: Kobita");

                typeCounter[1]++;

            }else if (priorityData[iterator1].bookData.bookId.substring(0,2).equals("13")) {
                //System.out.println(iterator1 + ":::: Biggan");

                typeCounter[2]++;
            }else if (priorityData[iterator1].bookData.bookId.substring(0,2).equals("14")) {
                //System.out.println(iterator1 + ":::: Gobeshona");
                typeCounter[2]++;
            }else if (priorityData[iterator1].bookData.bookId.substring(0,2).equals("06")) {
                //System.out.println(iterator1 + ":::: Science Fiction");
                typeCounter[2]++;
            } else if (priorityData[iterator1].bookData.bookId.substring(0,2).equals("10")) {
                //System.out.println(iterator1 + ":::: Kisore Uponnash");
                typeCounter[3]++;

            }  else if (priorityData[iterator1].bookData.bookId.substring(0,2).equals("11")) {
                //System.out.println(iterator1 + ":::: Shishu Shahitto");
                typeCounter[3]++;

            }else if (priorityData[iterator1].bookData.bookId.substring(0,2).equals("04")) {
                //System.out.println(iterator1 + ":::: Religion");
                typeCounter[4]++;

            }  else {
                //System.out.println(iterator1 + ":::: Othres");
                typeCounter[5]++;

            }
        }


        return  typeCounter;
    }
}

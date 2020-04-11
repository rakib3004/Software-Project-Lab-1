package AHPalgorithm;

import ObjectOriented.AHPcriteriaWeight;
import ObjectOriented.PriorityData;

public class AHPprocessImplementation {
    AHPcriteriaWeight ahPcriteriaWeight;
    CountCriteriaAHP countCriteriaAHP;

    public void ahpProcessImplementationMethods(AHPcriteriaWeight ahPcriteriaWeight, PriorityData[] priorityData, int numberOfBooks) {


        int iterator1;

        for (iterator1 = 0; iterator1 < numberOfBooks; iterator1++) {
            if (priorityData[iterator1].borrowPriority <= 10) {
                System.out.println(iterator1 + ":::: 10 er niche");
                priorityData[iterator1].borrowPriority = ahPcriteriaWeight.lowlyDemand;
            } else if (priorityData[iterator1].borrowPriority <= 20) {
                System.out.println(iterator1 + ":::: 20 er niche");

                priorityData[iterator1].borrowPriority = ahPcriteriaWeight.lowMediumDemand;
            } else if (priorityData[iterator1].borrowPriority <= 30) {
                System.out.println(iterator1 + ":::: 30 er niche");

                priorityData[iterator1].borrowPriority = ahPcriteriaWeight.highMediumDemand;
            } else if (priorityData[iterator1].borrowPriority <= 40) {
                System.out.println(iterator1 + ":::: 40 er niche");

                priorityData[iterator1].borrowPriority = ahPcriteriaWeight.highlyDemand;
            }
        }




            for (iterator1 = 0; iterator1 < numberOfBooks; iterator1++) {
                if (priorityData[iterator1].bookData.bookId.substring(0,2).equals("01")) {
                    System.out.println(iterator1 + ":::: Uponnash");
                    priorityData[iterator1].bookPriority = ahPcriteriaWeight.uponnashType;
                } else if (priorityData[iterator1].bookData.bookId.substring(0,2).equals("05")) {
                    System.out.println(iterator1 + ":::: Rochonaboli");

                    priorityData[iterator1].bookPriority = ahPcriteriaWeight.uponnashType;
                } else if (priorityData[iterator1].bookData.bookId.substring(0,2).equals("02")) {
                    System.out.println(iterator1 + ":::: Kobita");

                    priorityData[iterator1].bookPriority = ahPcriteriaWeight.kobitaType;
                }else if (priorityData[iterator1].bookData.bookId.substring(0,2).equals("13")) {
                    System.out.println(iterator1 + ":::: Biggan");

                    priorityData[iterator1].bookPriority = ahPcriteriaWeight.scienceFictionType;
                }else if (priorityData[iterator1].bookData.bookId.substring(0,2).equals("14")) {
                    System.out.println(iterator1 + ":::: Gobeshona");

                    priorityData[iterator1].bookPriority = ahPcriteriaWeight.scienceFictionType;
                }else if (priorityData[iterator1].bookData.bookId.substring(0,2).equals("06")) {
                    System.out.println(iterator1 + ":::: Science Fiction");

                    priorityData[iterator1].bookPriority = ahPcriteriaWeight.scienceFictionType;
                } else if (priorityData[iterator1].bookData.bookId.substring(0,2).equals("10")) {
                    System.out.println(iterator1 + ":::: Kisore Uponnash");

                    priorityData[iterator1].bookPriority = ahPcriteriaWeight.kisorUponnashType;
                }  else if (priorityData[iterator1].bookData.bookId.substring(0,2).equals("11")) {
                    System.out.println(iterator1 + ":::: Shishu Shahitto");

                    priorityData[iterator1].bookPriority = ahPcriteriaWeight.kisorUponnashType;
                }else if (priorityData[iterator1].bookData.bookId.substring(0,2).equals("04")) {
                    System.out.println(iterator1 + ":::: Religion");

                    priorityData[iterator1].bookPriority = ahPcriteriaWeight.religionType;
                }  else {
                    System.out.println(iterator1 + ":::: Othres");

                    priorityData[iterator1].bookPriority = ahPcriteriaWeight.othersType;
                }
            }



                for (iterator1 = 0; iterator1 < numberOfBooks; iterator1++) {
                    if (Integer.parseInt(priorityData[iterator1].bookData.bookPrice) <= 180) {
                        System.out.println(iterator1 + ":::: 180 er niche dam");
                        priorityData[iterator1].pricePriority = ahPcriteriaWeight.lowPrice;
                    }
                    else  if (Integer.parseInt(priorityData[iterator1].bookData.bookPrice) <= 250) {
                        System.out.println(iterator1 + ":::: 250 er niche dam");
                        priorityData[iterator1].pricePriority = ahPcriteriaWeight.mediumPrice;
                    }

                    else   {
                        System.out.println(iterator1 + ":::: Besi dam");
                        priorityData[iterator1].pricePriority = ahPcriteriaWeight.highPrice;
                    }

                }



                    for (iterator1 = 0; iterator1 < numberOfBooks; iterator1++) {
                        if (priorityData[iterator1].borrowPriority <= 10) {
                            System.out.println(iterator1 + ":::: 10 er niche");
                            priorityData[iterator1].borrowPriority = ahPcriteriaWeight.lowlyDemand;
                        } else if (priorityData[iterator1].borrowPriority <= 20) {
                            System.out.println(iterator1 + ":::: 20 er niche");

                            priorityData[iterator1].borrowPriority = ahPcriteriaWeight.lowMediumDemand;
                        } else if (priorityData[iterator1].borrowPriority <= 30) {
                            System.out.println(iterator1 + ":::: 30 er niche");

                            priorityData[iterator1].borrowPriority = ahPcriteriaWeight.highMediumDemand;
                        } else if (priorityData[iterator1].borrowPriority <= 40) {
                            System.out.println(iterator1 + ":::: 40 er niche");

                            priorityData[iterator1].borrowPriority = ahPcriteriaWeight.highlyDemand;
                        }

                    }


                    }

                }


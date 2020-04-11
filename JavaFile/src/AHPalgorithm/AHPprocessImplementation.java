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


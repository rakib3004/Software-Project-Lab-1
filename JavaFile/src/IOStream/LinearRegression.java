package IOStream;

public class LinearRegression {
    int numberOfBooks=250;
    int i;
    double countMean = 0;
    double typeMean = 0;
    double bookCount[] = new double[1050];
    double bookCount2[] = new double[1050];
    double typeValue[] = new double[1050];
    double typeValue1[] = new double[1050];
    double typeValue0[] = new double[1050];

    int length;
    String string;
public  void calculateRegression(){



    for (i = 0; i < numberOfBooks; i++) {
        typeMean = typeMean + typeValue[i];
        countMean = countMean + bookCount[i];
    }

    typeMean = typeMean / numberOfBooks;
    countMean = countMean / numberOfBooks;

    double assumpMean1 = 0;
    double assumpMean2 = 0;
    for (i = 0; i < numberOfBooks; i++) {
        typeValue[i] = typeValue[i] - typeMean;
        bookCount[i] = bookCount[i] - countMean;
        assumpMean1 = assumpMean1 + (typeValue[i] * bookCount[i]);
        assumpMean2 = assumpMean2 + (typeValue[i] * typeValue[i]);

    }

    double metaValue = assumpMean1 / assumpMean2;
    double betaValue = countMean - (metaValue * typeMean);
    for (i = 0; i < numberOfBooks; i++) {

        bookCount2[i] = betaValue + metaValue * typeValue[i];
        //     System.out.println(typeValue0[i]+"\t"+typeValue1[i]);
    }

}
}

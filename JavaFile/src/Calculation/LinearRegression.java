package Calculation;

public class LinearRegression {

    int i;
    double y_mean = 0;
    double x_mean = 0;
   //  = new double[1050];
    double reg_y_value[] = new double[1050];
  //  = new double[1050];
    double alpha_value = 0;
    double beta_value = 0;
    int length;
    String string;
public  double [] calculateRegression( double x_value[],double y_value[], int numberOfBooks){


    for (i = 0; i < numberOfBooks; i++) {
        x_mean = x_mean + x_value[i];
        y_mean = y_mean + y_value[i];
    }

    x_mean = x_mean / numberOfBooks;
    y_mean = y_mean / numberOfBooks;


    for (i = 0; i < numberOfBooks; i++) {
        x_value[i] = x_value[i] - x_mean;
        y_value[i] = y_value[i] - y_mean;
        alpha_value = alpha_value + (x_value[i] * y_value[i]);
        beta_value = beta_value + (x_value[i] * x_value[i]);

    }

    double metaValue = alpha_value / beta_value;
    double betaValue = y_mean - (metaValue * x_mean);
    for (i = 0; i < numberOfBooks; i++) {

        reg_y_value[i] = betaValue + metaValue * x_value[i];
    }

return reg_y_value;
}
}

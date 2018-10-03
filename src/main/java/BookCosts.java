import java.util.ArrayList;

import static input.InputUtils.positiveDoubleInput;

/**
 * Created by gp2746me on 9/25/2018.
 */
public class BookCosts {
    public static void main(String[] args) {
        ArrayList<Double>cost= new ArrayList<>();
        int numBooks =3;
        double sum =0;
        for (int x= 0; x< numBooks; x++){
            double Price = positiveDoubleInput("what is the cost of text book" + (x+1));
            cost.add(Price);
        }

        for (Double d: cost){
            sum += d;
        }
        System.out.printf("The total cost of your books" + sum);
    }

}

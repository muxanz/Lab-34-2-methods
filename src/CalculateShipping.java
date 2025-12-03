public class CalculateShipping {
    public static boolean checkWeight(int weight) {
        boolean validateWeight = weight > 0 && weight <= 50;
        return validateWeight;
    }

    public static int calculateBaseRate(double weight) {
        int rate;
        if (weight > 0  && weight <= 1) {
            rate = 5;
        } else if (weight > 1  && weight <= 5) {
            rate = 10;
        } else if (weight > 5  && weight <= 20) {
            rate = 20;
        } else if (weight > 20  && weight <= 50) {
            rate = 50;
        } else {
            rate = 0;
        }

        return rate;
    }

    public static int calculateDistanceSurcharge(int km) {
        int surcharge;
        if (km < 10) {
            surcharge = 0;
        } else if (km >= 10 && km < 50) {
            surcharge = 5;
        } else if (km >= 50 && km < 200) {
            surcharge = 15;
        } else if (km >= 200) {
            surcharge = 30;
        } else {
            surcharge = 0;
        }

        return surcharge;
    }

}

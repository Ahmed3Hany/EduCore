
public class Main {

    public static double map(double value,
                        double fromLow, double fromHigh,
                        double toLow, double toHigh) {

        return (value - fromLow)
                * (toHigh - toLow)
                / (fromHigh - fromLow)
                + toLow;
    }

}

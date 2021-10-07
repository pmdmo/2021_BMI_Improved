package es.iessaladillo.pedrojoya.bmiimproved.bmi;

@SuppressWarnings("unused")
public final class Bmis {

    private static final int POUNDS_FACTOR = 703;

    private Bmis() {
    }

    public static float metricBmi(float kgs, float meters) {
        return kgs / (meters * meters);
    }

    public static float imperialBmi(float lbs, float inches) {
        return lbs * POUNDS_FACTOR / (inches * inches);
    }

}

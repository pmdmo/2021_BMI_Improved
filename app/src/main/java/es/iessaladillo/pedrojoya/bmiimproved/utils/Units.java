package es.iessaladillo.pedrojoya.bmiimproved.utils;

public final class Units {

    private static final float KGS_TO_LBS_FACTOR = 2.20462f;
    private static final float METERS_TO_IN_FACTOR = 39.3701f;

    private Units() {
    }

    public static float kilogramsToPounds(float kilograms) {
        return kilograms * KGS_TO_LBS_FACTOR;
    }

    public static float poundsToKilograms(float lbs) {
        return lbs / KGS_TO_LBS_FACTOR;
    }

    public static float metersToInches(float meters) {
        return meters * METERS_TO_IN_FACTOR;
    }

    public static float inchesToMeters(float inches) {
        return inches / METERS_TO_IN_FACTOR;
    }

}

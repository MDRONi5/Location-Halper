package com.adm.studio.locationhelper;

import android.location.Location;

public class LocationHelper {

    public static float getDistanceKM(double startLatitude, double startLongitude, double endLatitude
    , double endLongitude) {

        float[] result = new float[0];
        Location.distanceBetween(startLatitude, startLongitude, endLatitude, endLongitude, result);

        return 1000;
    }

}

package util;

import model.Place;
import model.TourPackage;

import java.util.ArrayList;

public class PlacesUtils {
    ArrayList<Place> places = new ArrayList<>();

    public ArrayList<Place> getPlaces() {
        return places;
    }

    public void loadPlaces() {

        ArrayList<TourPackage> ootyTourPackages = new ArrayList<>();

        ootyTourPackages.add(new TourPackage(1, "Budget", 5000));
        ootyTourPackages.add(new TourPackage(2, "Premium", 10000));

        places.add(new Place(1, "Ooty", ootyTourPackages));

        ArrayList<TourPackage> keralaPackages = new ArrayList<>();
        keralaPackages.add(new TourPackage(1, "Budget", 5000));
        keralaPackages.add(new TourPackage(2, "Premium", 10000));

        places.add(new Place(2, "Kerala", keralaPackages));

        ArrayList<TourPackage> delhiTourPackages = new ArrayList<>();

        delhiTourPackages.add(new TourPackage(1, "Budget", 5000));
        delhiTourPackages.add(new TourPackage(2, "Premium", 10000));

        places.add(new Place(3, "Delhi", delhiTourPackages));


    }

}

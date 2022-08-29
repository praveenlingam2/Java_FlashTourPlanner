package services;

import model.BookingHistory;
import model.Place;
import model.TourPackage;
import model.User;
import util.PlacesUtils;
import util.ReadInput;

import java.util.ArrayList;
import java.util.Date;

public class MainMenu implements MainMenuInterface {
    private Auth auth;
    private PlacesUtils placesUtils;
    private User loggedInUser;

    public MainMenu(Auth auth, PlacesUtils placesUtils, User loggedInUser) {
        this.auth = auth;
        this.placesUtils = placesUtils;
        this.loggedInUser = loggedInUser;
    }

    public void printMainMenu() {
        System.out.println("1. Places");
        System.out.println("2. View History");
        System.out.println("3. Logout");
        System.out.println("Enter your choice");
        int choice = ReadInput.getscanner().nextInt();
        switch (choice) {
            case 1: {
                printPlaces();
                break;
            }
            case 2: {
                printHistory();
                break;
            }
            case 3: {
                auth.printMenu();
            }
            default:
                System.out.println("Invalid choice!!");
        }
    }


    @Override
    public void printPlaces() {
        placesUtils.getPlaces().forEach(place -> System.out.println(place.getId() + "-" + place.getPlaces()));
        System.out.println("Enter your Choice");
        int placeChoice = ReadInput.getscanner().nextInt();
        Place selectedPlace = placesUtils.getPlaces().get(placeChoice - 1);
        selectedPlace.getTourPackages().forEach(tourPackage -> System.out.println(tourPackage.getId() + "-" + tourPackage.getPackageOption() + "-" + tourPackage.getPrice()));
        System.out.println("Enter you places");
        int packageChoice = ReadInput.getscanner().nextInt();
        TourPackage selectedTourPackage = selectedPlace.getTourPackages().get(packageChoice - 1);
        System.out.println("Enter members");
        int members = ReadInput.getscanner().nextInt();
        int totalAmount = selectedTourPackage.getPrice() * members;
        System.out.println("1.YES");
        System.out.println("2.NO");
        System.out.println("Enter your choice");
        int confirmChoice = ReadInput.getscanner().nextInt();
        if (confirmChoice == 1) {
            System.out.println("your booking is confirm");
            ArrayList<BookingHistory> bookingHistories = loggedInUser.getBookingHistories();
            BookingHistory bookingHistory = new BookingHistory(new Date(), loggedInUser.getUsername(),
                    selectedPlace.getPlaces(), selectedTourPackage.getPackageOption(),
                    totalAmount, members);
            bookingHistories.add(bookingHistory);
            loggedInUser.setBookingHistories(bookingHistories);
            printMainMenu();
        } else {
            printMainMenu();
        }


    }

    @Override
    public void printHistory() {
        if (loggedInUser.getBookingHistories().size() > 0) {
            System.out.println("--------------");
//            System.out.println("Place: " +);
        }

    }
}


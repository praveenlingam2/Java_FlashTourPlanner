import model.User;
import services.Auth;
import services.MainMenu;
import util.PlacesUtils;
import util.Utils;

public class Main {
    private static User PlacesUtils;

    public static void main(String[] args) {
        Utils.message();
        Auth auth = new Auth();
        auth.printMenu();
        PlacesUtils placesUtils = new PlacesUtils();
        placesUtils.loadPlaces();

        User loggedInUser = auth.getLoggedInUser();
        System.out.println("Login Successful");
        MainMenu mainMenu = new MainMenu(auth, placesUtils, loggedInUser);
        mainMenu.printMainMenu();

    }
}


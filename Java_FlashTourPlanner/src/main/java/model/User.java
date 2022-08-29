package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import model.BookingHistory;

import java.util.ArrayList;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class User {
    private int id;
    private String username;
    private String email;
    private String password;
    private ArrayList<BookingHistory> bookingHistories = new ArrayList<>();
}



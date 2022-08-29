package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookingHistory {
    private Date date;
    private String name;
    private String placeName;
    private String packages;
    private int price;
    private int count;
}



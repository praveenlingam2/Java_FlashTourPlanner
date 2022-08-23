package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;


@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Place {
    private int id;
    private String places;
    private ArrayList<TourPackage>tourPackages=new ArrayList<>();
    }



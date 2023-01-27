package com.example.animalshotel.room.model;
import com.example.animalshotel.animal.model.Animal;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Room {

    private int id;
    private int roomNumber;
    private RoomSizeEnum RoomSize;
    private double price;
    private List<Animal> animalList;



}

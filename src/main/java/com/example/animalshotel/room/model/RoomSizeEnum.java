package com.example.animalshotel.room.model;

public enum RoomSizeEnum {

    SMALL("SMALL"),
    MEDIUM("MEDIUM"),
    LARGE("LARGE");

    private String roomSize;

    RoomSizeEnum(String roomSize){
        this.roomSize = roomSize;
    }

    public String getRoomSize() {
        return roomSize;
    }
}

package org.example.hotelservice.services;


import org.example.hotelservice.entities.Hotel;

import java.util.List;

public interface HotelService {

    Hotel saveHotel(Hotel hotel);

    Hotel findHotelById(String id);

    List<Hotel> getAllHotel();

}

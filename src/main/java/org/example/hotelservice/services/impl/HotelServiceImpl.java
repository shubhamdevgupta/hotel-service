package org.example.hotelservice.services.impl;

import org.example.hotelservice.entities.Hotel;

import org.example.hotelservice.exception.ResourceNotFound;
import org.example.hotelservice.repositireies.HotelRepo;
import org.example.hotelservice.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelRepo hotelRepo;

    @Override
    public Hotel saveHotel(Hotel hotel) {
        String random = UUID.randomUUID().toString();
        hotel.setId(random);
        return hotelRepo.save(hotel);
    }

    @Override
    public Hotel findHotelById(String id) {
        return hotelRepo.findById(id).orElseThrow(()-> new ResourceNotFound("hotel not found by given id "));
    }

    @Override
    public List<Hotel> getAllHotel() {
        return hotelRepo.findAll();
    }
}

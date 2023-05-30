package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.lang.reflect.Array;

public class Card {
    int index;
    String name;
    String type;
    int price;
    Array rent;
    String colour;
    int houseCost;
    int hotelCost;
    int houses;
    int hotels;

    public Card(int index, String name, String type, int price, Array rent, String colour, int houseCost, int hotelCost, int houses, int hotels) {
        this.index = index;
        this.name = name;
        this.type = type;
        this.price = price;
        this.rent = rent;
        this.colour = colour;
        this.houseCost = houseCost;
        this.hotelCost = hotelCost;
        this.houses = houses;
        this.hotels = hotels;
    }

    public int getIndex() {
        return index;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    public Array getRent() {
        return rent;
    }

    public String getColour() {
        return colour;
    }

    public int getHouseCost() {
        return houseCost;
    }

    public int getHotelCost() {
        return hotelCost;
    }

    public int getHouses() {
        return houses;
    }

    public int getHotels() {
        return hotels;
    }
    @Override
    public String toString() {return name + " is a " + type + " priced at " + price + ". The rent collected would be " + rent + ". The colour is " + colour + " . To build a house, it costs " + houseCost + " and to build a hotel, it costs " + hotelCost + ". The current total of houses and hotels is " + houses + " and " + hotels + ".";}



}





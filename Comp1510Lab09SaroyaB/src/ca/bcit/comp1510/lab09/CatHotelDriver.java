/**
 * 
 */
package ca.bcit.comp1510.lab09;

import java.util.Random;

/**
 * @author saroy
 *
 */
public class CatHotelDriver {

    /**
     * @param args
     */
    public static void main(String[] args) {
        CatHotel testHotel = new CatHotel("Test Hotel");
        
        Random randnum = new Random();
        
        Cat cat1 = new Cat(randnum.nextInt(10), "TestCat1");
        Cat cat2 = new Cat(randnum.nextInt(10), "TestCat2");
        Cat cat3 = new Cat(randnum.nextInt(10), "TestCat3");
        Cat cat4 = new Cat(randnum.nextInt(10), "TestCat4");
        
        CatHotel hotelOfCats = new CatHotel("hotelOfCats");
        
        hotelOfCats.addCat(cat1);
        hotelOfCats.addCat(cat2);
        hotelOfCats.addCat(cat3);
        hotelOfCats.addCat(cat4);
        
        System.out.println("Number of guests: " + hotelOfCats.guestCount());
        
        hotelOfCats.printGuestList();
        
        hotelOfCats.removeOldGuests(2);
        System.out.println("Guests older than age 2 removed, new guest list:");
        
        hotelOfCats.printGuestList();
        
        
        
        
    }

}

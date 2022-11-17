/**
 * 
 */
package ca.bcit.comp1510.lab09;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author saroy
 *
 */
public class CatHotel {

    
    
    String hotelName;
    ArrayList<Cat> cats = new ArrayList<Cat>();
    
    public CatHotel(String name) {
        hotelName = name;
        
    }
    
    public void addCat(Cat cat) {
        
        cats.add(cat);
    }
    
    public void removeAllGuests() {
        cats.removeAll(cats);
    }
    
    public int guestCount() {
        return cats.size();
    }
    
    
    public int removeOldGuests(int age) {
        int catsRemoved = 0;
        Iterator<Cat> catIterator = cats.iterator();
        while (catIterator.hasNext()) {
            Cat temp = catIterator.next();
            
            if (temp.getAge() >= age){
                cats.remove(temp);
                catsRemoved++;
            }
        }
        return catsRemoved;
    }
    
    
    public void printGuestList() {
        System.out.println(hotelName);
        for (Cat i : cats) {
            i.toString();
        }
    }
}

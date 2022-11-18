/**
 * 
 */
package ca.bcit.comp1510.lab09;

/**
 * @author saroy
 *
 */
public class Cat {

    public String name;
    public int age;
    
    public Cat(int catAge, String catName) {
        name = (catName.isBlank()? "Cleo" : catName);
        age = (catAge > 0 ? catAge : 0);
        
    }


    public int getAge() {
        return age;
    }


    public void setAge(int newAge) {
        age = newAge;
    }


    public String getName() { 
        return name;
    }


  
    public String toString() {
        return "Cat name: " + name + " Cat= age:" + age;
    }
}

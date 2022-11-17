/**
 * 
 */
package ca.bcit.comp1510.lab09;

/**
 * @author saroy
 *
 */
public class CoinRunner {

    
    
    public static void main(String[] args) {
        Coin coin = new Coin();
        int count = 0;
        int max = 0;
        for(int i = 0; i < 100; i++) {
            coin.flip();
            
            
            if (coin.isHeads()) {
                count ++;
            }
            
            else {
                count = 0;
            }
            
            
            max = (count > max ? count : max);
            System.out.println(coin.toString());
        }
            
        System.out.println("The longest run of heads is " + max);
        
//        coin.flip();
        
    }
}

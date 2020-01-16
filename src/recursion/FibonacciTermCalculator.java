/*
 *   Created by IntelliJ IDEA Ultimate, 2020
 *   User: dbc2201
 *   Date: 16/01/20
 *   Time: 9:01 AM
 */

package recursion;

public class FibonacciTermCalculator {
    public int nTHTermCalculator(int k){
        int response=0;
        if(k==0||k==1){
            return k;
        }
        response=nTHTermCalculator ( k-1 )+nTHTermCalculator ( k-2 );
        return response;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

/**
 *
 * @author Admin
 */
public class Fibonacci {

    public static int fibo(int n, int first, int second) {
        if (n == 1) 
            return first; 
        if (n == 2) 
            return second; 
        return fibo(n - 1, second, first + second); 
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        for (int n = 1; n <46; n++) {
            System.out.println(fibo(n, 0, 1));
        }
        
    }
    
}

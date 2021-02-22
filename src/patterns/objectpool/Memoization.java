/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.objectpool;

import java.math.BigInteger;
import java.util.Date;

/**
 *
 * @author Veljko
 */
public class Memoization {

    static BigInteger[] array = new BigInteger[100];

    public static void main(String[] args) {
        Date date = new Date();
        fibonacci(42);
        System.out.println("Vreme bez memoizacije:" + (new Date().getTime() - date.getTime()));

        date = new Date();
        fibonacciWithMemoization(42);
        System.out.println("Vreme sa memoizacijom:" + (new Date().getTime() - date.getTime()));
    }

    public static BigInteger fibonacci(int n) {
        if (n == 1 || n == 2) {
            return BigInteger.ONE;
        }
        return fibonacci(n - 1).add(fibonacci(n - 2));
    }

    public static BigInteger fibonacciWithMemoization(int n) {
        if (n == 1 || n == 2) {
            return BigInteger.ONE;
        }
        if (array[n] == null) {
            array[n] = fibonacciWithMemoization(n - 1).add(fibonacciWithMemoization(n - 2));
        }
        return array[n];
    }
}

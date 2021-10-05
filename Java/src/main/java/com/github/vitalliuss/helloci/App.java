package com.github.vitalliuss.helloci;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Hello CI!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello CI!" );
        Integer number = 32;
        // Binary number format
        String convert = Integer.toBinaryString(number);
        System.out.print(convert + " ");
        // Octagonal number format
        convert = Integer.toOctalString(number);
        System.out.print(convert + " ");
        // Hexadecimal number format
        convert = Integer.toHexString(number).toUpperCase();
        System.out.print(convert + " ");

        F f = new F();
        try {
            f.f();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}

// Program to convert Roman Numerals to Numbers 
import java.util.*; 
  
public class RomanToNumbers 
{ 
    // This function returns value of a Roman symbol 
    int value(char r) 
    { 
        if (r == 'I') 
            return 1; 
        if (r == 'V') 
            return 5; 
        if (r == 'X') 
            return 10; 
        if (r == 'L') 
            return 50; 
        if (r == 'C') 
            return 100; 
        if (r == 'D') 
            return 500; 
        if (r == 'M') 
            return 1000; 
        return -1; 
    } 
 // Finds decimal value of a given romal numeral 
    int romanToDecimal(String str) 
    { 
        // Initialize result 
        int res = 0; 
  
        for (int i=0; i<str.length(); i++) 
        { 
            // Getting value of symbol s[i] 
            int s1 = value(str.charAt(i)); 
  
            // Getting value of symbol s[i+1] 
            if (i+1 <str.length()) 
            { 
                int s2 = value(str.charAt(i+1)); 
  
                // Comparing both values 
                if (s1 >= s2) 
                { 
                    // Value of current symbol is greater 
                    // or equalto the next symbol 
                    res = res + s1; 
                } 
                else
                { 
                    res = res + s2 - s1; 
                    i++; // Value of current symbol is 
                    // less than the next symbol 
                } 
            } 
            else
            { 
                res = res + s1; 
                i++; 
            } 
        } 
  
        return res; 
    } 
 // Driver method 
    public static void main(String args[]) 
    { 
        RomanToNumbers ob = new RomanToNumbers(); 
  
        // Considering inputs given are valid 
        String str1 = "IIVX";
       // String str = "MCMIV"; 
        System.out.println("Integer form of Roman Numeral" + 
                           " is " + ob.romanToDecimal(str1)); 
    } 
} 
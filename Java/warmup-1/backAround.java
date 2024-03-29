/**
 * Given a string, take the last char and return a new string with the last char 
 * added at the front and back, so "cat" yields "tcatt". 
 * The original string will be length 1 or more.
 * 
 */

public String backAround(String str) {
    String lastChar;                        // variable declaration
    lastChar = str.substring(str.length-1); // stores the last character of the provided string
    return lastChar + str + lastChar;       // returns the new one
}

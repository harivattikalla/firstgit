package com.iq.test;

public class Alphabet {
public static void main(String[] args) {
    char c = 'a';
    if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
        System.out.println(c + " is an alphabet.");
    else
        System.out.println(c + " is not an alphabet.");
    
    
     c = 'A';
    String output = (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') ? c + " is an alphabet." : c + " is not an alphabet.";
    System.out.println(output);
    
}
}

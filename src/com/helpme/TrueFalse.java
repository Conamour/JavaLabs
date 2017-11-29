package com.helpme;

public class TrueFalse {
    boolean dividesByTwo(int z){
        return (z%2==0);
    }

    public  String trueFalse(){
        if(dividesByTwo(4)){
            return("Yes");
        }
        else {
            return("No");
        }
       // System.out.println( dividesByTwo(6) );
    }
}

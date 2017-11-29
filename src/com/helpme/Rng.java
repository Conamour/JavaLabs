package com.helpme;

public class Rng {
        int randomGeneratorNumber(int x, int y){
            int random_number1 = x + (int) (Math.random() * y); // Генерация 1-го числa
            return random_number1;
        }
}

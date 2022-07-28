package ru.netology.sqr;

public class SqrService {
    public int count(int a, int b) {
        int quantity = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= a & i * i <= b) {
                quantity++;
            }
        }
        return quantity;
    }
}




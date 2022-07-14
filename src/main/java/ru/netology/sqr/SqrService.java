package ru.netology.sqr;

public class SqrService {
    public int count(int x) {
        for (int i = 10; i <= 99; i++) {
            if (i * i >= x) {
                return i;
            }
        }
        return -1;
    }
}



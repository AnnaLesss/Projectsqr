package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SqrServiceTest {
    @Test
    public void number() {
        SqrService service = new SqrService();

        int expected = 4;
        int actual = service.count(200, 350);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void zero() {
        SqrService service = new SqrService();

        int expected = 0;
        int actual = service.count(200, 200);

        Assertions.assertEquals(expected, actual);
    }
}
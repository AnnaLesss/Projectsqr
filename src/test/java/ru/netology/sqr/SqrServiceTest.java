package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SqrServiceTest {
    @Test
    public void number() {
        SqrService service = new SqrService();
        int x = 36;
        int expected = 6;
        int actual = service.count(x);

        Assertions.assertEquals(expected, actual);
    }
    }
}

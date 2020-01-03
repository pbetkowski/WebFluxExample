package domain;

import org.junit.Test;

import static org.junit.Assert.*;

public class ApplicationTest {

    @Test
    public void add() {
        Application application = new Application();

        assertEquals(10, application.add(5, 5));
    }
}

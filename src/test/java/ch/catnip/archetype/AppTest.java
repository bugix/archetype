package ch.catnip.archetype;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Log4j2
public class AppTest {

    @Test
    public void testApp() {
        var hello = new Hello("World");
        log.error("Hallo {}!", hello.getHello());
        assertEquals("Nobody", hello.getHello());
    }
}

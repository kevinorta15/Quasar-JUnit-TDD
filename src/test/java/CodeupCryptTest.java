import org.junit.Test;

import static org.junit.Assert.*;

public class CodeupCryptTest {

    @Test
    public void testIfVersionIsSet(){
        assertEquals(0.0, CodeupCrypt.version, 0);
        CodeupCrypt.version = 1.2;
        assertEquals(1.2, CodeupCrypt.version, 0);
    }

    @Test
    public void testHash(){
        assertEquals("C0d39p", CodeupCrypt.hashPassword("Codeup"));
        assertEquals("F3r", CodeupCrypt.hashPassword("Fer"));
    }

    @Test
    public void testCheckPassword(){
        assertTrue("check password", CodeupCrypt.checkPassword("fer", "f3r"));
        assertFalse("check password", CodeupCrypt.checkPassword("fer", "fer"));
    }
}

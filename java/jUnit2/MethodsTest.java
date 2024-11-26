import static org.junit.Assert.*;
import org.junit.Test;

public class MethodsTest {

    Methods m = new Methods();

    @Test
    public void anagram_Seed_Dees(){
        assertTrue(m.isAnagram("Seed", "Dees"));
    }
    @Test
    public void anagram_Seed_Deez_False(){
        assertFalse(m.isAnagram("Seed", "DeeZ"));
    }
    @Test
    public void anagram_Seed_Des_False(){
        assertFalse(m.isAnagram("Seed", "Des"));
    }
    @Test
    public void anagram_Sed_Des(){
        assertTrue(m.isAnagram("Seed", "Dees"));
    }

    @Test
    public void fibonacciNegative(){
        assertEquals(-1, m.fibonacci(-6));
    }
    @Test
    public void fibonacciZero(){
        assertEquals(0, m.fibonacci(0));
    }
    @Test
    public void fibonacciOne(){
        assertEquals(1, m.fibonacci(1));
    }
    @Test
    public void fibonacciTwo(){
        assertEquals(1, m.fibonacci(2));
    }
    @Test
    public void fibonacciSix(){
        assertEquals(8, m.fibonacci(6));
    }

    @Test
    public void LetterCounterDeez(){
        assertEquals(3, m.countLetters("Deez"));
    }
    @Test
    public void LetterCounterDEez(){
        assertEquals(3, m.countLetters("DEez"));
    }
    @Test
    public void LetterCounterStunseed(){
        assertEquals(6, m.countLetters("Stunseed"));
    }
}

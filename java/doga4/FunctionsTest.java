import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FunctionsTest {
    Functions f = new Functions();
    
    @Test
    public void dividersNumber0() {
        assertEquals(0, f.dividersNumber(0));
    }
    @Test
    public void dividersNumber1() {
        assertEquals(1, f.dividersNumber(1));
    }
    @Test
    public void dividersNumberNegative1() {
        assertEquals(1, f.dividersNumber(-1));
    }
    @Test
    public void dividersNumber3() {
        assertEquals(2, f.dividersNumber(3));
    }
    @Test
    public void dividersNumber6() {
        assertEquals(4, f.dividersNumber(6));
    }
    @Test
    public void dividersNumberNegative6() {
        assertEquals(4, f.dividersNumber(-6));
    }

    @Test
    public void maxOfThree1_2_3(){
        assertEquals(3, f.maxOfThree(1, 2, 3));
    }
    @Test
    public void maxOfThree1_3_2(){
        assertEquals(3, f.maxOfThree(1, 3, 2));
    }
    @Test
    public void maxOfThree2_1_3(){
        assertEquals(3, f.maxOfThree(2, 1, 3));
    }
    @Test
    public void maxOfThree2_3_1(){
        assertEquals(3, f.maxOfThree(2, 3, 1));
    }
    @Test
    public void maxOfThree3_1_2(){
        assertEquals(3, f.maxOfThree(3,1,2));
    }
    @Test
    public void maxOfThree3_2_1(){
        assertEquals(3, f.maxOfThree(3,2,1));
    }
    @Test
    public void maxOfThree2_2_3(){
        assertEquals(3, f.maxOfThree(2, 2, 3));
    }
    @Test
    public void maxOfThree2_3_2(){
        assertEquals(3, f.maxOfThree(2, 3, 2));
    }
    @Test
    public void maxOfThree3_2_2(){
        assertEquals(3, f.maxOfThree(3, 2, 2));
    }
    @Test
    public void maxOfThree3_3_3(){
        assertEquals(3, f.maxOfThree(3, 3, 3));
    }

    @Test
    public void fizzBuzz1(){
        assertEquals(1, f.fizzBuzz(1));;
    }
    @Test
    public void fizzBuzz3(){
        assertEquals("Fizz", f.fizzBuzz(3));;
    }
    @Test
    public void fizzBuzz5(){
        assertEquals("Buzz", f.fizzBuzz(5));;
    }
    @Test
    public void fizzBuzz15(){
        assertEquals("FizzBuzz", f.fizzBuzz(15));;
    }
    @Test
    public void fizzBuzz0(){
        assertEquals("FizzBuzz", f.fizzBuzz(0));;
    }
    @Test
    public void fizzBuzz7(){
        assertEquals(7, f.fizzBuzz(7));;
    }

    @Test
    public void isVowel_a(){
        assertTrue(f.isVowel('a'));
    }
    @Test
    public void isVowel_e(){
        assertTrue(f.isVowel('e'));
    }
    @Test
    public void isVowel_i(){
        assertTrue(f.isVowel('i'));
    }
    @Test
    public void isVowel_o(){
        assertTrue(f.isVowel('o'));
    }
    @Test
    public void isVowel_u(){
        assertTrue(f.isVowel('u'));
    }
    @Test
    public void isVowel_g(){
        assertFalse(f.isVowel('g'));
    }
    @Test
    public void isVowel_y(){
        assertFalse(f.isVowel('y'));
    }
    @Test
    public void isVowel_l(){
        assertFalse(f.isVowel('l'));
    }
    @Test
    public void isVowel_0(){
        assertFalse(f.isVowel('0'));
    }
    @Test
    public void isVowel_6(){
        assertFalse(f.isVowel('6'));
    }
    @Test
    public void isVowel_dot(){
        assertFalse(f.isVowel('.'));
    }
}

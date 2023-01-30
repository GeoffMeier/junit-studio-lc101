package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;
public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
    @Test
public void hasBrackets(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }


    @Test
    public void incorrectCurlyBrackets(){

        assertFalse(BalancedBrackets.incorrectBrackets("{}"));

    }
    @Test
    public void incorrectBrackets(){
        assertFalse(BalancedBrackets.incorrectBrackets("()"));
    }

    @Test
public void otherCharacter(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[code]"));
}
@Test
    public void incorrectWay(){
        assertFalse(BalancedBrackets.unbalncedBrackets("]LaunchCode["));
}
   @Test
    public void oneWayBrackets(){
       assertFalse(BalancedBrackets.("]]"));
        assertFalse(BalancedBrackets.("[["));

}

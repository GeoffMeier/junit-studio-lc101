package test;

import main.BalancedBrackets;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
    @Test
    public void onlyBracketsReturnsTrue() {
        String spec = "a single set of balanced brackets returns true";
        String testData = "[]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(spec, result);
    }

    @Test
    public void BracketsBeforeReturnsTrue() {
        String spec = "a single set of balanced brackets before other characters returns true";
        String testData = "[]LaunchCode";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(spec, result);
    }
    @Test
    public void BracketsAroundAString() {
        String spec = "a single set of balanced brackets in between characters returns true";
        String testData = "[LaunchCode]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(spec, result);
    }
    @Test
    public void BracketsInBetweenAString() {
        String spec = "a single set of balanced brackets wrapped around some characters returns true";
        String testData = "Launch[code]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(spec, result);
    }
    @Test
    public void ThreeConsecutivePairsOfBrackets() {
        String spec = "Three consecutive balanced brackets returns true";
        String testData = "[][][]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(spec, result);
    }
    @Test
    public void ThreeNestedPairsOfBrackets() {
        String spec = "Three consecutive balanced brackets returns true";
        String testData = "[[[]]]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(spec, result);
    }

    @Test
    public void singleOpeningBracket() {
        String spec = "Single opening bracket returns false";
        String testData = "[";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(spec, result);
    }
    @Test
    public void singleClosingBracket() {
        String spec = "Single closing bracket returns false";
        String testData = "]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(spec, result);
    }
    @Test
    public void pairOfReversedBrackets() {
        String spec = "pair of reversed brackets returns false";
        String testData = "][";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(spec, result);
    }
    @Test
    public void singleBracketWithOtherCharacters() {
        String spec = "Single bracket with other characters";
        String testData = "]LaunchCode";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(spec, result);
    }
    @Test
    public void pairOfReversedBracketsWithDifferentCharacters() {
        String spec = "pair of reversed brackets with different characters returns false";
        String testData = "]LaunchCode[";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(spec, result);
    }


}

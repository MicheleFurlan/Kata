package NarcisisticNumberPackage;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class NumberUtilsTest {
	
	@Test
	void testNumbersAreSplitted() {
		int[] expected = {1,5,3};
		assertArrayEquals(NumberUtils.splitNumber(153), expected);
	}
	
    @Test
    void test153isNarcisistic() {
        assertTrue(NumberUtils.isNarcissistic(153), "153 is narcissistic");
    }
    
    @Test
    void test1634isNarcisistic() {
        assertTrue(NumberUtils.isNarcissistic(1634), "1634 is narcissistic");
    }
    
    @Test
    void test112isNotNarcisistic() {
        assertFalse(NumberUtils.isNarcissistic(112), "112 is not narcissistic");
    }

}
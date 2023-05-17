package coding.interview.questions;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ReverseANumberTest{
    @Test
    public void testReverseThisNumber() {
        ReverseANumber reverseANumber = new ReverseANumber();
        assertEquals(4321, ReverseANumber.getNumReversed(1234));
    }

}
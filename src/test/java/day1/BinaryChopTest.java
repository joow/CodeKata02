package day1;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.testng.Assert.*;

@Test
public class BinaryChopTest {
    public void shouldNotFindPositionInAnEmptyArray() {
        final int position = find(1, Collections.emptyList());
        assertEquals(-1, position);
    }

    public void shouldNotFindPositionInNullArray() {
        assertEquals(-1, find(1, null));
    }

    public void shouldNotFindNonExistentItem() {
        final int position = find(1, Arrays.asList(2, 3, 4, 5));
        assertEquals(-1, position);
    }

    private int find(final int value, final List<Integer> values) {
        return new BinaryChop().find(value).in(values);
    }

    public void shouldFindPosition() {
        final int position = find(1, Arrays.asList(1, 2, 3, 4, 5));
        assertEquals(0, position);
    }

    public void shouldFindPositionInAnyHalf() {
        final int position = find(7, Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
        assertEquals(7, position);
    }
}
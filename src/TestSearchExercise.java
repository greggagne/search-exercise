import static org.junit.Assert.*;
import org.junit.Test;


import org.junit.Test;
public class TestSearchExercise {

    @Test
    public void testSequentialSearchFindsMiddleElement() {
        Integer[] list = {1, 3, 5, 7, 9};
        assertTrue(SearchExercise.sequentialSearch(list, 5));
    }

    @Test
    public void testSequentialSearchFindsFirstElement() {
        Integer[] list = {1, 3, 5, 7, 9};
        assertTrue(SearchExercise.sequentialSearch(list, 1));
    }

    @Test
    public void testSequentialSearchFindsLastElement() {
        Integer[] list = {1, 3, 5, 7, 9};
        assertTrue(SearchExercise.sequentialSearch(list, 9));
    }

    @Test
    public void testSequentialSearchDoesNotFindMissingElement() {
        Integer[] list = {1, 3, 5, 7, 9};
        assertFalse(SearchExercise.sequentialSearch(list, 4));
    }

    @Test
    public void testSequentialSearchEmptyArray() {
        Integer[] list = {};
        assertFalse(SearchExercise.sequentialSearch(list, 10));
    }

    @Test
    public void testSequentialSearchSingleElementFound() {
        Integer[] list = {42};
        assertTrue(SearchExercise.sequentialSearch(list, 42));
    }

    @Test
    public void testSequentialSearchSingleElementNotFound() {
        Integer[] list = {42};
        assertFalse(SearchExercise.sequentialSearch(list, 5));
    }

    @Test
    public void testSequentialSearchWithStrings() {
        String[] list = {"apple", "banana", "cherry"};
        assertTrue(SearchExercise.sequentialSearch(list, "banana"));
        assertFalse(SearchExercise.sequentialSearch(list, "orange"));
    }

    @Test
    public void testBinarySearchFindsMiddleElement() {
        Integer[] list = {1, 3, 5, 7, 9};
        assertTrue(SearchExercise.search(list, 5));
    }

    @Test
    public void testBinarySearchFindsFirstElement() {
        Integer[] list = {1, 3, 5, 7, 9};
        assertTrue(SearchExercise.search(list, 1));
    }

    @Test
    public void testBinarySearchFindsLastElement() {
        Integer[] list = {1, 3, 5, 7, 9};
        assertTrue(SearchExercise.search(list, 9));
    }

    @Test
    public void testBinarySearchDoesNotFindMissingElement() {
        Integer[] list = {1, 3, 5, 7, 9};
        assertFalse(SearchExercise.search(list, 4));
    }

    @Test
    public void testBinarySearchEmptyArray() {
        Integer[] list = {};
        assertFalse(SearchExercise.search(list, 10));
    }

    @Test
    public void testBinarySearchSingleElementFound() {
        Integer[] list = {42};
        assertTrue(SearchExercise.search(list, 42));
    }

    @Test
    public void testBinarySearchSingleElementNotFound() {
        Integer[] list = {42};
        assertFalse(SearchExercise.search(list, 5));
    }

    @Test
    public void testBinarySearchWithStrings() {
        String[] list = {"apple", "banana", "cherry", "date"};
        assertTrue(SearchExercise.search(list, "cherry"));
        assertFalse(SearchExercise.search(list, "orange"));
    }

    @Test
    public void testBinarySearchWithDuplicateValues() {
        Integer[] list = {1, 2, 2, 2, 3, 4};
        assertTrue(SearchExercise.search(list, 2));
        assertFalse(SearchExercise.search(list, 5));
    }
}
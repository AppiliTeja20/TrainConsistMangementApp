import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UseCase16TrainConsistMgmtTest {

    @Test
    void testBasicSorting() {
        int[] arr = {72, 56, 24, 70, 60};
        UseCase16TrainConsistMgmt.bubbleSort(arr);
        assertArrayEquals(new int[]{24, 56, 60, 70, 72}, arr);
    }

    @Test
    void testAlreadySortedArray() {
        int[] arr = {24, 56, 60, 70, 72};
        UseCase16TrainConsistMgmt.bubbleSort(arr);
        assertArrayEquals(new int[]{24, 56, 60, 70, 72}, arr);
    }

    @Test
    void testDuplicateValues() {
        int[] arr = {72, 56, 56, 24};
        UseCase16TrainConsistMgmt.bubbleSort(arr);
        assertArrayEquals(new int[]{24, 56, 56, 72}, arr);
    }

    @Test
    void testSingleElementArray() {
        int[] arr = {50};
        UseCase16TrainConsistMgmt.bubbleSort(arr);
        assertArrayEquals(new int[]{50}, arr);
    }

    @Test
    void testAllEqualValues() {
        int[] arr = {40, 40, 40};
        UseCase16TrainConsistMgmt.bubbleSort(arr);
        assertArrayEquals(new int[]{40, 40, 40}, arr);
    }
}
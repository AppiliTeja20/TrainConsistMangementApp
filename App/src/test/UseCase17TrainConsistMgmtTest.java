import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UseCase17TrainConsistMgmtTest {

    @Test
    void testBasicAlphabeticalSorting() {
        String[] arr = {"Sleeper","AC Chair","First Class","General","Luxury"};
        UseCase17TrainConsistMgmt.sortBogieNames(arr);
        assertArrayEquals(new String[]{"AC Chair","First Class","General","Luxury","Sleeper"}, arr);
    }

    @Test
    void testUnsortedInput() {
        String[] arr = {"Luxury","General","Sleeper","AC Chair"};
        UseCase17TrainConsistMgmt.sortBogieNames(arr);
        assertArrayEquals(new String[]{"AC Chair","General","Luxury","Sleeper"}, arr);
    }

    @Test
    void testAlreadySortedArray() {
        String[] arr = {"AC Chair","First Class","General"};
        UseCase17TrainConsistMgmt.sortBogieNames(arr);
        assertArrayEquals(new String[]{"AC Chair","First Class","General"}, arr);
    }

    @Test
    void testDuplicateBogieNames() {
        String[] arr = {"Sleeper","AC Chair","Sleeper","General"};
        UseCase17TrainConsistMgmt.sortBogieNames(arr);
        assertArrayEquals(new String[]{"AC Chair","General","Sleeper","Sleeper"}, arr);
    }

    @Test
    void testSingleElementArray() {
        String[] arr = {"Sleeper"};
        UseCase17TrainConsistMgmt.sortBogieNames(arr);
        assertArrayEquals(new String[]{"Sleeper"}, arr);
    }
}
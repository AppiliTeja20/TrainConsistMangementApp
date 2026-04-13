import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UseCase18TrainConsistMgmtTest {

    @Test
    void testBogieFound() {
        String[] arr = {"BG101","BG205","BG309","BG412","BG550"};
        assertTrue(UseCase18TrainConsistMgmt.linearSearch(arr, "BG309"));
    }

    @Test
    void testBogieNotFound() {
        String[] arr = {"BG101","BG205","BG309","BG412","BG550"};
        assertFalse(UseCase18TrainConsistMgmt.linearSearch(arr, "BG999"));
    }

    @Test
    void testFirstElementMatch() {
        String[] arr = {"BG101","BG205","BG309","BG412","BG550"};
        assertTrue(UseCase18TrainConsistMgmt.linearSearch(arr, "BG101"));
    }

    @Test
    void testLastElementMatch() {
        String[] arr = {"BG101","BG205","BG309","BG412","BG550"};
        assertTrue(UseCase18TrainConsistMgmt.linearSearch(arr, "BG550"));
    }

    @Test
    void testSingleElementArray() {
        String[] arr = {"BG101"};
        assertTrue(UseCase18TrainConsistMgmt.linearSearch(arr, "BG101"));
    }
}
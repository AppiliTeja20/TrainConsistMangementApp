import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UC14 {

    @Test
    void testValidCapacity() throws Exception {
        UseCase14TrainConsistMgmt.PassengerBogie b =
                new UseCase14TrainConsistMgmt.PassengerBogie("Sleeper", 50);
        assertEquals(50, b.capacity);
    }

    @Test
    void testNegativeCapacity() {
        Exception e = assertThrows(
                UseCase14TrainConsistMgmt.InvalidCapacityException.class,
                () -> new UseCase14TrainConsistMgmt.PassengerBogie("AC", -10)
        );
        assertEquals("Capacity must be greater than zero", e.getMessage());
    }

    @Test
    void testZeroCapacity() {
        Exception e = assertThrows(
                UseCase14TrainConsistMgmt.InvalidCapacityException.class,
                () -> new UseCase14TrainConsistMgmt.PassengerBogie("AC", 0)
        );
        assertEquals("Capacity must be greater than zero", e.getMessage());
    }
}
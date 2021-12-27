import model.Coin;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CoinTest {
    Coin coin;

    @BeforeEach
    void setup() {
        coin = new Coin();
    }

    @Test
    void testFlipSame() {
        boolean prev = false;
        boolean Changed = false;
        for(int i=0; i<1000; i++) {
            coin.flip();
            boolean result = coin.checkStatus();
            if (i == 0) {
                prev = result;
            }
            if (prev != result) {
                Changed = true;
            }
        }
        assertTrue(Changed);
    }

    @Test
    void testFlipSameTen() {
        boolean prev = false;
        int counter = 0;
        for(int i=0; i<1000; i++) {
            coin.flip();
            boolean result = coin.checkStatus();
            if (i == 0) {
                prev = result;
            }
            if (prev == result) {
                counter++;
            } else {
                counter = 0;
            }
            assertFalse(counter > 10);
        }
    }
}

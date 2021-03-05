import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class PerfectCubeTest {

  static final long[] cube = {
      -1,
      0,
      27,
      125,

  };

  static final long[] nonCube = {
      3,
      2,
      28,
      65,

  };

  @Test
  void perfectCube_cube() {
    for (long value : cube) {
      assertTrue(PerfectCube.perfectCube(value));
    }
  }

  @Test
  void perfectCube_nonCube() {
    for (long value : nonCube) {
      assertFalse(PerfectCube.perfectCube(value));
    }
  }
}
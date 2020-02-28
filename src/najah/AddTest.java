package najah;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddTest {

	@Test
	void test() {
		Hw ob = new Hw();
		int act = ob.add(3, 3);
		assertTrue(6==act);
	}

}

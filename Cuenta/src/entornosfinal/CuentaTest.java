package entornosfinal;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class CuentaTest {
	@Test
	public void ingreso(){
		Cuenta cuenta1 = new Cuenta("Jorge", "lopez", "M�stoles", 50365525, 680906267, 21, 13456789, 2580.95 );
		assertTrue(cuenta1.ingreso(100));
	}
	@Test
	public void retirada(){
		Cuenta cuenta1 = new Cuenta("Jorge", "lopez", "M�stoles", 50365525, 680906267, 21, 13456789, 2580.95 );
		assertFalse(cuenta1.retirada(-1));
	}
	 }

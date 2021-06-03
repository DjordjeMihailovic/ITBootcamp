package DomaciTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;


public class CalcTest {

	public static void main(String[] args) {
		
	}	
		@Test
		public void kvadratTest() {
			Calc kvt = new Calc();
			double rez = kvt.pKvadrata(4);
			Assert.assertEquals(rez, 16);
	}
		@Test
		public void krugTest() {
			Calc krt = new Calc();
			double rez = krt.pKruga(3);
			Assert.assertEquals(rez, 28.26);
	}
		@Test
		public void pravougaonikTest() {
			Calc pt = new Calc();
			double rez = pt.pPravougaonika(3, 4);
			Assert.assertEquals(rez, 12.0);
	}
}

package DomaciTestNG2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestBankaKod {

	public static void main(String[] args) {

	}		
		@Test
		public void testdohvatiIme() {
			BankaKod b1 = new BankaKod("Boban", "123456");
			Assert.assertEquals(b1.dohvatiIme(), "Boban");						
		}
		@Test
		public void testdohvatiZiroRacun() {
			BankaKod b1 = new BankaKod("Boban", "123456");
			Assert.assertEquals(b1.dohvatiZiroRacun(), "123456");						
		}
		@Test
		public void testdohvatiIznos() {
			BankaKod b1 = new BankaKod("Boban", "123456");
			Assert.assertEquals(b1.dohvatiIznos(), 0.0);						
		}
		@Test
		public void testKonstruktor() {
			BankaKod b1 = new BankaKod("Boban", "123456");
			BankaKod b2 = new BankaKod("Djordje", "123456");
			Assert.assertNotEquals(b1, b2);
			/* Nisam siguran da li je metod ispravan za testiranje konstruktora posto
			  u funkciji nemamo ispis toString, video sam da getter za ime dostavlja "ime" kao string
			  pa mi je palo napamet da uradim ovaj test da potvrdim da je getter pogresan
			  a ne konstruktor
			 */
		}
	}
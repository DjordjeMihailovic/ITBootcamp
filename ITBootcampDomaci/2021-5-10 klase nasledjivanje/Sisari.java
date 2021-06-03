package Domaci;

public class Sisari extends Zivotinja {

		private String bojaDlake;
		private int brojNogu;
		
		public Sisari(String vrsta, String naziv, String omHrana, String bojaDlake, int brojNogu) {
			super(vrsta, naziv, omHrana);
			this.bojaDlake = bojaDlake;
			this.brojNogu = brojNogu;
		}

		public String getBojaDlake() {
			return bojaDlake;
		}

		public void setBojaDlake(String bojaDlake) {
			this.bojaDlake = bojaDlake;
		}

		public int getBrojNogu() {
			return brojNogu;
		}

		public void setBrojNogu(int brojNogu) {
			this.brojNogu = brojNogu;
		}

		@Override
		public String toString() {
			return "Sisari [Vrsta=" + getVrsta() + ", Naziv=" + getNaziv() + ", OmHrana=" + getOmHrana()
					+ ", bojaDlake=" + bojaDlake + ", brojNogu=" + brojNogu + "]";
		}
		
}
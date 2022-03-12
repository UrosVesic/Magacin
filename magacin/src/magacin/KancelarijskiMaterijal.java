package magacin;

public class KancelarijskiMaterijal extends Artikal {
	
	public KancelarijskiMaterijal(int sifra, String naziv, String opis, int kolicina) {
		super(sifra, naziv, opis, kolicina);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Kancelarijski materijal [naziv=" + naziv + "]";
	}
}

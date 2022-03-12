package magacin;

public class Knjiga extends Artikal {
	public Knjiga(int sifra, String naziv, String opis, int kolicina) {
		super(sifra, naziv, opis, kolicina);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Knjiga [naziv=" + naziv + "]";
	}
}

package magacin;

import java.util.Date;

public class KucnaHemija extends Artikal {
	public KucnaHemija(int sifra, String naziv, String opis, int kolicina, Date rokTrajanja) {
		super(sifra, naziv, opis, kolicina);
		this.rokTrajanja = rokTrajanja;
	}

	private Date rokTrajanja;

	public Date getRokTrajanja() {
		return rokTrajanja;
	}

	public void setRokTrajanja(Date rokTrajanja) {
		if(rokTrajanja == null) {
			throw new IllegalArgumentException("Rok trajanja mora biti unet");
		}
		this.rokTrajanja = rokTrajanja;
	}
	
	@Override
	public String toString() {
		return "Kucna hemija [naziv=" + naziv + "]";
	}
	
}

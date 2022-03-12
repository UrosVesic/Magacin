package magacin;

import java.util.Objects;

public abstract class Artikal {
	protected int sifra;
	protected String naziv;
	protected String opis;
	protected int kolicina;
	public int getSifra() {
		return sifra;
	}
	public void setSifra(int sifra) {
		if(sifra < 1) {
			throw new IllegalArgumentException("Sifra mora biti veca od 0");
		}
		this.sifra = sifra;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		if(naziv == null || naziv.isEmpty() || naziv.isBlank()) {
			throw new IllegalArgumentException("Nije unet naziv");
		}
		this.naziv = naziv;
	}
	public String getOpis() {
		return opis;
	}
	public void setOpis(String opis) {
		if(opis == null || opis.isEmpty() || opis.isBlank()) {
			throw new IllegalArgumentException("Nije unet opis");
		}
		this.opis = opis;
	}
	public int getKolicina() {
		return kolicina;
	}
	public void setKolicina(int kolicina) {
		if(kolicina < 0) {
			throw new IllegalArgumentException("Kolicina ne sme biti manja od 0");
		}
		this.kolicina = kolicina;
	}
	@Override
	public int hashCode() {
		return Objects.hash(naziv, sifra);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Artikal other = (Artikal) obj;
		return Objects.equals(naziv, other.naziv) && sifra == other.sifra;
	}
	@Override
	public String toString() {
		return "Artikal [naziv=" + naziv + "]";
	}
	
	
	
}

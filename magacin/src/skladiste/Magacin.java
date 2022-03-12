package skladiste;

import java.util.ArrayList;
import java.util.List;

import magacin.Artikal;

public class Magacin implements IMagacin {
	
	private List<Artikal> zalihe;
	
	public Magacin() {
		zalihe = new ArrayList<>();
	}


	@Override
	public void dodajUMagacin(Artikal artikal) {
		for (Artikal artikalSaZaliha : zalihe) {
			if(artikalSaZaliha.equals(artikal)) {
				artikalSaZaliha.setKolicina(artikalSaZaliha.getKolicina()+artikal.getKolicina());
				return;
			}
		}
		zalihe.add(artikal);

	}

	@Override
	public void izbaciIzMagacina(Artikal artikal) throws Exception {
		for (Artikal artikalSaZaliha : zalihe) {
			if(artikalSaZaliha.equals(artikal)) {
				if(artikalSaZaliha.getKolicina()<artikal.getKolicina()) {
					throw new IllegalArgumentException("Nema dovoljno artikla na zalihama");
				}
				artikalSaZaliha.setKolicina(artikalSaZaliha.getKolicina()-artikal.getKolicina());
			}
		}
		throw new Exception("Ne postoji ovaj artikal");
	}

	@Override
	public Artikal pretraziArtikal(int sifra) throws Exception{
		if(sifra<1) {
			throw new IllegalArgumentException("Sifra mora biti veca od 0");
		}
		for (Artikal artikalSaZaliha : zalihe) {
			if(artikalSaZaliha.getSifra()==sifra) {
				return artikalSaZaliha;
			}
		}
		throw new Exception("Ne postoji artkal sa navedenom sifrom");
	}

}

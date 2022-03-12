package skladiste;

import java.util.List;

import magacin.Artikal;

public class Magacin implements IMagacin {
	
	private List<Artikal> zalihe;

	@Override
	public void dodajUMagacin(Artikal artikal) {
		if(zalihe.contains(artikal)) {
			for (Artikal artikalSaZaliha : zalihe) {
				if(artikalSaZaliha.equals(artikal)) {
					artikalSaZaliha.setKolicina(artikalSaZaliha.getKolicina()+artikal.getKolicina());
				}
			}
		}else {
			zalihe.add(artikal);
		}

	}

	@Override
	public void izbaciIzMagacina(Artikal artikal) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public Artikal pretraziArtikal(int sifra) {
		// TODO Auto-generated method stub
		return null;
	}

}

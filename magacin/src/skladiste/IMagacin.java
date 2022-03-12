package skladiste;

import magacin.Artikal;

public interface IMagacin {
	public void dodajUMagacin(Artikal artikal);
	public void izbaciIzMagacina(Artikal artikal) throws Exception;
	public Artikal pretraziArtikal(int sifra) throws Exception;
}

package tn.esprit.rh.achat.service;
import static org.junit.Assert.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.rh.achat.entities.Produit;
import tn.esprit.rh.achat.repositories.ProduitRepository;
import tn.esprit.rh.achat.services.IProduitService;
import tn.esprit.rh.achat.services.ProduitServiceImpl;
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProduitServicejunitTest {
	
	@MockBean
	private ProduitRepository prodrep;
	
	@Autowired
	 ProduitServiceImpl prodservImp;
	
	@Autowired
	IProduitService iprodser;
	
	
	@Test
	public void testDeleteProduit() throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date dateCreation = dateFormat.parse("16/06/2022");
	    Produit pr = new Produit(1L, "112", "libelle", (float)5.500, null, null, null, null, null);
		Produit produit =iprodser.addProduit(pr);
	    iprodser.deleteProduit(produit.getIdProduit());
		assertNull(iprodser.retrieveProduit(produit.getIdProduit()));
	}
	
	
}
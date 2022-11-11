package tn.esprit.rh.achat.servicet;
import static org.junit.Assert.assertTrue;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import tn.esprit.rh.achat.entities.Reglement;
import tn.esprit.rh.achat.services.IReglementService;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ReglementServicejuTest {
	@Autowired
	IReglementService regServ;
	
	@Test
		public void testAddReglement() throws ParseException {
			Reglement reg = new Reglement();
			reg.setDateReglement(new SimpleDateFormat( "yyyyMMdd" ).parse( "20221017" ));
	        reg.setFacture(null);
	        reg.setMontantPaye((float) 22.750);
	        reg.setMontantRestant((float) 0);
	        reg.setPayee(true);
			Reglement rg= regServ.addReglement(reg);
		 assertTrue(rg.equals(reg));
			regServ.retrieveReglement(reg.getIdReglement());
		} 
	    
	    @Test 
	    public void testGetArgByPayee() throws ParseException {
	    	Reglement reg = new Reglement();
	    	reg.setDateReglement(new SimpleDateFormat( "yyyyMMdd" ).parse( "20211223" ));
	        reg.setFacture(null);
	       
	        reg.setMontantPaye((float) 750.500);
	        reg.setMontantRestant((float) 530);
	        reg.setPayee(true);
	        assertTrue(reg.getPayee());
	    	
	    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ioannis Papakostas
 */
public class Mark_Claim {
    
    public Mark_Claim() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
        public void mark_claim_as_positive_or_negative_test(){
            
            Claim a = new Claim();
            a.setClaimDecision("positive");
            
            for(int i=0;i<2;i++){
            
            if (a.getClaimDecision().equals("positive")){
              assertTrue(a.CheckInsurance());
              assertTrue(a.CheckInsurance());
              assertTrue(a.CheckInsurance());
                          
            }
            else if (a.getClaimDecision().equals("negative"))
            {
            assertTrue((a.CheckInsurance()== false) || (a.CheckDmgHistory()== false) || (a.PhoneGarage())==false);
            }
            a.setClaimDecision("negative");
        
}
}
}

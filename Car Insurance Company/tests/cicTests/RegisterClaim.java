/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cicTests;

import cicSrc.Application;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author george
 */
public class RegisterClaim {
    
    public RegisterClaim() {
    }
    
    @BeforeClass
    public static void setUpClass() {
         Application.initialize();
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
     public void registerForm() {
         
        Application.claim2.claimStatus="Rejected";
        Application.employeeCD.registerClaim(Application.claim2);
        
        assertEquals(Application.claim2.claimStatus,"Registered"); 
     }
}

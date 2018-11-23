package fr.formation.partiel1.entities;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


/**
 * @author david Testing page for Rib
 *
 */
public class RibTest {
    
    @Test
    void shouldConstruct(){
	assertDoesNotThrow(() -> {
	    new Rib("3002","00500","1253765476A","30");
	});
    }
    
    @Test
    void shouldNotConstruct() {
	assertThrows(NullPointerException.class, () -> {
	    new Rib(null, null, null, null);
	});
    }
    
}

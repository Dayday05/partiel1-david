package fr.formation.partiel1.entities;

import fr.formation.partiel1.entities.*;
import java.util.*;
import java.util.ArrayList;

@SuppressWarnings("javadoc")
public class Account {
    
    private String isoCode;
    private String keyControl;
    private List<Rib> rib = new ArrayList<>();
    	
    public Account(String isoCode, String keyControl) {
	this.isoCode = isoCode;
	this.keyControl = keyControl;
    }

    public String getIsoCode() {
        return isoCode;
    }

    
    public String getKeyControl() {
        return keyControl;
    }
    
    public List<Rib> getRib() {
	return Collections.unmodifiableList(rib);
    }
    
    public boolean addRib (Rib ribInfo) {
	    if(ribInfo == null) {
		throw new NullPointerException();
	    }
	    return rib.add(ribInfo);
}	

    private void setIsoCode(String isoCode) {
	Objects.requireNonNull(isoCode);
        this.isoCode = isoCode;
    }


    
    private void setKeyControl(String keyControl) {
	Objects.requireNonNull(keyControl);
        this.keyControl = keyControl;
    }


    private void setRib(List<Rib> rib) {
        this.rib = rib;
    }
    
}

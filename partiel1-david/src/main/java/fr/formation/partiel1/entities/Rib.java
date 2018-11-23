package fr.formation.partiel1.entities;

import fr.formation.partiel1.entities.Account;
import java.util.*;

@SuppressWarnings("javadoc")

public class Rib {
    
    private String bankCode;
    private String bankCounter;
    private String accountNumber;
    private String ribKey;
    
    public Rib(String bankCode, String bankCounter, String accountNumber, String ribKey) {
	this.bankCode = bankCode;
	this.bankCounter = bankCounter;
	this.accountNumber = accountNumber;
	this.ribKey = ribKey;
    }

    
    
    private void setBankCode(String bankCode) {
	Objects.requireNonNull(bankCode);
        this.bankCode = bankCode;
    }


    
    private void setBankCounter(String bankCounter) {
	Objects.requireNonNull(bankCounter);
        this.bankCounter = bankCounter;
    }


    
    private void setAccountNumber(String accountNumber) {
	Objects.requireNonNull(accountNumber);
        this.accountNumber = accountNumber;
    }


    
    private void setRibKey(String ribKey) {
	Objects.requireNonNull(ribKey);
        this.ribKey = ribKey;
    }


    public String getBankCode() {
        return bankCode;
    }

    
    public String getBankCounter() {
        return bankCounter;
    }

    
    public String getAccountNumber() {
        return accountNumber;
    }

    
    public String getRibKey() {
        return ribKey;
    }
    
    
}

package fr.formation.partiel1.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import fr.formation.partiel1.entities.Account;
import fr.formation.partiel1.entities.Rib;
import fr.formation.partiel1.entities.Account;
import fr.formation.partiel1.entities.Account;
@SuppressWarnings("javadoc")

public class Transfer {
    
   
    private double somme;
    private Account transmitter;
    private Account receiver;
    private LocalDateTime currentTime;
    
    
    public Transfer(double somme, Account transmitter, Account receiver,
	    LocalDateTime currentTime) {
	this.somme = somme;
	this.transmitter = transmitter;
	this.receiver = receiver;
	this.currentTime = currentTime;
    }


    
    
    public double getSomme() {
        return somme;
    }



    
    public Account getTransmitter() {
        return transmitter;
    }



    
    public Account getReceiver() {
        return receiver;
    }



    
    public LocalDateTime getCurrentTime() {
        return currentTime;
    }



    private void setSomme(double somme) {
	if(somme <= 0) {
	    throw new IllegalArgumentException("A transfer must send some money...");
	}
        this.somme = somme;
    }


    
    private void setTransmitter(Account transmitter) {
        this.transmitter = transmitter;
    }


    
    private void setReceiver(Account receiver) {
        this.receiver = receiver;
    }


    
    private void setCurrentTime(LocalDateTime currentTime) {
        this.currentTime = currentTime;
    }
    
}

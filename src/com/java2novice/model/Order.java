package com.java2novice.model;

import java.util.Date;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.java2novice.util.JsonDateSerializer;

public class Order {
 
    @JsonProperty
    private String custmer;
     
    private String address;
     
    @JsonProperty("bill-amount")
    private String amount;
    

    @JsonFormat
    (shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss", locale = "es_CO")
    public Date getCurrentDate() {
        return new Date();
    }

    private Date creationDate;
     
    public String getCustmer() {
        return custmer;
    }
    public void setCustmer(String custmer) {
        this.custmer = custmer;
    }
     
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
     
    public String getAmount() {
        return amount;
    }
    public void setAmount(String amount) {
        this.amount = amount;
    }
    //@JsonSerialize(using=JsonDateSerializer.class)
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
     
}
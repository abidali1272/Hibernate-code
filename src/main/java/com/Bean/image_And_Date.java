package com.Bean;

import java.util.Arrays;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class image_And_Date {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Temporal(TemporalType.DATE)
	private Date date;
	
	@Lob
	private byte[] image;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] imageData) {
		this.image = imageData;
	}

	@Override
	public String toString() {
		return "image_And_Date [id=" + id + ", date=" + date + ", image=" + Arrays.toString(image) + "]";
	}

	public image_And_Date(int id, Date date, Byte[] image) {
		super();
		this.id = id;
		this.date = date;
	
	}

	public image_And_Date() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}

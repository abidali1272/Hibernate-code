package com.Bean;

import javax.persistence.Embeddable;

@Embeddable
public class Adress {
	private String roadname;
	
	private String roomno;

	public String getRoadname() {
		return roadname;
	}

	public void setRoadname(String roadname) {
		this.roadname = roadname;
	}

	public String getRoomno() {
		return roomno;
	}

	public void setRoomno(String roomno) {
		this.roomno = roomno;
	}

	@Override
	public String toString() {
		return "Adress [roadname=" + roadname + ", roomno=" + roomno + "]";
	}

	public Adress(String roadname, String roomno) {
		super();
		this.roadname = roadname;
		this.roomno = roomno;
	}

	public Adress() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}

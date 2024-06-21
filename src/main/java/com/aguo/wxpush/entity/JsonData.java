package com.aguo.wxpush.entity;



public class JsonData {

	private String date;
	private String tem_day;
	private String wea;
	private String wea_img;
	private String tem_night;
	private String win_speed;
	private String win;


	public JsonData() {
	}

	public JsonData(String date, String tem_day, String wea, String wea_img, String tem_night, String win_speed, String win) {
		this.date = date;
		this.tem_day = tem_day;
		this.wea = wea;
		this.wea_img = wea_img;
		this.tem_night = tem_night;
		this.win_speed = win_speed;
		this.win = win;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTem_day() {
		return tem_day;
	}

	public void setTem_day(String tem_day) {
		this.tem_day = tem_day;
	}

	public String getWea() {
		return wea;
	}

	public void setWea(String wea) {
		this.wea = wea;
	}

	public String getWea_img() {
		return wea_img;
	}

	public void setWea_img(String wea_img) {
		this.wea_img = wea_img;
	}

	public String getTem_night() {
		return tem_night;
	}

	public void setTem_night(String tem_night) {
		this.tem_night = tem_night;
	}

	public String getWin_speed() {
		return win_speed;
	}

	public void setWin_speed(String win_speed) {
		this.win_speed = win_speed;
	}

	public String getWin() {
		return win;
	}

	public void setWin(String win) {
		this.win = win;
	}
}

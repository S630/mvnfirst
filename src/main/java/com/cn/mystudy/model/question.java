package com.cn.mystudy.model;

import java.sql.Date;

public class question {
	private String ID;
	private int SERIALNUM;
	private String TYPE;
	private String TITLE;
	private String TARGET;
	private Date CREATETIME;
	private String STATUS;
	private String SOLUTION;
	private Date SOLVETIME;
	private String REMARK;
	private String REMARK1;
	private String REMARK2;
	private String REMARK3;
	private Date UPDATETIME;
	private Date STAMP;
	
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public int getSERIALNUM() {
		return SERIALNUM;
	}
	public void setSERIALNUM(int sERIALNUM) {
		SERIALNUM = sERIALNUM;
	}
	public String getTYPE() {
		return TYPE;
	}
	public void setTYPE(String tYPE) {
		TYPE = tYPE;
	}
	public String getTITLE() {
		return TITLE;
	}
	public void setTITLE(String tITLE) {
		TITLE = tITLE;
	}
	public String getTARGET() {
		return TARGET;
	}
	public void setTARGET(String tARGET) {
		TARGET = tARGET;
	}
	public Date getCREATETIME() {
		return CREATETIME;
	}
	public void setCREATETIME(Date cREATETIME) {
		CREATETIME = cREATETIME;
	}
	public String getSTATUS() {
		return STATUS;
	}
	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
	}
	public String getSOLUTION() {
		return SOLUTION;
	}
	public void setSOLUTION(String sOLUTION) {
		SOLUTION = sOLUTION;
	}
	public Date getSOLVETIME() {
		return SOLVETIME;
	}
	public void setSOLVETIME(Date sOLVETIME) {
		SOLVETIME = sOLVETIME;
	}
	public String getREMARK() {
		return REMARK;
	}
	public void setREMARK(String rEMARK) {
		REMARK = rEMARK;
	}
	public String getREMARK1() {
		return REMARK1;
	}
	public void setREMARK1(String rEMARK1) {
		REMARK1 = rEMARK1;
	}
	public String getREMARK2() {
		return REMARK2;
	}
	public void setREMARK2(String rEMARK2) {
		REMARK2 = rEMARK2;
	}
	public String getREMARK3() {
		return REMARK3;
	}
	public void setREMARK3(String rEMARK3) {
		REMARK3 = rEMARK3;
	}
	public Date getUPDATETIME() {
		return UPDATETIME;
	}
	public void setUPDATETIME(Date uPDATETIME) {
		UPDATETIME = uPDATETIME;
	}
	public Date getSTAMP() {
		return STAMP;
	}
	public void setSTAMP(Date sTAMP) {
		STAMP = sTAMP;
	}
}

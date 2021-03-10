package com.shetty.Codec.Codec;

public class CipherResponseBean {

	private String PlainText;
	private String KeyText;
	private String CipherText;
	
	public CipherResponseBean(String plainText, String keyText,String cipherText) {
		super();
		PlainText = plainText;
		KeyText = keyText;
		CipherText=cipherText;
	}

	
	
	

	
	public String getPlainText() {
		return PlainText;
	}
	
	public void setPlainText(String plainText) {
		PlainText = plainText;
	}
	
	public String getKeyText() {
		return KeyText;
	}
	
	public void setKeyText(String keyText) {
		KeyText = keyText;
	}
	
	public String getCipherText() {
		return CipherText;
	}
	
	public void setCipherText(String cipherText) {
		CipherText = cipherText;
	}
	
	@Override
	public String toString() {
		return "CipherResponseBean [PlainText=" + PlainText + ", KeyText=" + KeyText + ", CipherText=" + CipherText
				+ "]";
	}
	
}

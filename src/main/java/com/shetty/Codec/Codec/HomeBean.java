package com.shetty.Codec.Codec;

public class HomeBean {

	public HomeBean() {
		super();
	}
	
	
	
	String caesar_Encoding="https://shetty-codec.herokuapp.com/caesar/PT={plainText}/Keyno={key}";
	String Playfair_Encoding="https://shetty-codec.herokuapp.com/playfair/PT={plainText}/Key={key}";
	String Vigenere_Encoding="https://shetty-codec.herokuapp.com/vigenere/PT={plainText}/Key={key}";
	String Vigenere_Decoding="https://shetty-codec.herokuapp.com/vigenere/ET={plainText}/Key={key}";
	@Override
	public String toString() {
		return "HomeBean [ caesar_Encoding=" +caesar_Encoding + ", Playfair_Encoding="
				+ Playfair_Encoding + ", Vigenere_Encoding=" + Vigenere_Encoding + ", Vigenere_Decoding="
				+ Vigenere_Decoding + "]";
	}
	
	public String getCaesar_Encoding() {
		return caesar_Encoding;
	}
	public void setCaesar_Encoding(String caesar_Encoding) {
		this.caesar_Encoding = caesar_Encoding;
	}
	public String getPlayfair_Encoding() {
		return Playfair_Encoding;
	}
	public void setPlayfair_Encoding(String playfair_Encoding) {
		Playfair_Encoding = playfair_Encoding;
	}
	public String getVigenere_Encoding() {
		return Vigenere_Encoding;
	}
	public void setVigenere_Encoding(String vigenere_Encoding) {
		Vigenere_Encoding = vigenere_Encoding;
	}
	public String getVigenere_Decoding() {
		return Vigenere_Decoding;
	}
	public void setVigenere_Decoding(String vigenere_Decoding) {
		Vigenere_Decoding = vigenere_Decoding;
	}

	
	
	
}

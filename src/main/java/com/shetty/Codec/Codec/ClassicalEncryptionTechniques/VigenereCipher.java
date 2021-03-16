package com.shetty.Codec.Codec.ClassicalEncryptionTechniques;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.shetty.Codec.Codec.CipherResponseBean;

@RestController
public class VigenereCipher {
	
	@GetMapping(path="/vigenere/PT={plainText}/Kno={key}")
	public CipherResponseBean EncodeUsingCaesar(@PathVariable String plainText, @PathVariable String key) {

		
		        String CipherText = "";
		        plainText = plainText.toLowerCase();
		        for (int i = 0, j = 0; i < plainText.length(); i++)
		        {
		            char c = plainText.charAt(i);
		            if (c < 'a' || c > 'z')
		                continue;
		            CipherText += (char) ((c + key.charAt(j) - 2 * 'a') % 26 + 'a');
		            j = ++j % key.length();
		        }
		        return new CipherResponseBean(plainText, key, CipherText);
		
		
	}
	
	@GetMapping(path="/vigenere/ET={EncryptedText}/Kno={key}")
	public CipherResponseBean DecodeUsingCaesar(@PathVariable String EncryptedText, @PathVariable String key) {

	
		        String PlainText = "";
		        EncryptedText = EncryptedText.toLowerCase();
		        for (int i = 0, j = 0; i < EncryptedText.length(); i++)
		        {
		            char c = EncryptedText.charAt(i);
		            if (c < 'a' || c > 'z')
		                continue;
		            PlainText += (char) ((c - key.charAt(j) + 26) % 26 + 'a');
		            j = ++j % key.length();
		        }
		        return new CipherResponseBean(PlainText, key, EncryptedText);
		
	}

}

package com.shetty.Codec.Codec.ClassicalEncryptionTechniques;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shetty.Codec.Codec.CipherResponseBean;

import org.springframework.web.bind.annotation.PathVariable;
@RestController
public class CaesarCipher{
	
	@GetMapping(path="/caesar/PT={plainText}/Keyno={key}")
	public CipherResponseBean EncodeUsingCaesar(@PathVariable String plainText, @PathVariable Integer key) {

	
		StringBuffer cipherText= new StringBuffer(); 
		  
        for (int i=0; i<plainText.length(); i++) 
        { 
            if (Character.isUpperCase(plainText.charAt(i))) 
            { 
                char ch = (char)(((int)plainText.charAt(i) + 
                                  key - 65) % 26 + 65); 
                cipherText.append(ch); 
            } 
            else
            { 
                char ch = (char)(((int)plainText.charAt(i) + 
                                  key - 97) % 26 + 97); 
                cipherText.append(ch); 
            } 
        } 

		return new CipherResponseBean(plainText,key.toString(),cipherText.toString());
	}
}
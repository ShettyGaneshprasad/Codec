package com.shetty.Codec.Codec;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Home {

	
	@GetMapping(path="/")
	public HomeBean Home() {
		
		return new HomeBean();
	}

}





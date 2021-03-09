package com.shetty.Codec.Codec;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
@RestController
public class Hello{
	
	@GetMapping(path="/Hello-{name}")
	public String helloWorld(@PathVariable String name) {
		return "hello  "+name;
	}
}
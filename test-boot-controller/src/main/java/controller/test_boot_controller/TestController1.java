package controller.test_boot_controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController1 {

	@RequestMapping(value="hello1")
	@ResponseBody
	public String hello(String name){
		
		return "hello"+name;
	}
}

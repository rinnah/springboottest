package controller.test_boot_controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
   
	@RequestMapping(value="hello")
	@ResponseBody
	public String hello(){
		return "hello world";
	}
	
}

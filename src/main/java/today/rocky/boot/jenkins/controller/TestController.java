package today.rocky.boot.jenkins.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import today.rocky.boot.jenkins.service.TestService;

/**
 * @author Rocky
 * @version 1.0
 * @date 2020/5/13 13:15
 */
@RestController
public class TestController {
	@Autowired
	private TestService testService;


	@GetMapping("/hello")
	public String hello(){
		return "ok";
	}

	@GetMapping("/h")
	public String hi(){
		return "are you ok";
	}
}

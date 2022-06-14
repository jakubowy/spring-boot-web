package com.example.demo;
import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSubpage {
    
	@GetMapping("/subpage")
	public String index() {
        Random rnd = new Random();
        Integer sleepTime = rnd.nextInt(1000);
        try 
            {
                Thread.sleep(sleepTime);
            } 
            catch(InterruptedException e)
            {
                return "Subpage Works with expcetion!";
            }
        
        //Thread.sleep(random.nextInt(1000));
		return "Subpage Works! delay was:" + sleepTime.toString();
	}

}

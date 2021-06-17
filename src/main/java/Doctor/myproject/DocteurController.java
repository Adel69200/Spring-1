package Doctor.myproject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DocteurController {
	
	

	
	@GetMapping("/doctor1")
    @ResponseBody
    public String name1() {
        return "William Hartnell";
    }
	
	
	
	
	@GetMapping("/doctor10")
    @ResponseBody
    public String name2() {
        return "David Tennant";
    }
	
	
	@GetMapping("/doctor13")
    @ResponseBody
    public String name3() {
        return "Jodie Whittaker";
    }
}





	
    


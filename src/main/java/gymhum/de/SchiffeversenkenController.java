package gymhum.de;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import gymhum.de.model.Feld;
@Controller
public class SchiffeversenkenController {
   
@GetMapping("/schiffeversenken")
public String showSpiel(@RequestParam(name="activepage", required = false, defaultValue = "schiffeversenken")String activePage, Model model ){
    model.addAttribute("activePage", "schiffeversenken");
    return "index.html";
}
{
    
    
  
}





}




package td.controller.json;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import td.service.TravelService;
import td.vo.Travel;

@Controller("traveller")
@RequestMapping("/json/travel")
public class TravelController {
  @Autowired TravelService travelService;
  @Autowired ServletContext servletContext;

  
  @RequestMapping("/delete")
  public Object delete(int no) {
    int count = travelService.delete(no);

    Map<String,Object> result = 
        new HashMap<String,Object>();
    if (count > 0) {
      result.put("data", "success");
    } else {
      result.put("data", "failure");
    }
    
    return result;
  }
  
  @RequestMapping("/detail")
  public Object detail(int no) {
    Map<String,Object> result = 
        new HashMap<String,Object>();
    result.put("data", travelService.get(no));
    
    return result;
  }

  @RequestMapping("/insert")
  public Object insert( String attachFile01) throws Exception {
    
     System.out.println(attachFile01);
      Travel travel = new Travel();
      travel.setAttachFile01(attachFile01);
      
      int count = travelService.insert(travel);
      
      Map<String,Object> result = 
          new HashMap<String,Object>();
      if (count > 0) {
        result.put("data", "success");
      } else {
        result.put("data", "failure");
      }
      
      return result;
  }
  
  @RequestMapping("/list")
  public Object list() {
    Map<String,Object> result = 
        new HashMap<String,Object>();
    
    result.put("data", 
        travelService.list());
    
    return result;
  }
  
  @RequestMapping("/update")
  public Object boardUpdate (Travel travel) throws Exception {
    
    int count = travelService.update(travel);

    Map<String,Object> result = 
        new HashMap<String,Object>();
    if (count > 0) {
      result.put("data", "success");
    } else {
      result.put("data", "failure");
    }
    
    return result;
  }
  
}

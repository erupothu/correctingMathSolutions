package CorrectingMathSolutions.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import CorrectingMathSolutions.model.MathModel;
import CorrectingMathSolutions.service.MathJavaService;
import CorrectingMathSolutions.service.MathService;

@RestController
public class MathRestController {
	@Autowired
	private MathService mathService;
	
	@Autowired
	private MathJavaService mathJavaService;
	
	//Rules
	@GetMapping("/hello")
	public String hello(){
		return "Hello Harish Good morning!!!";
	}
	
	@GetMapping("/my-sample-project")
	public String myProject(@RequestParam String query){
		String response = "";
		response = mathJavaService.getResponse(query);
		return response;
	}
	
	
	// Rule Table crud Operations
	@GetMapping("/all-math-problems")
	public String allTast(){
		ObjectMapper mapper = new ObjectMapper();
		String response="";
		try {
			response = mapper.writeValueAsString(mathService.findAllRules());
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return response;
	}
	
	@GetMapping("/save-math-problem")
	public String saveRule(@RequestParam String problemText, @RequestParam String source, @RequestParam String equationsText, @RequestParam String ansText){
		MathModel ruletable = new MathModel(problemText, source, equationsText, ansText);
		mathService.saveRules(ruletable);
		return "rule Saved";
	}
	
	@GetMapping("/delete-math-problem")
	public String deleteRule(@RequestParam int id){
		mathService.deleteRule(id);
		return "rule deleted";
		
	}
	@GetMapping("/find-math-problem")
	public String findRule(@RequestParam int id){
		
		return mathService.findRule(id).toString();
	}
}

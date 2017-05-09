package CorrectingMathSolutions.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import CorrectingMathSolutions.dao.MathRepository;
import CorrectingMathSolutions.model.MathModel;

@Service
@Transactional
public class MathService{
	
	private final MathRepository mathRepository;

	public MathService(MathRepository ruleRepository) {
		this.mathRepository = ruleRepository;
	}

	public List<MathModel> findAllRules(){
		List<MathModel> rules = new ArrayList<>();
		for(MathModel rule : mathRepository.findAll()){
			rules.add(rule);
		}
		return rules;
	}
	
	public void saveRules(MathModel task){
		mathRepository.save(task);
	}
	
	public MathModel findRule(int id){
		return mathRepository.findOne(id);
	}
	
	public void deleteRule(int id){
		mathRepository.delete(id);
	}
	
	
}

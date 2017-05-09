package CorrectingMathSolutions.dao;

import org.springframework.data.repository.CrudRepository;

import CorrectingMathSolutions.model.MathModel;

public interface MathRepository extends CrudRepository<MathModel, Integer>{

}

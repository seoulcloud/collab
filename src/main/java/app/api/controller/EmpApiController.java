package app.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import app.entity.Emp;
import app.repository.EmpRepository;

@RestController
@RequestMapping("/emp")
public class EmpApiController {

	@GetMapping("/api/emp-test")
	public String empTest() {
		return "emp api controller" ;
	}
	
	@GetMapping("/api/emps")
	public List<Emp> getEmps() {
		return empRepository.findAll();
	}

    	@Autowired
    	private EmpRepository empRepository;
	    @PostMapping
	    public Emp createEmp(@RequestBody Emp emp) {
	        return empRepository.save(emp);
	    }
	
}

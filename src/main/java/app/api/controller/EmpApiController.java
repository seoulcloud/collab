package app.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	    
	    // 특정 사원 조회 - 원서희
	    @GetMapping("/{empno}")
	    public ResponseEntity<Emp> getEmpinfo(@PathVariable("empno") Integer empno) {
	        return empRepository.findById(empno)
	                .map(ResponseEntity::ok)
	                .orElse(ResponseEntity.notFound().build());
	    }
	    
	    @DeleteMapping("/{id}")
	    public void deleteEmp(@PathVariable Long id) {
	        empRepository.deleteById(id);
	    }
}

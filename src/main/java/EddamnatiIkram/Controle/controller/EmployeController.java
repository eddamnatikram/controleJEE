package EddamnatiIkram.Controle.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import EddamnatiIkram.Controle.entities.Employe;
import EddamnatiIkram.Controle.service.EmployeService;

@RestController
@RequestMapping("/api/v1/employee")
public class EmployeController {
	@Autowired
	private EmployeService employeeService;
	@GetMapping
    public List<Employe> findAllEmployee() {
        return employeeService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> findById(@PathVariable Long id) {
        Employe employee = employeeService.findById(id);
        if (employee == null) {
            return new ResponseEntity<Object>("Employee avec Id " + id + " nexiste pas", HttpStatus.BAD_REQUEST);

        } else {
            return ResponseEntity.ok(employee);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deletEmployee(@PathVariable Long id) {
        Employe employee = employeeService.findById(id);
        if (employee == null) {
            return new ResponseEntity<Object>("Employee avec Id " + id + " nexiste pas", HttpStatus.BAD_REQUEST);
        } else {
            employeeService.delete(employee);
            return ResponseEntity.ok("professeur avec id " + id + " suprime");
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> updateEmployee(@PathVariable Long id, @RequestBody Employe newEmployee) {

        Employe oldemployee = employeeService.findById(id);
        if (oldemployee == null) {
            return new ResponseEntity<Object>("employee avec id" + id + "nexiste pas ", HttpStatus.BAD_REQUEST);

        } else {
            newEmployee.setId(id);
            return ResponseEntity.ok(employeeService.update(newEmployee));
        }
    }

    @PostMapping
    public Employe creatEmploye(@RequestBody Employe employee) {
        employee.setId(0L);
        return employeeService.create(employee);
    }

   
    
   

}

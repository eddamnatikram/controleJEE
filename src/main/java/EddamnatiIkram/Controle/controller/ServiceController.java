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
import EddamnatiIkram.Controle.entities.Service;
import EddamnatiIkram.Controle.service.EmployeService;
import EddamnatiIkram.Controle.service.ServiceService;

@RestController
@RequestMapping("/api/v1/service")
public class ServiceController {
	@Autowired
	private ServiceService serviceService ;
	@GetMapping
    public List<Service> findAllService() {
        return serviceService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> findById(@PathVariable Long id) {
        Service service = serviceService.findById(id);
        if (service == null) {
            return new ResponseEntity<Object>("Service avec Id " + id + " nexiste pas", HttpStatus.BAD_REQUEST);

        } else {
            return ResponseEntity.ok(service);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deletService(@PathVariable Long id) {
        Service service = serviceService.findById(id);
        if (service == null) {
            return new ResponseEntity<Object>("Employee avec Id " + id + " nexiste pas", HttpStatus.BAD_REQUEST);
        } else {
            serviceService.delete(service);
            return ResponseEntity.ok("professeur avec id " + id + " suprime");
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> updateService(@PathVariable Long id, @RequestBody Service newEmployee) {

        Service oldservice =serviceService .findById(id);
        if (oldservice == null) {
            return new ResponseEntity<Object>("employee avec id" + id + "nexiste pas ", HttpStatus.BAD_REQUEST);

        } else {
            newEmployee.setId(id);
            return ResponseEntity.ok(serviceService.update(newEmployee));
        }
    }

    @PostMapping
    public Service creatService(@RequestBody Service service) {
        service.setId(0L);
        return serviceService.create(service);
    }

   
    
   

}

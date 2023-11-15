package EddamnatiIkram.Controle.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import EddamnatiIkram.Controle.dao.IDao;
import EddamnatiIkram.Controle.entities.Employe;
import EddamnatiIkram.Controle.repository.EmployeeRepository;
@Service
public class EmployeService implements IDao<Employe> {
@Autowired
private EmployeeRepository employeRepository;
	@Override
	public Employe create(Employe o) {
		// TODO Auto-generated method stub
		return employeRepository.save(o);
	}

	@Override
	public boolean delete(Employe o) {
		employeRepository.delete(o);
		return true;
	}

	@Override
	public Employe update(Employe o) {
		// TODO Auto-generated method stub
		return employeRepository.save(o);
	}

	@Override
	public List<Employe> findAll() {
		// TODO Auto-generated method stub
		return employeRepository.findAll();
	}

	@Override
	public Employe findById(Long id) {
		// TODO Auto-generated method stub
		return employeRepository.getById(id);
	}

}

package EddamnatiIkram.Controle.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import EddamnatiIkram.Controle.dao.IDao;
import EddamnatiIkram.Controle.repository.ServiceRepository;

@Service 
public class ServiceService  implements IDao<EddamnatiIkram.Controle.entities.Service>{
@Autowired
private ServiceRepository serviceRepository;

@Override
public EddamnatiIkram.Controle.entities.Service create(EddamnatiIkram.Controle.entities.Service o) {
	// TODO Auto-generated method stub
	return serviceRepository.save(o);
}

@Override
public boolean delete(EddamnatiIkram.Controle.entities.Service o) {
serviceRepository.delete(o);
	return true;
}

@Override
public EddamnatiIkram.Controle.entities.Service update(EddamnatiIkram.Controle.entities.Service o) {
	// TODO Auto-generated method stub
	return serviceRepository.save(o);
}

@Override
public List<EddamnatiIkram.Controle.entities.Service> findAll() {
	// TODO Auto-generated method stub
	return serviceRepository.findAll();
}

@Override
public EddamnatiIkram.Controle.entities.Service findById(Long id) {
	// TODO Auto-generated method stub
	return serviceRepository.getById(id);
}
	

}

package EddamnatiIkram.Controle.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import EddamnatiIkram.Controle.entities.Service;

@Repository
public interface ServiceRepository extends JpaRepository<Service,Long> {

}

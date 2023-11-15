package EddamnatiIkram.Controle.repository;

import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import EddamnatiIkram.Controle.entities.Employe;

@Repository
public interface EmployeeRepository extends  JpaRepository<Employe, Long>{

}

package one.dio.gof.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioEndereco extends CrudRepository<Endereco, String>{

}

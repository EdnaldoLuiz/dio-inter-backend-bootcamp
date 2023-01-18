package one.dio.gof.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioCliente extends CrudRepository<Cliente, Long> {

}
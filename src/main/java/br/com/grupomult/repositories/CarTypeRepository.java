package br.com.grupomult.repositories;

import br.com.grupomult.entities.car.CarId;
import br.com.grupomult.entities.car.CarType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by leandro on 25/12/18.
 */
@Repository
public interface CarTypeRepository extends CrudRepository<CarType, Long> {

}

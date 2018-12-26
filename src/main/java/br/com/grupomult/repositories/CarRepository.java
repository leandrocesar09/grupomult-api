package br.com.grupomult.repositories;

import br.com.grupomult.entities.car.Car;
import br.com.grupomult.entities.car.CarId;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by leandro on 25/12/18.
 */
@Repository
public interface CarRepository extends CrudRepository<Car, CarId> {

}

package br.com.grupomult.flows.car;

import br.com.grupomult.entities.car.CarId;
import br.com.grupomult.entities.car.CarType;
import br.com.grupomult.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

/**
 * Created by leandro on 25/12/18.
 */
public class RemoveCarLoad {

    @Autowired
    private CarRepository repository;

    public ResponseEntity<Void> execute(Long id, Long type) {

        CarId carId = new CarId(id, new CarType(type));

        repository.delete(carId);

        return ResponseEntity.ok().build();
    }

}

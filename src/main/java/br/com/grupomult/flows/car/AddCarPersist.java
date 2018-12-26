package br.com.grupomult.flows.car;

import br.com.grupomult.api.car.models.ResponseGetCarsById;
import br.com.grupomult.entities.car.Car;
import br.com.grupomult.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

/**
 * Created by leandro on 25/12/18.
 */
public class AddCarPersist {


    @Autowired
    private AddCarResponse response;

    @Autowired
    private CarRepository repository;

    public ResponseEntity<ResponseGetCarsById> execute(Car car) {
        return response.execute(repository.save(car));
    }

}

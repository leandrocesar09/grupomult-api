package br.com.grupomult.flows.car;

import br.com.grupomult.api.car.models.ResponseGetCarsById;
import br.com.grupomult.entities.car.Car;
import br.com.grupomult.exceptions.HttpNotFoundException;
import br.com.grupomult.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import static br.com.grupomult.constants.MessageConstants.ERROR_GET_CARS_BY_ID_NOT_FOUND;

/**
 * Created by leandro on 25/12/18.
 */
public class UpdateCarPersist {

    @Autowired
    private UpdateCarResponse response;

    @Autowired
    private CarRepository repository;

    public ResponseEntity<ResponseGetCarsById> execute(Car car) {
        if(repository.exists(car.getCarId())){
            return response.execute(repository.save(car));
        }

        throw new HttpNotFoundException(ERROR_GET_CARS_BY_ID_NOT_FOUND);

    }

}

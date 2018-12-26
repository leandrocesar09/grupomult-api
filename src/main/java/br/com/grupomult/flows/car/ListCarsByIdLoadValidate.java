package br.com.grupomult.flows.car;

import br.com.grupomult.api.car.models.ResponseGetCarsById;
import br.com.grupomult.entities.car.Car;
import br.com.grupomult.exceptions.HttpNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

import static br.com.grupomult.constants.MessageConstants.ERROR_GET_CARS_BY_ID_NOT_FOUND;

/**
 * Created by leandro on 25/12/18.
 */
public class ListCarsByIdLoadValidate {

    @Autowired
    private ListCarsByIdConverter converter;

    public ResponseEntity<ResponseGetCarsById> execute(Car car) {
        if (Optional.ofNullable(car).isPresent()) {
            return converter.execute(car);
        } else {
            throw new HttpNotFoundException(ERROR_GET_CARS_BY_ID_NOT_FOUND);
        }
    }
}

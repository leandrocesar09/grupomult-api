package br.com.grupomult.flows.car;

import br.com.grupomult.api.car.models.Car;
import br.com.grupomult.api.car.models.ResponseGetCarsById;
import br.com.grupomult.exceptions.HttpBadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

import static br.com.grupomult.constants.MessageConstants.*;
import static br.com.grupomult.constants.MessageConstants.ERROR_ADD_CAR_INVALID_VALUE;

/**
 * Created by leandro on 25/12/18.
 */
public class UpdateCarValidate {

    @Autowired
    private UpdateCarConverter converter;

    public ResponseEntity<ResponseGetCarsById> execute(Car car) {
        if (!Optional.ofNullable(car.getId()).isPresent() || car.getId() < 0) {
            throw new HttpBadRequestException(ERROR_ADD_CAR_INVALID_ID);
        }
        if (!Optional.ofNullable(car.getType()).isPresent()) {
            throw new HttpBadRequestException(ERROR_ADD_CAR_INVALID_TYPE);
        }
        if (!Optional.ofNullable(car.getCode()).isPresent()) {
            throw new HttpBadRequestException(ERROR_ADD_CAR_INVALID_CODE);
        }
        if (!Optional.ofNullable(car.getValue()).isPresent()) {
            throw new HttpBadRequestException(ERROR_ADD_CAR_INVALID_VALUE);
        }

        return converter.execute(car);
    }

}

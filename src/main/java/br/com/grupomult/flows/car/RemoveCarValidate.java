package br.com.grupomult.flows.car;

import br.com.grupomult.api.car.models.ResponseGetCarsById;
import br.com.grupomult.exceptions.HttpBadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

import static br.com.grupomult.constants.MessageConstants.ERROR_GET_CARS_BY_ID_INVALID_ID;
import static br.com.grupomult.constants.MessageConstants.ERROR_GET_CARS_BY_ID_INVALID_TYPE;

/**
 * Created by leandro on 25/12/18.
 */
public class RemoveCarValidate {

    @Autowired
    private RemoveCarLoad load;

    public ResponseEntity<Void> execute(Long id, Long type) {
        if (!Optional.ofNullable(id).isPresent() || id < 0) {
            throw new HttpBadRequestException(ERROR_GET_CARS_BY_ID_INVALID_ID);
        }
        if (!Optional.ofNullable(type).isPresent() || type < 0) {
            throw new HttpBadRequestException(ERROR_GET_CARS_BY_ID_INVALID_TYPE);
        }

        return load.execute(id, type);
    }

}

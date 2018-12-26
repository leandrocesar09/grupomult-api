package br.com.grupomult.flows.car;

import br.com.grupomult.api.car.models.Car;
import br.com.grupomult.api.car.models.ResponseGetCarsById;
import br.com.grupomult.converter.car.CarConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

/**
 * Created by leandro on 25/12/18.
 */
public class AddCarConverter extends CarConverter {

    @Autowired
    private AddCarPersist persist;

    public ResponseEntity<ResponseGetCarsById> execute(Car car) {
        return persist.execute(convert(car));
    }

}

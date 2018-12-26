package br.com.grupomult.flows.car;

import br.com.grupomult.api.animal.models.ResponseGetAnimalsById;
import br.com.grupomult.api.car.models.ResponseGetCarsById;
import br.com.grupomult.converter.car.CarConverter;
import br.com.grupomult.entities.Animal;
import br.com.grupomult.entities.car.Car;
import br.com.grupomult.flows.animal.ListAnimalsByIdResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

/**
 * Created by leandro on 25/12/18.
 */
public class ListCarsByIdConverter extends CarConverter {


    @Autowired
    private ListCarsByIdResponse response;

    public ResponseEntity<ResponseGetCarsById> execute(Car car) {
        return response.execute(convert(car));
    }

}

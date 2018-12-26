package br.com.grupomult.flows.car;

import br.com.grupomult.api.car.models.Car;
import br.com.grupomult.api.car.models.ResponseGetCars;
import org.springframework.http.ResponseEntity;

import java.util.List;

/**
 * Created by leandro on 25/12/18.
 */
public class ListCarsResponse {

    public ResponseEntity<ResponseGetCars> execute(List<Car> carsApi) {
        if (carsApi.isEmpty()) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(new ResponseGetCars().cars(carsApi));
        }
    }

}

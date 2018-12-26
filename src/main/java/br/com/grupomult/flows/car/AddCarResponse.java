package br.com.grupomult.flows.car;

import br.com.grupomult.api.car.models.ResponseGetCarsById;
import br.com.grupomult.converter.car.CarConverter;
import br.com.grupomult.entities.car.Car;
import org.springframework.http.ResponseEntity;

/**
 * Created by leandro on 25/12/18.
 */
public class AddCarResponse {

   public ResponseEntity<ResponseGetCarsById> execute(Car car) {
        return ResponseEntity.status(201).body(new ResponseGetCarsById().car(CarConverter.convert(car)));
   }
}

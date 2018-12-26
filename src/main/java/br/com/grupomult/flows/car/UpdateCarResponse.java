package br.com.grupomult.flows.car;

import br.com.grupomult.api.car.models.ResponseGetCarsById;
import br.com.grupomult.converter.car.CarConverter;
import br.com.grupomult.entities.car.Car;
import org.springframework.http.ResponseEntity;

/**
 * Created by leandro on 25/12/18.
 */
public class UpdateCarResponse {

   public ResponseEntity<ResponseGetCarsById> execute(Car car) {
        return ResponseEntity.ok(new ResponseGetCarsById().car(CarConverter.convert(car)));
   }
}

package br.com.grupomult.flows.car;


import br.com.grupomult.api.car.models.Car;
import br.com.grupomult.api.car.models.ResponseGetCarsById;
import org.springframework.http.ResponseEntity;

/**
 * Created by leandro on 25/12/18.
 */
public class ListCarsByIdResponse {

   public ResponseEntity<ResponseGetCarsById> execute(Car car) {
        return ResponseEntity.ok(new ResponseGetCarsById().car(car));
   }
}

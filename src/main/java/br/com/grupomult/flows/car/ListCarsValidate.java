package br.com.grupomult.flows.car;

import br.com.grupomult.api.animal.models.ResponseGetAnimals;
import br.com.grupomult.api.car.models.ResponseGetCars;
import br.com.grupomult.flows.animal.ListAnimalsLoad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

/**
 * Created by leandro on 25/12/18.
 */
public class ListCarsValidate {

    @Autowired
    private ListCarsLoad load;

    public ResponseEntity<ResponseGetCars> execute() {
        return load.execute();
    }

}

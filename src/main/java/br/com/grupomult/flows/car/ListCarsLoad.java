package br.com.grupomult.flows.car;

import br.com.grupomult.api.car.models.ResponseGetCars;
import br.com.grupomult.entities.car.Car;
import br.com.grupomult.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import java.util.List;

/**
 * Created by leandro on 25/12/18.
 */
public class ListCarsLoad {

    @Autowired
    private CarRepository repository;

    @Autowired
    private ListCarsConverter converter;

    public ResponseEntity<ResponseGetCars> execute() {
        return converter.execute((List<Car>) repository.findAll());
    }

}

package br.com.grupomult.flows.car;

import br.com.grupomult.api.car.models.ResponseGetCars;
import br.com.grupomult.converter.car.CarConverter;
import br.com.grupomult.entities.car.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static br.com.grupomult.utils.OptionalUtils.ofNullableAndEmpty;

/**
 * Created by leandro on 25/12/18.
 */
public class ListCarsConverter extends CarConverter {

    @Autowired
    private ListCarsResponse response;

    public ResponseEntity<ResponseGetCars> execute(List<Car> cars) {

        List<br.com.grupomult.api.car.models.Car> carsApi = ofNullableAndEmpty(cars).orElse(Collections.emptyList()).stream()
            .map(ListCarsConverter::convert).collect(Collectors.toList());

        return response.execute(carsApi);

    }

}

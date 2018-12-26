package br.com.grupomult.api.car.controllers;

import br.com.grupomult.api.car.models.Car;
import br.com.grupomult.api.car.models.ResponseGetCars;
import br.com.grupomult.api.car.models.ResponseGetCarsById;
import br.com.grupomult.flows.car.*;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

import static br.com.grupomult.constants.ApiConstants.*;
import static br.com.grupomult.constants.MessageConstants.ADD_CARS_VALUE;
import static br.com.grupomult.constants.MessageConstants.UPDATE_CARS_VALUE;

/**
 * Created by leandro on 24/12/18.
 */
@RestController
public class CarsApiController implements CarsApi {

    @Autowired
    private ListCarsValidate listCarsFlow;

    @Autowired
    private ListCarsByIdValidate listCarsByIdFlow;

    @Autowired
    private AddCarValidate addCarFlow;

    @Autowired
    private UpdateCarValidate updateCarFlow;

    @Autowired
    private RemoveCarValidate removeCarFlow;

    @Override
    public ResponseEntity<ResponseGetCars> getCars() {
        return listCarsFlow.execute();
    }

    @Override
    public ResponseEntity<ResponseGetCarsById> getCarById(
        @PathVariable(value = GET_LIST_CARS_BY_ID_PATH_ID, required = true) Long id,
        @PathVariable(value = GET_LIST_CARS_BY_ID_PATH_TYPE, required = true) Long type) {
        return listCarsByIdFlow.execute(id, type);
    }

    @Override
    public ResponseEntity<ResponseGetCarsById> addCar(@ApiParam(value = ADD_CARS_VALUE) @Valid @RequestBody Car car) {
        return addCarFlow.execute(car);
    }

    @Override
    public ResponseEntity<ResponseGetCarsById> updateCar(@ApiParam(value = UPDATE_CARS_VALUE) @Valid @RequestBody Car car) {
        return updateCarFlow.execute(car);
    }

    @Override
    public ResponseEntity<Void> removeCar(
        @PathVariable(value = REMOVE_CARS_BY_ID_PATH_ID, required = true) Long id,
        @PathVariable(value = REMOVE_CARS_BY_ID_PATH_TYPE, required = true) Long type) {
        return removeCarFlow.execute(id, type);
    }
}

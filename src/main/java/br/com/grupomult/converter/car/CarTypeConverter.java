package br.com.grupomult.converter.car;

import br.com.grupomult.api.car.models.CarType;

/**
 * Created by leandro on 24/12/18.
 */
public class CarTypeConverter {

    public static CarType convert(br.com.grupomult.entities.car.CarType entity){
        CarType domain = new CarType();

        domain.setId(entity.getId());
        domain.setCode(entity.getCode());
        domain.setDescription(entity.getDescription());

        return domain;
    }

    public static br.com.grupomult.entities.car.CarType convert(CarType domain){
        br.com.grupomult.entities.car.CarType entity = new br.com.grupomult.entities.car.CarType();

        entity.setId(domain.getId());
        entity.setCode(domain.getCode());
        entity.setDescription(domain.getDescription());

        return entity;
    }

}

package br.com.grupomult.converter.car;

import br.com.grupomult.api.car.models.Car;
import br.com.grupomult.entities.car.CarId;
import br.com.grupomult.utils.DateUtils;

/**
 * Created by leandro on 24/12/18.
 */
public class CarConverter {

    public static Car convert(br.com.grupomult.entities.car.Car entity){
        Car domain = new Car();

        domain.setId(entity.getCarId().getId());
        domain.setType(CarTypeConverter.convert(entity.getCarId().getType()));
        domain.setCode(entity.getCode());
        domain.setDescription(entity.getDescription());
        domain.setValue(entity.getValue());
        domain.setValueTax(entity.getValue() > 0 ? entity.getValue()*0.03 : 0d);
        domain.setCreationDate(entity.getCreationDate() != null ? DateUtils.dateToString(entity.getCreationDate(), DateUtils.ISO8601_COMPLETE_DATE) : null);
        domain.setUpdateDate(entity.getUpdateDate() != null ? DateUtils.dateToString(entity.getUpdateDate(), DateUtils.ISO8601_COMPLETE_DATE) : null);

        return domain;

    }

    public static br.com.grupomult.entities.car.Car convert(Car domain){
        br.com.grupomult.entities.car.Car entity = new br.com.grupomult.entities.car.Car();

        entity.setCarId(new CarId(domain.getId(), CarTypeConverter.convert(domain.getType())));
        entity.setCode(domain.getCode());
        entity.setDescription(domain.getDescription());
        entity.setValue(domain.getValue());
        entity.setCreationDate(domain.getCreationDate() != null ? DateUtils.stringToDate(domain.getCreationDate(), DateUtils.ISO8601_COMPLETE_DATE) : null);
        entity.setUpdateDate(domain.getUpdateDate() != null ? DateUtils.stringToDate(domain.getUpdateDate(), DateUtils.ISO8601_COMPLETE_DATE) : null);

        return entity;

    }

}

package br.com.grupomult.entities.car;

import br.com.grupomult.entities.Species;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.*;
import java.time.OffsetDateTime;
import java.util.Date;

/**
 * Created by leandro on 24/12/18.
 */
@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Car {

    @EmbeddedId
    private CarId carId;

    private String code;

    private String description;

    private Double value;

    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate;

    @Temporal(TemporalType.TIMESTAMP)
    private Date updateDate;

}

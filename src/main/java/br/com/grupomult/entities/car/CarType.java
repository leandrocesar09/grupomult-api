package br.com.grupomult.entities.car;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

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
public class CarType {

    @Id
    @GeneratedValue
    private Long id;

    private String code;

    private String description;

    public CarType(Long id){
        this.id = id;
    }
}

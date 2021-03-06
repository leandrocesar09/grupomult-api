package br.com.grupomult.configuration;

import br.com.grupomult.repositories.CarRepository;
import br.com.grupomult.repositories.CarTypeRepository;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import br.com.grupomult.repositories.AnimalRepository;

@Configuration
@ImportResource("classpath:application-context-test.xml")
public class TestConfiguration {

	@MockBean
	private AnimalRepository animalRepository;

    @MockBean
    private CarRepository carRepository;

    @MockBean
    private CarTypeRepository carTypeRepository;


}
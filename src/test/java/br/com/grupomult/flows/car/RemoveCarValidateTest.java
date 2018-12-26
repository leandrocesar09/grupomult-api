package br.com.grupomult.flows.car;

import br.com.grupomult.configuration.TestConfiguration;
import br.com.grupomult.exceptions.HttpBadRequestException;
import br.com.grupomult.exceptions.HttpNotFoundException;
import br.com.grupomult.flows.animal.ListAnimalsByIdConverter;
import br.com.grupomult.flows.animal.ListAnimalsByIdLoadValidate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by leandro on 26/12/18.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestConfiguration.class)
public class RemoveCarValidateTest {

    @Autowired
    private RemoveCarValidate flow;

    @Test
    public void testValidateWithSuccess() {
        flow.execute(1l, 1l);
    }

    @Test(expected = HttpBadRequestException.class)
    public void testValidateWithAnimalNullIdHttpBadRequestException() {
        flow.execute(null, 1l);
    }

    @Test(expected = HttpBadRequestException.class)
    public void testValidateWithAnimalNullTypeHttpBadRequestException() {
        flow.execute(1l, null);
    }

}

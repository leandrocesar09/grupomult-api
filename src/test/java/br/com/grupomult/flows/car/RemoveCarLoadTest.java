package br.com.grupomult.flows.car;

import br.com.grupomult.api.animal.models.ResponseGetAnimalsById;
import br.com.grupomult.configuration.TestConfiguration;
import br.com.grupomult.repositories.CarRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Random;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by leandro on 26/12/18.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestConfiguration.class)
public class RemoveCarLoadTest {

    @Autowired
    private RemoveCarLoad flow;

    @Test
    public void testLoadSuccess() {
        ResponseEntity<Void> response = flow.execute(new Random().nextLong(), new Random().nextLong());
        assertNotNull(response);
        assertEquals(HttpStatus.OK, response.getStatusCode());
    }

}

package br.com.grupomult.flowdefinitions;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import br.com.grupomult.flows.car.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.grupomult.configuration.TestConfiguration;
import br.com.grupomult.flows.animal.ListAnimalsByIdConverter;
import br.com.grupomult.flows.animal.ListAnimalsByIdLoad;
import br.com.grupomult.flows.animal.ListAnimalsByIdLoadValidate;
import br.com.grupomult.flows.animal.ListAnimalsByIdResponse;
import br.com.grupomult.flows.animal.ListAnimalsByIdValidate;
import br.com.grupomult.flows.animal.ListAnimalsConverter;
import br.com.grupomult.flows.animal.ListAnimalsLoad;
import br.com.grupomult.flows.animal.ListAnimalsResponse;
import br.com.grupomult.flows.animal.ListAnimalsValidate;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestConfiguration.class)
public class FlowDefinitionTest {

	@Autowired
	private ApplicationContext applicationContest;

	@Test
	public void testFlowListAnimalsExistsSuccess() {
		assertNotNull(applicationContest.getBean("listAnimalsValidate"));
		assertNotNull(applicationContest.getBean("listAnimalsLoad"));
		assertNotNull(applicationContest.getBean("listAnimalsConverter"));
		assertNotNull(applicationContest.getBean("listAnimalsResponse"));
	}

	@Test
	public void testFlowListAnimalsInstanceofSuccess() {
		assertTrue(applicationContest.getBean("listAnimalsValidate") instanceof ListAnimalsValidate);
		assertTrue(applicationContest.getBean("listAnimalsLoad") instanceof ListAnimalsLoad);
		assertTrue(applicationContest.getBean("listAnimalsConverter") instanceof ListAnimalsConverter);
		assertTrue(applicationContest.getBean("listAnimalsResponse") instanceof ListAnimalsResponse);
	}

	@Test
	public void testFlowListAnimalsByIdExistsSuccess() {
		assertNotNull(applicationContest.getBean("listAnimalsByIdValidate"));
		assertNotNull(applicationContest.getBean("listAnimalsByIdLoad"));
		assertNotNull(applicationContest.getBean("listAnimalsByIdLoadValidate"));
		assertNotNull(applicationContest.getBean("listAnimalsByIdConverter"));
		assertNotNull(applicationContest.getBean("listAnimalsByIdResponse"));
	}

	@Test
	public void testFlowListAnimalsByIdInstanceofSuccess() {
		assertTrue(applicationContest.getBean("listAnimalsByIdValidate") instanceof ListAnimalsByIdValidate);
		assertTrue(applicationContest.getBean("listAnimalsByIdLoad") instanceof ListAnimalsByIdLoad);
		assertTrue(applicationContest.getBean("listAnimalsByIdLoadValidate") instanceof ListAnimalsByIdLoadValidate);
		assertTrue(applicationContest.getBean("listAnimalsByIdConverter") instanceof ListAnimalsByIdConverter);
		assertTrue(applicationContest.getBean("listAnimalsByIdResponse") instanceof ListAnimalsByIdResponse);
	}

    @Test
    public void testFlowListCarsExistsSuccess() {
        assertNotNull(applicationContest.getBean("listCarsValidate"));
        assertNotNull(applicationContest.getBean("listCarsLoad"));
        assertNotNull(applicationContest.getBean("listCarsConverter"));
        assertNotNull(applicationContest.getBean("listCarsResponse"));
    }

    @Test
    public void testFlowListCarsInstanceofSuccess() {
        assertTrue(applicationContest.getBean("listCarsValidate") instanceof ListCarsValidate);
        assertTrue(applicationContest.getBean("listCarsLoad") instanceof ListCarsLoad);
        assertTrue(applicationContest.getBean("listCarsConverter") instanceof ListCarsConverter);
        assertTrue(applicationContest.getBean("listCarsResponse") instanceof ListCarsResponse);
    }

    @Test
    public void testFlowListCarsByIdExistsSuccess() {
        assertNotNull(applicationContest.getBean("listCarsByIdValidate"));
        assertNotNull(applicationContest.getBean("listCarsByIdLoad"));
        assertNotNull(applicationContest.getBean("listCarsByIdLoadValidate"));
        assertNotNull(applicationContest.getBean("listCarsByIdConverter"));
        assertNotNull(applicationContest.getBean("listCarsByIdResponse"));
    }

    @Test
    public void testFlowListCarsByIdInstanceofSuccess() {
        assertTrue(applicationContest.getBean("listCarsByIdValidate") instanceof ListCarsByIdValidate);
        assertTrue(applicationContest.getBean("listCarsByIdLoad") instanceof ListCarsByIdLoad);
        assertTrue(applicationContest.getBean("listCarsByIdLoadValidate") instanceof ListCarsByIdLoadValidate);
        assertTrue(applicationContest.getBean("listCarsByIdConverter") instanceof ListCarsByIdConverter);
        assertTrue(applicationContest.getBean("listCarsByIdResponse") instanceof ListCarsByIdResponse);
    }

    @Test
    public void testFlowLAddCarExistsSuccess() {
        assertNotNull(applicationContest.getBean("addCarValidate"));
        assertNotNull(applicationContest.getBean("addCarPersist"));
        assertNotNull(applicationContest.getBean("addCarConverter"));
        assertNotNull(applicationContest.getBean("addCarResponse"));
    }

    @Test
    public void testFlowAddCarInstanceofSuccess() {
        assertTrue(applicationContest.getBean("addCarValidate") instanceof AddCarValidateTest);
        assertTrue(applicationContest.getBean("addCarPersist") instanceof AddCarPersist);
        assertTrue(applicationContest.getBean("addCarConverter") instanceof AddCarConverter);
        assertTrue(applicationContest.getBean("addCarResponse") instanceof AddCarResponse);
    }

    @Test
    public void testFlowLUpdateCarExistsSuccess() {
        assertNotNull(applicationContest.getBean("updateCarValidate"));
        assertNotNull(applicationContest.getBean("updateCarPersist"));
        assertNotNull(applicationContest.getBean("updateCarConverter"));
        assertNotNull(applicationContest.getBean("updateCarResponse"));
    }

    @Test
    public void testFlowUpdateCarInstanceofSuccess() {
        assertTrue(applicationContest.getBean("updateCarValidate") instanceof UpdateCarValidate);
        assertTrue(applicationContest.getBean("updateCarPersist") instanceof UpdateCarPersist);
        assertTrue(applicationContest.getBean("updateCarConverter") instanceof UpdateCarConverter);
        assertTrue(applicationContest.getBean("updateCarResponse") instanceof UpdateCarResponse);
    }

    @Test
    public void testFlowRemoveCarExistsSuccess() {
        assertNotNull(applicationContest.getBean("removeCarValidate"));
        assertNotNull(applicationContest.getBean("removeCarLoad"));
    }

    @Test
    public void testFlowRemoveCarInstanceofSuccess() {
        assertTrue(applicationContest.getBean("removeCarValidate") instanceof RemoveCarValidate);
        assertTrue(applicationContest.getBean("removeCarLoad") instanceof RemoveCarLoad);
    }

}

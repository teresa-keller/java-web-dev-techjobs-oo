package Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {
Job job1;
Job job2;


@Before
public void createJobObject() {
     job1 = new Job();
     job2 = new Job();
    }


    @Test
    public void testSettingJobId() {

        assertNotEquals(job1, job2);

    }

    @Test
    public void testJobConstructorSetsAllFields() {
    Job job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    assertEquals("Product tester", job3.getName());
    }

}

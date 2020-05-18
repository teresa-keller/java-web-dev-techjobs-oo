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

        assertEquals(job2.getId(), job1.getId()+1);

    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals("Product tester", job3.getName());
        assertEquals("ACME", job3.getEmployer().toString());
        assertEquals("Desert", job3.getLocation().toString());
        assertEquals("Quality control", job3.getPositionType().toString());
        assertEquals("Persistence", job3.getCoreCompetency().toString());
    }

    @Test
    public void testJobsForEquality() {

        Job job4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job5 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertNotSame(job4, job5);
    }

    @Test
    public void testForBlankLineBeforeAndAfterString() {

        Job job6 = new Job();
        assertTrue(job6.toString().startsWith('\n' + "ID:"));
    }

    @Test
    public void testForLabelAndNewLineForEachField() {




    }



}

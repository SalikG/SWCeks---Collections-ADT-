import com.example.xpdayone.model.Database;
import com.example.xpdayone.model.User;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class StatsCalculatorTest {

    StatsCalculator statsCalculator;


    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this); // Spring
        statsCalculator = new StatsCalculator(database);
    }

    @Test
    public void getAverageAmount() {
        List<User> users = new ArrayList<>();
        users.add(new User(1,"", 3));
        users.add(new User(1,"", 4));
        users.add(new User(1,"", 5));
        when(database.getAllUsers()).thenReturn(users);
        assertEquals(4, statsCalculator.getAverageAmount(), 0.0);


    }
}
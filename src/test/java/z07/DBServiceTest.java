package z07;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;


import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class DBServiceTest {

    @Mock
    private DBConnector dbConnector;

    @InjectMocks
    private DBService dbService;

    @Test
    public void testCountWordNotEmpty(){

        when(dbConnector.getContent("My Table", 10, "Column"))
                .thenReturn("zzz aaa aaa bbb ertet werw aaa");

        int res = dbService.countWord("My Table", 10, "Column", "aaa");
        assertThat(res).isEqualTo(3);

    }
}

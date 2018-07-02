package z07;

/*
Mockowanie - robienie "oszukanego" obiektu, atrapy obiektu
oznacza pominicię pewnej logiki (obliczen) testowanej funkcji
 */

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class MainServiceTest {

    /*
    deklarujemy, że ten framework na automatycznie zrobic obiekt klasy FileAccessService
     */
    @Mock
    private FileAccessService fileAccessService;

    /*
        deklarujemy, że ten framework na automatycznie zrobic obiekt klasy MainService
        i wstrzyknąć temu obiektowi obiekt fileAccessService
     */
    @InjectMocks
    private MainService mainService;

    @Test
    public void testCount() throws IOException {
        /*
        deklarujemy, ze jesli zostanie wywolana metoda loadAllLines, to zamiast łączyć się z plikiem i wyciagac z niego wartości,
        ma zostać zwrócona (na sztywno) przykładowa lista stringów (atrapa pliku /DB)
         */

            when(fileAccessService.loadAllLines()).thenReturn(Arrays.asList("one", "two"));

        int numOfLines = mainService.numIfLines();
        assertThat(numOfLines).isEqualTo(2);
    }

}

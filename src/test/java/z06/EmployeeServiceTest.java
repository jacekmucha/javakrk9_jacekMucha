package z06;

import org.junit.*;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class EmployeeServiceTest {
    /*
    testy jednostkowe powinny być niezależne, niezależnie wykonywane.
    Wynik jednej metody testowej nie powinien wpływać na inną

    sout w testach jednostkowych to logi, w zasadzie zaleca sie uzywanie klasy Logger też w testach
     */

    private EmployeeService employeeService = new EmployeeServiceImpl();

    @Before /*
            wykona sie za kazym razem przed wykonaniem KAŻDEJ metody testowej,
            im więcej kodu jest współdzielone przez różne metody, to warto go testować tutaj,
            na zastadzie wyciągnięcia przed nawias.
            Metoda podaje taki sam stan obiektów do każdej metody
            */
    public void setUpBefore(){
//        System.out.println("before - tutaj najczęśćiej jest przygotowanie róznych obiektów do testów");
        employeeService.add(new Employee(1L,"TestEmpl1",999.0));
        employeeService.add(new Employee(2L,"TestEmpl2",10000.0));
        employeeService.add(new Employee(3L,"TestEmpl3",6000.0));
    }

    @BeforeClass
    /*
    wykona się tylko jeden raz przed wykonniem wszystkich metod testowych. Nie podaje takiego samego stanu obiektów
    dla każdej metody, metoda testowa jest statyczna
     */
    public static void setUpBeforeClass(){
//        System.out.println("beforeClass - tutaj najczęśćiej jest przygotowanie róznych obiektów do testów");
    }

    @After // wykonuje sie za kazdym razem po wykonaniu kazdej metody
    public void setUpAfter(){
//        System.out.println("after - sprzątanie po testach, np. usuwanie plików, zamykanie połączenia do bazy danych");
    }

    @AfterClass // wykonuje sie 1 raz po zakonczeniu wszystkich metod testowych, statyczna
    public static void setUpAfterClass(){
//        System.out.println("afterClass - sprzątanie po testach, np. usuwanie plików, zamykanie połączenia do bazy danych");
    }


    @Ignore // test pomijany, jeżeli jest ta adnotacja, np. test nie jest jeszcze skończony
    @Test
    public void testChangeSalary(){

    }

    @Test
    public void testRemove(){
        employeeService.remove(4L);
        assertEquals(3,employeeService.count()); // tego pracownika nie ma

        employeeService.remove(2L);
        assertFalse(employeeService.exists(2L)); // ten był i miał zostać usuięty

    }

    @Test
    public void testExists(){

        assertTrue(employeeService.exists(new Employee(1L,"TestEmpl1",999.0)));
        assertFalse(employeeService.exists(new Employee(5L,"TestEmpl1",999.0)));
    }

    @Test
    public void testCount(){
        assertEquals(3,employeeService.count());
            employeeService.remove(1L);
            assertEquals(2, employeeService.count());
    }

}

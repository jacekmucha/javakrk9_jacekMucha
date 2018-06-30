package z06;

public interface EmployeeService {

    public void add(Employee emp);
    public void remove(Long id); // usuwanie pracownika tylko po ID
    public boolean exists(Long id); // podaj ID, aby sprwdzić, czy istnieje pracownik
    public boolean exists(Employee emp); // podaj obiekt pracownika, aby sprwdzić, czy istnieje pracownik
    public int count();


}

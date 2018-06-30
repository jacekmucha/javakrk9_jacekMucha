package z06;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class EmployeeServiceImpl implements EmployeeService {

    private Set<Employee> employees = new HashSet<>();


    @Override
    public void add(Employee emp) {
        employees.add(emp);
    }

    @Override
    public void remove(Long id) { //do usuwania nie po obiektach
        Iterator<Employee> iterator = employees.iterator();
        while(iterator.hasNext()){
            Employee emp = iterator.next();
            if(emp.getId().equals(id)){
                iterator.remove();
            }
        }
    }

    @Override
    public boolean exists(Long id) {
        return false;
    }

    @Override
    public boolean exists(Employee emp) {
        //TODO: add implementation
//        throw new NotImplementedException(); // informacja, że jeszcze nie skończone

        if(employees.contains(emp)){
            return true;
        }

        return false;
    }

    @Override
    public int count() {
        return employees.size();
    }
}

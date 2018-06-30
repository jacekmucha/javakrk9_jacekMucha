package z03;

public class Person implements Comparable {

    private long id;
    private String email;

    public Person(long id, String email) {
        this.id = id;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", email='" + email + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    // jesli p1 < p2 to ma zarocic wartoc ujemna
    // jesli p1 == p2 to 0
    // jesli p1 > p2 to dodatnia
    @Override
    public int compareTo(Object o) {
        Person p2 = (Person)o;
//        return email.compareTo(p2.getEmail()); //---> dla email

    return (int)id - (int)p2.getId();


    }
}

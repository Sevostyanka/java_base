public class Worker {
    int id;
    int salay;
    String firstName;
    String lastName;

    @Override
    public String toString() {
        return String.format("id:%d, fn:%s, ln:%s, s:%d",id, firstName, lastName, salay);
    }

    @Override
    public boolean equals(Object obj) {
        Worker t = (Worker) obj;
        return id == t.id && firstName == t.firstName;
    }

    @Override
    public int hashCode() {
        return id;
    }
}

import java.util.ArrayList;
import java.util.List;
public class Cat {
    /*Продумайте структуру класса Кот. Какие поля и методы будут актуальны для приложения, которое является
    а) информационной системой ветеринарной клиники
    б) архивом выставки котов
    в) информационной системой Театра кошек Ю. Д. Куклачёва
    Можно записать в текстовом виде, не обязательно реализовывать в java.*/

    private String name;
    private int age;
    private String owner;
    private String poroda;
    private List<String> helthHistory;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    Cat(String name, int age, String owner, String poroda) {
        this.name =name;
        this.age = age;
        this.owner = owner;
        this.poroda = poroda;
        helthHistory = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "name: " + name + ",\nage: " + age + ",\nowner: " + owner + ",\nporoda: " + poroda + "\n";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getPoroda() {
        return poroda;
    }

    public void setPoroda(String poroda) {
        this.poroda = poroda;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (!(obj instanceof Cat)){
            return false;
        }
        Cat cat = (Cat)obj;
        return name.equals(cat.name) && age == cat.age && owner.equals(cat.owner) && poroda.equals(cat.poroda);
    }

    @Override
    public int hashCode() {
        return name.hashCode() + 7*age + 11*owner.hashCode() + 17*poroda.hashCode();
    }
}

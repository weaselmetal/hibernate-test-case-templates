package my.project;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Foo
{
    @Id
    private long id;

    private String name;

    public Foo(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

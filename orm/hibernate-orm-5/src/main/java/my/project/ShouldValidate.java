package my.project;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

@Entity
public class ShouldValidate
{

    @Id
    private long id;

    private String name;

    @ManyToOne
    private Foo foo;

    public ShouldValidate(long id) {
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

    public Foo getFoo() {
        return foo;
    }

    public void setFoo(Foo foo) {
        this.foo = foo;
    }

    @PrePersist
    public void validatePrePersist() {
        System.out.println("PrePersist validation invoked");
    }

    @PreUpdate
    public void validatePreUpdate() {
        System.out.println("PreUpdate validation invoked");
        assert foo != null;
    }
}

package guru.springframework.sfgpetclinic.model;

import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.io.Serializable;


@MappedSuperclass
@SuperBuilder
public class BaseEntity implements Serializable {

   @Id
   @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

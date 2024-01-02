package pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name="access")
public class Access {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="ac_id")
    private int acId;

    @Column(name="ac_name")
    private String acName;
    @OneToMany(mappedBy = "access")
    @JsonManagedReference("access-user")
    private Set<User> users;

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    public Access() {
    }


    public int getAcId() {
        return acId;
    }



    public String getAcName() {
        return acName;
    }

    public void setAcName(String acName) {
        this.acName = acName;
    }
}

package pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name="client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="cli_id")
    private int cliId;
    @Column(name = "cli_user_id")
    private int cliUserId;
    @Column(name = "cli_sitNum")
    private int cliSitNum;

    public Client() {
    }

    public int getCliId() {
        return cliId;
    }

    public int getCliUserId() {
        return cliUserId;
    }

    public void setCliUserId(int cliUserId) {
        this.cliUserId = cliUserId;
    }

    public int getCliSitNum() {
        return cliSitNum;
    }

    public void setCliSitNum(int cliSitNum) {
        this.cliSitNum = cliSitNum;
    }
}

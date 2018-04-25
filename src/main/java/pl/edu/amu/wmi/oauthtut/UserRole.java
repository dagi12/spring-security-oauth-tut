package pl.edu.amu.wmi.oauthtut;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Stworzone przez Eryk Mariankowski dnia 11.04.18.
 */
@Entity
@Table(name = "sa_net_user_roles")
public class UserRole {

    @Id
    @Column(name = "rola_id")
    private Integer rolaId;

    private boolean enabled;

    public Integer getRolaId() {
        return rolaId;
    }

    public void setRolaId(Integer rolaId) {
        this.rolaId = rolaId;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

}
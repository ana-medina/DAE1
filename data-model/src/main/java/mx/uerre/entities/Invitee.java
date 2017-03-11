package mx.uerre.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "Invitee")
@NamedQueries({
    @NamedQuery(name = "Invitee.findByName",
        query = "SELECT b FROM Invitee b WHERE b.inviteeName = ?1"),
    @NamedQuery(name = "Invitee.findById",
        query = "SELECT b FROM Invitee b WHERE b.idInvitee = ?1")
})
public class Invitee implements Serializable {

    @Id
    @Column(name = "idInvitee", unique = true, nullable = false, length = 14)
    private Integer idInvitee;

    @Column(name = "inviteeName", nullable = false)
    private String inviteeName;

    @Column(name = "inviteePhone", nullable = false, length = 10)
    private Integer inviteePhone;

    @Column(name = "inviteeGender", nullable = false, length = 1)
    private String inviteeGender;

    @Column(name = "inviteeAge", nullable = false)
    private Integer inviteeAge;

    public Invitee() {
    }

    public Integer getIdInvitees() {
        return idInvitee;
    }

    public void setIdInvitees(Integer idInvitees) {
        this.idInvitee = idInvitees;
    }

    public String getInviteeName() {
        return inviteeName;
    }

    public void setInviteeName(String inviteeName) {
        this.inviteeName = inviteeName;
    }

    public Integer getInviteePhone() {
        return inviteePhone;
    }

    public void setInviteePhone(Integer inviteePhone) {
        this.inviteePhone = inviteePhone;
    }

    public String getInviteeGender() {
        return inviteeGender;
    }

    public void setInviteeGender(String inviteeGender) {
        this.inviteeGender = inviteeGender;
    }

    public Integer getInviteeAge() {
        return inviteeAge;
    }

    public void setInviteeAge(Integer inviteeAge) {
        this.inviteeAge = inviteeAge;
    }
}
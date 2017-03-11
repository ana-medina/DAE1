package mx.uerre.repository;

import mx.uerre.entities.Invitee;

import java.util.List;

import mx.uerre.entities.Invitee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface InviteeRepository extends JpaRepository<Invitee, Integer>, CrudRepository<Invitee, Integer> {

    List<Invitee> findByName(String name);

    Invitee findById(Integer id);

    //@Query("DELETE FROM Invitee b WHERE b.id = :")
    //public void deleteInvitee(Integer id);

}
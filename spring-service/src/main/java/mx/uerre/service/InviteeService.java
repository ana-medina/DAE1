package mx.uerre.service;

import mx.uerre.entities.Invitee;

import java.util.List;

public interface InviteeService {

    List<Invitee> findByName(String name);

    List<Invitee> findAll();

    Invitee saveInvitee(Invitee invitee);

    Invitee findById(Integer id);

    void deleteInvitee(Integer id);
}

package mx.uerre.service.impl;

import mx.uerre.entities.Invitee;
import mx.uerre.repository.InviteeRepository;
import mx.uerre.service.InviteeService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InviteeServiceImpl implements InviteeService {

    @Autowired
    private InviteeRepository inviteeRepository;

    @Override
    public List<Invitee> findByName(String name) {
        return inviteeRepository.findByName(name);
    }

    @Override
    public List<Invitee> findAll() {
        return inviteeRepository.findAll();
    }

    @Override
    public Invitee saveInvitee(Invitee invitee) {
        return inviteeRepository.save(invitee);
    }

    @Override
    public Invitee findById(Integer id) {
        return inviteeRepository.findById(id);
    }

    @Override
    public void deleteInvitee(Integer id) {
        inviteeRepository.delete(id);
    }
}

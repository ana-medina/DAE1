package mx.uerre.web.controller;

import mx.uerre.entities.Invitee;
import mx.uerre.service.InviteeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InviteeController {

    @Autowired
    private InviteeService inviteeService;

    @GetMapping
    @RequestMapping(value = {"/invitees"})
    public String allInvitee(Model model) {
        model.addAttribute("invitee", inviteeService.findAll());
        return "invitee";
    }

    @GetMapping
    @RequestMapping(value = {"/invitee/new"})
    public String newInvitee(Model model) {
        model.addAttribute("invitee", new Invitee());///checar
        return "newInvitee";
    }

    @GetMapping
    @RequestMapping(value = {"/invitee/{id}"})
    public String showInvitee(@PathVariable Integer id, Model model) {
        model.addAttribute("invitee", inviteeService.findById(id));
        return "showInvitee";
    }

    @GetMapping
    @RequestMapping(value = {"/invitee/edit/{id}"})
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("invitee", inviteeService.findById(id));
        return "editInvitee";
    }

    @PostMapping
    @RequestMapping(value = {"/invitee"})
    public String saveInvitee(Invitee invitee) ///checar

    {
        inviteeService.saveInvitee(invitee);
        return "redirect:/invitee/" + invitee.getIdInvitee();
    }

    @RequestMapping(value = {"/Invitee/delete/{id}"})
    public String delete(@PathVariable Integer id) {
        inviteeService.deleteInvitee(id);
        return "redirect:/invitee";
    }
}

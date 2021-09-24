package org.animalsaid.demo.donation;

import org.animalsaid.demo.person.Person;
import org.animalsaid.demo.person.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
public class DonationController {
@Autowired
    DonationService donationService;
@Autowired
    PersonService personService;
@PostMapping("/persons/{personId}/donation")
public Donation addDonation(@RequestBody Donation  donation, @PathVariable long  personId){
double sum = 0;
//LocalDate localDate = new LocalDate.now();
    //donation.setPerson(new Person(personId, "", true));
Person person = personService.getPersonByPersonId(personId);
person.setActive(true);
personService.updatePerson(person);
//personService.save(person);
    donation.makeDonation(sum);

    donation.setSuccess(true);


    return donationService.addDonation(donation);
}

@GetMapping("/persons/{personId}/donations")
    public List<Donation> getMyDonations(@PathVariable long personId){
    return donationService.getDonationsByPersonId(personId);
}

}

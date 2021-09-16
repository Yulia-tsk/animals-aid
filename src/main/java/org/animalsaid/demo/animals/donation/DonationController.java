package org.animalsaid.demo.animals.donation;

import org.animalsaid.demo.person.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class DonationController {
@Autowired
    DonationService donationService;

@PostMapping("/persons/{personId}/donation")
public Donation addDonation(@RequestBody Donation  donation, @PathVariable long  personId){
double sum = 0;

    donation.setPerson(new Person(personId, ""));
    donation.makeDonation(sum);
    donation.isSuccess();

    return donationService.addDonation(donation);
}

@GetMapping("/persons/{personId}/donations")
    public List<Donation> getMyDonations(@PathVariable long personId){
    return donationService.getDonationsByPersonId(personId);
}

}

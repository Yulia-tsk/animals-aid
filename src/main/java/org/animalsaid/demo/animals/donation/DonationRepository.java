package org.animalsaid.demo.animals.donation;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface DonationRepository extends JpaRepository<Donation, Long> {
    ArrayList<Donation> findAllByPersonId(long personId);
}

package uz.interier.repositories;

import uz.interier.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
    Address getAddressByStreetName(String streetName);
    Address findByStreetName(String streetName);

}
package pl.sokolx.petclinic.services;

import pl.sokolx.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}

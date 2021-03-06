package pl.sokolx.petclinic.services.map;

import pl.sokolx.petclinic.model.Pet;
import pl.sokolx.petclinic.services.CrudService;
import pl.sokolx.petclinic.services.PetService;

import java.util.Set;

public class PetServiceMap  extends AbstractMapService<Pet, Long> implements PetService {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}

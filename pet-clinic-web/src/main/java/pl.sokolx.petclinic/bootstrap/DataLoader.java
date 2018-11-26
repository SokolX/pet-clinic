package pl.sokolx.petclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import pl.sokolx.petclinic.model.Owner;
import pl.sokolx.petclinic.model.Person;
import pl.sokolx.petclinic.model.Vet;
import pl.sokolx.petclinic.services.OwnerService;
import pl.sokolx.petclinic.services.VetService;

public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;


    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner micheal = new Owner();
        micheal.setId(1L);
        micheal.setFirstName("Michael");
        micheal.setLastName("Weston");

        ownerService.save(micheal);

        Owner fiona = new Owner();
        fiona.setId(2L);
        fiona.setFirstName("Fiona");
        fiona.setLastName("Weston");

        ownerService.save(fiona);

        System.out.println("Loaded Owners...");

        Vet sam = new Vet();
        sam.setId(1L);
        sam.setFirstName("Michael");
        sam.setLastName("Weston");

        vetService.save(sam);

        Vet micheal1 = new Vet();
        micheal1.setId(2L);
        micheal1.setFirstName("Michael");
        micheal1.setLastName("Weston");

        vetService.save(micheal1);

        System.out.println("Loaded Vets...");
    }
}

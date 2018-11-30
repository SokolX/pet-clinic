package pl.sokolx.petclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pl.sokolx.petclinic.model.Owner;
import pl.sokolx.petclinic.model.Vet;
import pl.sokolx.petclinic.services.OwnerService;
import pl.sokolx.petclinic.services.VetService;

@Component
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
        micheal.setFirstName("Michael");
        micheal.setLastName("Weston");

        ownerService.save(micheal);

        Owner fiona = new Owner();
        fiona.setFirstName("Fiona");
        fiona.setLastName("Weston");

        ownerService.save(fiona);

        System.out.println("Loaded Owners...");


        Vet sam = new Vet();
        sam.setFirstName("Michael");
        sam.setLastName("Weston");

        vetService.save(sam);

        Vet micheal1 = new Vet();
        micheal1.setFirstName("Michael");
        micheal1.setLastName("Weston");

        vetService.save(micheal1);

        System.out.println("Loaded Vets...");

    }
}

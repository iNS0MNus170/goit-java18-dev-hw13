package global.goit;

import global.goit.config.HibernateConfig;
import global.goit.entity.Client;
import global.goit.entity.Planet;
import global.goit.service.ClientService;
import global.goit.service.PlanetService;


public class Main {
    public static void main(String[] args) {
        ClientService clientService = new ClientService();
        PlanetService planetService = new PlanetService();

        // add clients
        clientService.saveClient(Client.builder().name("Bohdan Kozak").build());
        clientService.saveClient(Client.builder().name("Iryna Shevchenko").build());
        clientService.saveClient(Client.builder().name("Maksym Petrov").build());

        // add planets
        planetService.savePlanet(Planet.builder().id("NEPTUNE").name("Neptune").build());
        planetService.savePlanet(Planet.builder().id("URANUS").name("Uranus").build());
        planetService.savePlanet(Planet.builder().id("PLUTO").name("Pluto").build());

        // print clients
        System.out.println("Client 1: " + clientService.findClientById(1L));
        System.out.println("Client 2: " + clientService.findClientById(2L));
        System.out.println("Client 3: " + clientService.findClientById(3L));

        // print planets
        System.out.println("Planet 1: " + planetService.findPlanetById("NEPTUNE"));
        System.out.println("Planet 2: " + planetService.findPlanetById("URANUS"));
        System.out.println("Planet 3: " + planetService.findPlanetById("PLUTO"));

        // update client
        Client clientToUpdate = clientService.findClientById(1L);
        clientToUpdate.setName("Bohdan Ivanov");
        clientService.updateClient(clientToUpdate);

        // update planet
        Planet planetToUpdate = planetService.findPlanetById("NEPTUNE");
        planetToUpdate.setName("New Neptune");
        planetService.updatePlanet(planetToUpdate);

        // print updated results
        System.out.println("Updated Client 1: " + clientService.findClientById(1L));
        System.out.println("Updated Planet 1: " + planetService.findPlanetById("NEPTUNE"));

        // delete client
        clientService.deleteClient(clientService.findClientById(2L));

        // delete planet
        planetService.deletePlanet(planetService.findPlanetById("URANUS"));

        HibernateConfig.getInstance().close();
    }
}









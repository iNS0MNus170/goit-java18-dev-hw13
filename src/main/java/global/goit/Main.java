package global.goit;

import global.goit.config.HibernateConfig;
import global.goit.entity.Ticket;
import global.goit.service.ClientService;
import global.goit.service.PlanetService;
import global.goit.service.TicketService;
import org.hibernate.PropertyValueException;


public class Main {
    public static void main(String[] args) {

        TicketService ticketCrudService = new TicketService();
        ClientService clientCrudService = new ClientService();
        PlanetService planetCrudService = new PlanetService();

        Ticket ticketWithNullClient = Ticket.builder()
                .client(null)
                .fromPlanet(planetCrudService.findPlanetById("MARS"))
                .toPlanet(planetCrudService.findPlanetById("VENUS"))
                .build();

        try {
            ticketCrudService.saveTicket(ticketWithNullClient);
        } catch (PropertyValueException exception) {
            System.err.println("Error: " + exception.getMessage());
        }

        Ticket ticketWithNonExistentPlanet = Ticket.builder()
                .client(clientCrudService.findClientById(1L))
                .fromPlanet(planetCrudService.findPlanetById("MARS"))
                .toPlanet(planetCrudService.findPlanetById("NON_EXISTENT_PLANET"))
                .build();

        try {
            ticketCrudService.saveTicket(ticketWithNonExistentPlanet);
        } catch (PropertyValueException exception) {
            System.err.println("Error: " + exception.getMessage());
        }

        HibernateConfig.getInstance().close();
    }
}









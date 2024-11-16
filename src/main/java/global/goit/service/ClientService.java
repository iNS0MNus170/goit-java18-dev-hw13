package global.goit.service;

import global.goit.dao.ClientDao;
import global.goit.entity.Client;

public class ClientService {

    private ClientDao clientDao = new ClientDao();

    public void saveClient(Client client) {
        clientDao.save(client);
    }

    public Client findClientById(Long id) {
        return clientDao.findById(id);
    }

    public void updateClient(Client client) {
        clientDao.update(client);
    }

    public void deleteClient(Client client) {
        clientDao.delete(client);
    }

}

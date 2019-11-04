package io.turntabl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Register {
    private List<Client> clients;

    public Register(List<Client> clients) {
        this.clients = clients;
    }

    public List<String> getNamesOfGoldClients(){
        List<String> clients = new ArrayList<>();

        return this.clients.stream()
                .filter(student -> student.getServiceLevel() == Level.Gold)
                .map(Client::getName)
                .collect(Collectors.toList());
    }

    public String getClientNameById(int id){
        String getClient = null;
        for (Client client : clients){
            if(client.getId() == id){
                getClient = client.getName();
            }else{
                getClient = "No Client with Such Id";
            }
        }
        return getClient;
    }

    public int countClientsAtEveryServiceLevel(){
        return  clients.stream().map(Client::getServiceLevel)
                .filter(rs -> rs != null)
                .mapToInt(List::size)
                .sum();
    }

}

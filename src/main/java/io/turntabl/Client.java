package io.turntabl;

public class Client {
    private String name;
    private int id;
    private Level serviceLevel;

    public Client(String name, int id, Level serviceLevel) {
        this.name = name;
        this.id = id;
        this.serviceLevel = serviceLevel;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Level getServiceLevel() {
        return serviceLevel;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", serviceLevel=" + serviceLevel +
                '}';
    }
}

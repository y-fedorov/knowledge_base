package ru.akhitev.kb.spring_boot.jdbc.entity;

public class Ship {
    private Long id;
    private String name;
    private String type;
    private String shipClass;
    private Long fleetUnitId;

    public Ship() {
    }

    public Ship(Long id, String name, String type, String shipClass, Long fleetUnitId) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.shipClass = shipClass;
        this.fleetUnitId = fleetUnitId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getShipClass() {
        return shipClass;
    }

    public void setShipClass(String shipClass) {
        this.shipClass = shipClass;
    }

    public Long getFleetUnitId() {
        return fleetUnitId;
    }

    public void setFleetUnitId(Long fleetUnitId) {
        this.fleetUnitId = fleetUnitId;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", shipClass='" + shipClass + '\'' +
                ", fleetUnitId=" + fleetUnitId +
                '}';
    }
}

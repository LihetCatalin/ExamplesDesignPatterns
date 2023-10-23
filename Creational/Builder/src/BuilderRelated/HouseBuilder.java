package BuilderRelated;

import HouseRelated.*;

public class HouseBuilder implements Builder {
    private HouseType houseType;
    private int nrWindows;
    private int nrRooms;
    private MaterialType materialType;
    private HeatingSystem heatingSystem;
    private AirConditioner airConditioner;

    public void setHouseType(HouseType houseType){
        this.houseType=houseType;
    }
    public void setNrWindows(int nrWindows){
        this.nrWindows=nrWindows;
    }
    public void setNrRooms(int nrRooms){
        this.nrRooms=nrRooms;
    }
    public void setMaterialType(MaterialType materialType){
        this.materialType=materialType;
    }
    public void setHeatingSystem(HeatingSystem heatingSystem){
        this.heatingSystem=heatingSystem;
    }
    public void setAirConditioner(AirConditioner airConditioner){
        this.airConditioner=airConditioner;
    }

    public House getProduct(){
        return new House(houseType, nrWindows, nrRooms, materialType, heatingSystem, airConditioner);
    }
}

package BuilderRelated;

import HouseRelated.AirConditioner;
import HouseRelated.HeatingSystem;
import HouseRelated.HouseType;
import HouseRelated.MaterialType;

public interface Builder {
    public void setHouseType(HouseType type);
    public void setNrWindows(int nrWindows);
    public void setNrRooms(int nrRooms);
    public void setMaterialType(MaterialType materialType);
    public void setHeatingSystem(HeatingSystem heatingSystem);
    public void setAirConditioner(AirConditioner airConditioner);
}

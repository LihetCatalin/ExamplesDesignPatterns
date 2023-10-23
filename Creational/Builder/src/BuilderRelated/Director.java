package BuilderRelated;

import HouseRelated.AirConditioner;
import HouseRelated.HeatingSystem;
import HouseRelated.HouseType;
import HouseRelated.MaterialType;

public class Director {
    public void constructWoodenHouse(Builder builder) {
        builder.setHouseType(HouseType.WOODEN_HOUSE);
        builder.setNrWindows(1);
        builder.setNrRooms(2);
        builder.setMaterialType(MaterialType.WOOD);
        builder.setHeatingSystem(null);
        builder.setAirConditioner(null);
    }

    public void constructStoneHouse(Builder builder) {
        builder.setHouseType(HouseType.STONE_HOUSE);
        builder.setNrWindows(2);
        builder.setNrRooms(4);
        builder.setMaterialType(MaterialType.STONE);
        builder.setHeatingSystem(new HeatingSystem());
        builder.setAirConditioner(null);
    }

    public void constructMansion(Builder builder) {
        builder.setHouseType(HouseType.MANSION);
        builder.setNrWindows(10);
        builder.setNrRooms(8);
        builder.setMaterialType(MaterialType.STONE);
        builder.setHeatingSystem(new HeatingSystem());
        builder.setAirConditioner(new AirConditioner("BEKO"));
    }
}

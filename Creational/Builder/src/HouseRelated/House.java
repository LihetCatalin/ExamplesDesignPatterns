package HouseRelated;

public class House {
    private final HouseType houseType;
    private final int nrWindows;
    private final int nrRooms;
    private final MaterialType materialType;
    private final HeatingSystem heatingSystem;
    private final AirConditioner airConditioner;

    public House(HouseType houseType, int nrWindows, int nrRooms, MaterialType materialType,
                 HeatingSystem heatingSystem, AirConditioner airConditioner){
        this.houseType=houseType;
        this.nrWindows=nrWindows;
        this.nrRooms=nrRooms;
        this.materialType = materialType;
        this.heatingSystem = heatingSystem;
        this.airConditioner = airConditioner;
    }

    public HouseType getHouseType(){return this.houseType;}
    public int getNrWindows(){return this.nrWindows;}
    public int getNrRooms(){return this.nrRooms;}
    public MaterialType getMaterialType(){return this.materialType;}
    public HeatingSystem getHeatingSystem(){return this.heatingSystem;}
    public AirConditioner getAirConditioner(){return this.airConditioner;}
    public String printData() {
        String info = "";
        info += "House type : "+houseType+"\n";
        info += "Number of windows : "+nrWindows + "\n" + "Number of rooms: "+nrRooms+"\n";
        info += "Material used for building the walls :" + materialType + "\n";
        if (heatingSystem==null)
            info += "Heating system : N/A" + "\n";
        else info += "Heating system : functional" + "\n";
        if (airConditioner==null)
            info += "Air conditioner : N/A" + "\n";
        else info += "Air conditioner : functional" + "\n";
        return info;
    }
}

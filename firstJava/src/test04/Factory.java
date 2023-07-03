package test04;

public class Factory {
    private static int unitCount=0;
    private String unitName;
    private int unitNum;

    public Factory(){
//        unitCount++;
//        unitNum=unitCount;
    }
    public Factory(String unit){
        unitCount++;
        unitNum=unitCount;
        this.unitName=unit;
    }
    public String getUnit(){
        return unitName;
    }
    public int getUnitCount(){
        return unitNum;
    }
}

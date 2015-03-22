package done.it.get.volleyg.model;

/**
 * Created by asu on 3/22/15.
 */
public class WeatherData {

    private String CountyID;
    private String CountyName;
    private String TownName;
/*
    public WeatherData(String countyId, String countyName, String townName) {
        this.CountyID = countyId;
        this.CountyName = countyName;
        this.TownName = townName;
    }*/

    /*
    public void setCountyID(String countyId){
        this.CountyID = countyId;
    }
    public String getCountyID() {
        return CountyID;
    }

    public void setCountyName(String countyName){
        this.CountyName = countyName;
    }
    public String getCountyName(){
        return  CountyName;
    }

    public void setTownName(String townName){
        this.TownName = townName;
    }

    public String getTownName(){
        return  TownName;
    }
    */

    @Override
    public String toString() {
        return "CountyId:"+CountyID+" CountyName:"+CountyName+" townName:"+TownName;
    }
}

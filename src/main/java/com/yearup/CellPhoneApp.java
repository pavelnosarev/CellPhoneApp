package com.yearup;







public class CellPhoneApp {

    public static void main (String[] args ) {
        CellPhone iphone  = new CellPhone(123456789, "iPhone 12 Pro Max", "T-Mobile", 916-759-2872, "Pavel", 100);

        CellPhone Samsung = new CellPhone(true);

        iphone.goOnFaceTime();
        iphone.goOnACall();
        System.out.println(iphone.getBattery());
        iphone.chargeBattery();
    }
}

class CellPhone{
    //properties//
    private boolean isOn;

    private long  serialNumber;
    private String model;
    private String carrier;
    private long phoneNumber;
    private String owner;
    private int battery;

    ///getter and setters//
    public CellPhone(long serialNumber, String model, String carrier,
                     long phoneNumber, String owner, int battery) {
                this.serialNumber = serialNumber;
                this.model = model;
                this. carrier = carrier;
                this. phoneNumber = phoneNumber;
                this.owner = owner;
                this.battery = battery;

    }

    public boolean isOn() {
        return isOn;
    }

    public  CellPhone(boolean isOn){
        this.isOn = isOn;
    }
    public long  getSerialNumber(){

        return this.serialNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setSerialNumber(long serialNumber) {
        this.serialNumber = serialNumber;

    }

    public void goOnACall(){
        this.battery -= 15;


    }
    public void  goOnFaceTime(){
        this.battery -= 20;
    }

    public void  sendText(){this.battery -= 1;}

    public int sendText(int textsSent) {
        this.battery -= textsSent*2;
        return this.battery;

    }

    public int getBattery() {
        return battery;
    }

//    public void setBattery(int battery) {
//        this.battery = battery;
//    }

    public void  chargeBattery(){
         while (this.battery<101 ) {
             System.out.println(this.battery);
             int i = this.battery++;
         }
    }
    public void dial(String number){


    }
}


//map.getDirections("")



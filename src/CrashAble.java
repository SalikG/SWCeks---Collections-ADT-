public abstract class CrashAble {
    boolean vehicleDriveable = true;

    public void youCrashed(){
        this.vehicleDriveable = false;
    }

    public abstract void setVehicleStrength(int vehicleStrength);

    public abstract int getVehicleStrength();
}

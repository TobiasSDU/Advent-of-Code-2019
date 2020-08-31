package dk.tobias;

import java.util.ArrayList;
import java.util.List;

public class Spacecraft {
    private List<SpacecraftModule> spacecraftModules;
    private int fuelRequirement;

    public Spacecraft() {
        spacecraftModules = new ArrayList<>();
        fuelRequirement = 0;
    }

    public void addSpacecraftModule(SpacecraftModule spacecraftModule){
        spacecraftModules.add(spacecraftModule);
    }

    public List<SpacecraftModule> getSpacecraftModules() {
        return spacecraftModules;
    }

    public void addFuel(int fuel) {
        fuelRequirement += fuel;
    }

    public int getFuelRequirement() {
        return fuelRequirement;
    }
}

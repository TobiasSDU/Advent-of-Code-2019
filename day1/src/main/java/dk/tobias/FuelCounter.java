package dk.tobias;

public class FuelCounter {

    public static void fuelSpacecraft(Spacecraft spacecraft) {
        for (SpacecraftModule spacecraftModule: spacecraft.getSpacecraftModules()) {
            spacecraft.addFuel(calculateFuelRequirement(spacecraftModule.getMass()));
        }
    }

    private static int calculateFuelRequirement(int mass) {
        int requiredFuel = mass / 3 - 2;

        if (requiredFuel > 0) {
            requiredFuel += calculateFuelRequirement(requiredFuel);
        } else {
            requiredFuel = 0;
        }

        return requiredFuel;
    }
}

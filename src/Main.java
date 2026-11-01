import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        ArrayList<NeuralMod> registry = new ArrayList<>();

        registry.add(new NeuralMod("Apex-1", 4.2, 85));
        registry.add(new NeuralMod("Zenith-X", 5.8, 70));
        registry.add(new NeuralMod("Nova-Core", 4.2, 92));
        registry.add(new NeuralMod("Soma-Link", 3.1, 98));
        registry.add(new NeuralMod("Pulse-7", 5.8, 60));

        // Test mods with matching speed and compatibility
        registry.add(new NeuralMod("Alpha-Mod", 4.2, 85));
        registry.add(new NeuralMod("Beta-Mod", 4.2, 85));

        // Test mods with matching speed but different compatibility
        registry.add(new NeuralMod("Gamma-Mod", 3.1, 90));
        registry.add(new NeuralMod("Delta-Mod", 3.1, 95));

        Collections.sort(registry);

        System.out.println("Final Neural Mod Registry:");

        for (NeuralMod mod : registry) {
            System.out.println(mod);
        }
    }
}
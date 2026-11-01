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

        // Additional test mods
        registry.add(new NeuralMod("Alpha-Mod", 4.2, 85));
        registry.add(new NeuralMod("Beta-Mod", 4.2, 85));

        Collections.sort(registry);

        System.out.println("Optimal Neural Mod Registry:");

        for (NeuralMod mod : registry) {
            System.out.println(mod);
        }
    }
}
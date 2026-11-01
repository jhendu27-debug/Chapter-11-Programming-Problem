public class NeuralMod {

    private String name;
    private double processingSpeed;
    private int compatibilityRating;

    public NeuralMod(String name, double processingSpeed, int compatibilityRating) {
        this.name = name;
        this.processingSpeed = processingSpeed;
        this.compatibilityRating = compatibilityRating;
    }

    public String getName() {
        return name;
    }

    public double getProcessingSpeed() {
        return processingSpeed;
    }

    public int getCompatibilityRating() {
        return compatibilityRating;
    }

    @Override
    public String toString() {
        return name + " | Speed: " + processingSpeed +
                " | Compatibility: " + compatibilityRating;
    }
}
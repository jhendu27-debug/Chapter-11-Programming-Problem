public class NeuralMod implements Comparable<NeuralMod> {

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
    public int compareTo(NeuralMod other) {

        // First: Compare processing speed (lowest first)
        int speedComparison = Double.compare(
                this.processingSpeed,
                other.processingSpeed
        );

        if (speedComparison != 0) {
            return speedComparison;
        }

        // Second: Compare compatibility (highest first)
        int compatibilityComparison = Integer.compare(
                other.compatibilityRating,
                this.compatibilityRating
        );

        if (compatibilityComparison != 0) {
            return compatibilityComparison;
        }

        // Third: Compare names alphabetically
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return name + " | Speed: " + processingSpeed +
                " | Compatibility: " + compatibilityRating;
    }
}
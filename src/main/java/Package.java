public class Package {
    private int weight;
    private int height;
    private int width;
    private int depth;

    public Package(int weight, int height, int width, int depth) {

        this.weight = weight;
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getDepth() {
        return depth;
    }


    public double postageInBaseCurrency() {
        if (getWeight() <= 60 && getHeight() <= 229 && getWidth() <= 162 && getDepth() <= 25) {
            return 120;
        }
        if (getWeight() <= 500 && getHeight() <= 324 && getWidth() <= 229 && getDepth() <= 100) {
            return getWeight() * 4;
        }
        return Math.max(getWeight(), getHeight() * getWidth() * getDepth() / 1000) * 6;
    }
}

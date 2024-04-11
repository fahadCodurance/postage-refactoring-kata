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
}

package patterns.builder;

/**
 * Created by Jason MacKeigan on 2018-05-03 at 3:03 PM
 */
public class Game {

    private final String name;

    private final int width;

    private final int height;

    private Game(String name, int width, int height) {
        this.name = name;
        this.width = width;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public static class Builder {

        private final String name;

        private int width;

        private int height;

        public Builder(String name) {
            this.name = name;
        }

        public Builder setWidth(int width) {
            this.width = width;

            return this;
        }

        public Builder setHeight(int height) {
            this.height = height;

            return this;
        }

        public Game build() {
            return new Game(name, width, height);
        }
    }

}

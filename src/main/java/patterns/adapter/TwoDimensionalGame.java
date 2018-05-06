package patterns.adapter;

/**
 * Created by Jason MacKeigan on 2018-05-06 at 1:47 PM
 */
public class TwoDimensionalGame implements GameAdapter {

    @Override
    public void start() {
        System.out.println("Starting game in a 2d environment.");
    }

    @Override
    public void render() {
        System.out.println("Rendering game in a 2d environment.");
    }

    @Override
    public void end() {
        System.out.println("Ending game in a 2d environment.");
    }

}

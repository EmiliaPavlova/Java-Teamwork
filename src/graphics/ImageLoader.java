package graphics;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class ImageLoader {

<<<<<<< HEAD
=======
    //Method that returns an image
>>>>>>> 82a471235842d3ddf38be8f98bc4a28e4d51d64c
    public static BufferedImage loadImage(String path) {
        try {
            return ImageIO.read(ImageLoader.class.getResource(path));
        } catch (IOException e) {
            e.printStackTrace();
<<<<<<< HEAD
            System.exit(1);
        }
=======
            //Exits the application
            System.exit(1);
        }

        //Ensures that no errors are passed
>>>>>>> 82a471235842d3ddf38be8f98bc4a28e4d51d64c
        return null;
    }
}

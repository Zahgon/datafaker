package net.datafaker.providers.base;

import javax.imageio.ImageIO;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Base64;
import static java.awt.Color.WHITE;
import static java.util.Objects.requireNonNull;
import static net.datafaker.providers.base.Image.ImageType.BMP;
import static net.datafaker.providers.base.Image.ImageType.GIF;
import static net.datafaker.providers.base.Image.ImageType.JPEG;
import static net.datafaker.providers.base.Image.ImageType.PNG;
import static net.datafaker.providers.base.Image.ImageType.SVG;
import static net.datafaker.providers.base.Image.ImageType.TIFF;

/**
 * Generates base64 encoded raster and vector images.
 *
 * @since 2.3.0
 */
public class Image extends AbstractProvider<BaseProviders> {

    private static final int DEFAULT_WIDTH = 256;

    private static final int DEFAULT_HEIGHT = 256;

    public enum ImageType {

        // See https://developer.mozilla.org/en-US/docs/Web/HTTP/Basics_of_HTTP/MIME_types/Common_types
        BMP("image/bmp"),
        GIF("image/gif"),
        JPEG("image/jpeg"),
        PNG("image/png"),
        SVG("image/svg+xml"),
        TIFF("image/tiff");

        private final String mimeType;

        ImageType(String mimeType) {
            this.mimeType = mimeType;
        }

        public String getMimeType() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }

    protected Image(BaseProviders faker) {
        super(faker);
    }

    public String base64BMP() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String base64GIF() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String base64JPG() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String base64JPEG() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String base64PNG() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String base64SVG() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String base64TIFF() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String base64(Base64ImageRuleConfig config) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public record Base64ImageRuleConfig(ImageType imageType, int width, int height) {
    }

    public static class ImageBuilder {

        private ImageType imageType = PNG;

        private int width = DEFAULT_WIDTH;

        private int height = DEFAULT_HEIGHT;

        private ImageBuilder() {
        }

        public static ImageBuilder builder() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Base64ImageRuleConfig build() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public ImageBuilder type(ImageType imageType) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public ImageBuilder width(int width) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public ImageBuilder height(int height) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }

    private String generateBase64RasterImage(ImageType imageType, int width, int height) {
        BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics2D graphics = bufferedImage.createGraphics();
        int boxSize = Math.max(1, width / 8);
        // Fill the image with white background
        graphics.setColor(WHITE);
        graphics.fillRect(0, 0, width, height);
        // Draw random colored boxes
        for (int y = 0; y < height; y += boxSize) {
            for (int x = 0; x < width; x += boxSize) {
                Color randomColor = randomColor();
                graphics.setColor(randomColor);
                graphics.fillRect(x, y, boxSize, boxSize);
            }
        }
        graphics.dispose();
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            ImageIO.write(bufferedImage, imageType.name(), baos);
            byte[] imageBytes = baos.toByteArray();
            return "data:" + imageType.mimeType + ";base64," + Base64.getEncoder().encodeToString(imageBytes);
        } catch (IOException e) {
            throw new RuntimeException("Failed to generate image %s of size %sx%s".formatted(imageType, width, height), e);
        }
    }

    private String generateBase64VectorImage(ImageType imageType, int width, int height) {
        StringBuilder svg = new StringBuilder();
        svg.append("<svg xmlns=\"http://www.w3.org/2000/svg\" width=\"").append(DEFAULT_WIDTH).append("\" height=\"").append(DEFAULT_HEIGHT).append("\">");
        int boxSize = Math.max(1, width / 8);
        for (int y = 0; y < height; y += boxSize) {
            for (int x = 0; x < width; x += boxSize) {
                Color randomColor = randomColor();
                String color = String.format("#%02x%02x%02x", randomColor.getRed(), randomColor.getGreen(), randomColor.getBlue());
                svg.append("<rect x=\"").append(x).append("\" y=\"").append(y).append("\" width=\"").append(boxSize).append("\" height=\"").append(boxSize).append("\" fill=\"").append(color).append("\"/>");
            }
        }
        svg.append("</svg>");
        String svgString = svg.toString();
        String base64Svg = Base64.getEncoder().encodeToString(svgString.getBytes());
        return "data:" + imageType.mimeType + ";base64," + base64Svg;
    }

    private Color randomColor() {
        // Convert the bytes to unsigned integers (0-255) for RGB
        byte[] randomBytes = faker.random().nextRandomBytes(3);
        int red = randomBytes[0] & 0xFF;
        int green = randomBytes[1] & 0xFF;
        int blue = randomBytes[2] & 0xFF;
        return new Color(red, green, blue);
    }
}

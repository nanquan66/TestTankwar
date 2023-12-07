package com.tankwar.core;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;

/**
 * @author Andres Navarro
 * TODO add more synchronization
 */
public class Sprite extends Layer {

    /**
     * transform constants
     */
    public static final int TRANS_NONE = 0;
    public static final int TRANS_ROT90 = 5;
    public static final int TRANS_ROT180 = 3;
    public static final int TRANS_ROT270 = 6;
    public static final int TRANS_MIRROR = 2;
    public static final int TRANS_MIRROR_ROT90 = 7;
    public static final int TRANS_MIRROR_ROT180 = 1;
    public static final int TRANS_MIRROR_ROT270 = 4;

    /**
     * current frame index (within the sequence, not the absolut index)
     */
    private int frame;

    /**
     * the frame sequence
     * null if the default is used
     */
    private int sequence[];

    /**
     * coordinate of the reference pixel
     */
    private int refX;
    private int refY;

    /**
     * number of cols and rows within the image
     */
    private int cols;
    private int rows;

    /**
     * the transform aplied to this sprite
     */
    private int transform;

    /**
     * the collision rectangle
     */
    private int collX;
    private int collY;
    private int collWidth;
    private int collHeight;

    /**
     * arrays for the collision detection at pixel level
     */
    private int rgbData[];
    private int rgbDataAux[];

    /**
     * the image containg the frames
     */
    private Bitmap img;

    /**
     * @param otherSprite
     * @roseuid 652795D2031D
     */
    public Sprite(Sprite otherSprite) {
        super(0, 0, 0, 0, true);
    }

    /**
     * @param img
     * @param frameWidth
     * @param frameHeight
     * @roseuid 652795970395
     */
    public Sprite(Bitmap img, int frameWidth, int frameHeight) {
        super(0, 0, 0, 0, true);
    }

    /**
     * @param img
     * @roseuid 65279597038A
     */
    public Sprite(Bitmap img) {
        super(0, 0, 0, 0, true);

    }

    /**
     * @param image
     * @param iX
     * @param iY
     * @param pixelLevel
     * @return boolean
     * @roseuid 6527959703A8
     */
    public final boolean collidesWith(Bitmap image, int iX, int iY, boolean pixelLevel) {
        return true;
    }

    /**
     * @param x
     * @param y
     * @roseuid 6527959703DA
     */
    public void defineReferencePixel(int x, int y) {

    }

    /**
     * @return int
     * @roseuid 6527959703E3
     */
    public int getRefPixelX() {
        return 0;
    }

    /**
     * @return int
     * @roseuid 652795980002
     */
    public int getRefPixelY() {
        return 0;
    }

    /**
     * @param x
     * @param y
     * @roseuid 652795980008
     */
    public void setRefPixelPosition(int x, int y) {

    }

    /**
     * @param x
     * @param y
     * @param width
     * @param height
     * @roseuid 652795980012
     */
    public void defineCollisionRectangle(int x, int y, int width, int height) {

    }

    /**
     * @param sequence
     * @roseuid 65279598001E
     */
    public void setFrameSequence(int[] sequence) {

    }

    /**
     * @return int
     * @roseuid 652795980027
     */
    public final int getFrame() {
        return 0;
    }

    /**
     * @return int
     * @roseuid 65279598002F
     */
    public int getFrameSequenceLength() {
        return 0;
    }

    /**
     * @param frame
     * @roseuid 652795980037
     */
    public void setFrame(int frame) {

    }

    /**
     * @roseuid 65279598003F
     */
    public void nextFrame() {

    }

    /**
     * @roseuid 652795980047
     */
    public void prevFrame() {

    }

    /**
     * @param img
     * @param frameWidth
     * @param frameHeight
     * @roseuid 65279598004E
     */
    public void setImage(Bitmap img, int frameWidth, int frameHeight) {

    }

    /**
     * @param g
     * @roseuid 652795980073
     */
    public final void paint(Canvas g) {

    }

    /**
     * @return int
     * @roseuid 652795980081
     */
    public int getRawFrameCount() {
        return 0;
    }

    /**
     * @param transform
     * @roseuid 652795980089
     */
    public void setTransform(int transform) {

    }

    /**
     * Helper methods that check for collisions They are at the end of the file
     * because of the length of the code
     * For both methods, the second and third parameters are significant only if
     * o is an Bitmap, otherwise they are ignored
     *
     * @param o
     * @param oX
     * @param oY
     * @return boolean
     * @roseuid 652795980092
     */
    private synchronized boolean collidesWith(Object o, int oX, int oY) {
        return true;
    }

    /**
     * @param o
     * @param oX
     * @param oY
     * @return boolean
     * @roseuid 65279598009F
     */
    private synchronized boolean collidesWithPixelLevel(Object o, int oX, int oY) {
        return true;
    }

    /**
     * @param img
     * @param rgbData
     * @param offset
     * @param scanlength
     * @param x
     * @param y
     * @param width
     * @param height
     * @roseuid 6527959800AC
     */
    static void getRGB(Bitmap img, int[] rgbData, int offset, int scanlength, int x, int y, int width, int height) {

    }

    /**
     * @param layer
     * @param pixelLevel
     * @return boolean
     * @roseuid 652795D20347
     */
    public final boolean collidesWith(TiledLayer layer, boolean pixelLevel) {
        return true;
    }

    /**
     * @param otherSprite
     * @param pixelLevel
     * @return boolean
     * @roseuid 652795D2035D
     */
    public final boolean collidesWith(Sprite otherSprite, boolean pixelLevel) {
        return true;
    }

    /**
     * @param transform2
     * @return android.graphics.Matrix
     * @roseuid 652795D30032
     */
    private Matrix createTransformationMatrix(final int transform2) {
        return null;
    }
}

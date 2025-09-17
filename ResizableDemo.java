interface Resizable {
    void resizeWidth(int width);
    void resizeHeight(int height);
}
class Rectangle implements Resizable {
    private int width;
    private int height;
    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public void resizeWidth(int width) {
        this.width = width;
        System.out.println("Width resized to: " + this.width);
    }
    public void resizeHeight(int height) {
        this.height = height;
        System.out.println("Height resized to: " + this.height);
    }
    public int getArea() {
        return width * height;
    }
    public void display() {
        System.out.println("Rectangle[Width:" + width + ", Height:" + height + ", Area:" + getArea() + "]");
    }
}
public class ResizableDemo {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10, 14);
        rect.display();
        rect.resizeWidth(13);
        rect.resizeHeight(4);
        rect.display();
    }
}


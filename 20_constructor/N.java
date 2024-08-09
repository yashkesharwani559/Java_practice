class Shape {
    int length;
    int width, height;

    Shape(int length) {
        this.length = length;
    }

    Shape(int length, int width) {
        this(length);

        this.width = width;
    }

    Shape(int length, int width, int height) {
        this(length, width);
        this.height = height;
    }
}

class N {
    public static void main(String[] args) {
        Shape s = new Shape(12, 13, 14);
    }
}
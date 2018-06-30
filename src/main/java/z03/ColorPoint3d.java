package z03;

import java.util.Objects;

public class ColorPoint3d {

    double x;
    double y;
    double z;

    String color;

    public ColorPoint3d(double x, double y, double z, String color) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ColorPoint3d colorPoint3d = (ColorPoint3d) o;
        return Double.compare(colorPoint3d.x, x) == 0 &&
                Double.compare(colorPoint3d.y, y) == 0 &&
                Double.compare(colorPoint3d.z, z) == 0 &&
                Objects.equals(color, colorPoint3d.color);
    }

    @Override
    public int hashCode() {

        return Objects.hash(x, y, z, color);
    }
}


public class Triangle
{
    public String triangle_type(int firstSide, int secondSide, int thirdSide) {
        if (firstSide == 0 || secondSide == 0 || thirdSide == 0) {
            return "Invalid triangle";
        } else if (firstSide == secondSide && firstSide == thirdSide) {
            return "Equilateral triangle";
        } else if (firstSide == secondSide || firstSide == thirdSide || secondSide == thirdSide) {
            return "Isosceles triangle";
        } else {
            return "Scalene triangle";
        }
    }
}
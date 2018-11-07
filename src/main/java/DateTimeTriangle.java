import java.util.Date;

public class DateTimeTriangle
{
    public static void main(String [ ] args)
    {
        Date date = new Date();
        DateClass dateClass = new DateClass(date);
        System.out.println(dateClass.getDate());
        dateClass.Increment(5);
        System.out.println(dateClass.getDate());

        Triangle triangleClass = new Triangle();
        System.out.println(triangleClass.triangle_type(0,1,2));
        System.out.println(triangleClass.triangle_type(4,2,4));
        System.out.println(triangleClass.triangle_type(6,2,4));
        System.out.println(triangleClass.triangle_type(6,6,6));
    }
}

public class Circle {

    double pi = 3.14;

    double area(int r){
        Operator op = new Operator(); //aggregation
        int _area = op.Square(r);
        return _area * pi;
    }

}

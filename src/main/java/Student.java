public class Student {
//    Student(int id, String name, String secondName, int year, double averageMathMark, double averageEconomicMark, double averageLeanguageMark){
//        System.out.println((averageEconomicMark + averageMathMark + averageLeanguageMark) / 3);
//    }
    int id;
    String name;
    String secondName;
    int year;
    double averageMathMark;
    double averageEconomicMark;
    double averageLeanguageMark;

    double averageGrade(double averageMathMark, double averageEconomicMark,double averageLeanguageMark){
        double averageGrade = (averageMathMark + averageEconomicMark + averageLeanguageMark) / 3;
        return averageGrade;
    }

}

class StudentTest{

    public static void main(String[] args) {
        Student den = new Student();

        System.out.println(den.averageGrade(5.5, 7.0, 8.6));

//        Student den = new Student();
//        den.averageMathMark = 8;
//        den.averageEconomicMark = 6;
//        den.averageLeanguageMark = 10;
//        System.out.println((den.averageEconomicMark + den.averageMathMark + den.averageLeanguageMark) / 3);
//        Student karyna = new Student();
//        karyna.averageLeanguageMark = 5;
//        karyna.averageEconomicMark = 8;
//        karyna.averageMathMark = 6;
//        System.out.println((karyna.averageLeanguageMark + karyna.averageEconomicMark + karyna.averageMathMark) / 3);
//        Student borys = new Student();
//        borys.averageMathMark = 3;
//        borys.averageEconomicMark = 6;
//        borys.averageLeanguageMark = 4;
//        System.out.println((borys.averageMathMark + borys.averageEconomicMark + borys.averageLeanguageMark) / 3);

    }}

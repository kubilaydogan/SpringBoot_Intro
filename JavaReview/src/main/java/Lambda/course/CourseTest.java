package Lambda.course;

public class CourseTest {
    public static void main(String[] args) {

        Course course = new Java();
        course.study();

        course = new Selenium();
        course.study();

        //Anonymous Inner Class
        Course java = new Course() {
            @Override
            public void study() {
                System.out.println("Studying Java");
            }
        };

        java.study();

        Course selenium = new Course(){
            @Override
            public void study() {
                System.out.println("Studying Selenium");
            }
        };

        selenium.study();

        //Lambda Expression
        Course javaCourse = () -> System.out.println("Studying Java");
        javaCourse.study();

        Course seleniumCourse = () -> System.out.println("Studying Selenium");
        seleniumCourse.study();



    }
}

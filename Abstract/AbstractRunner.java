public class AbstractRunner {
    public static void main(String[] args) {
        // Dream Instances
        Dream sweetDream = new SweetDream();
        sweetDream.imagine();

        Dream nightmare = new Nightmare();
        nightmare.visualize();

        // Polygon Instances
        Polygon triangle = new Triangle();
        triangle.calculateArea();

        Polygon square = new Square();
        square.sidesInfo();

        // Job Instances
        Job teacher = new Teacher();
        teacher.work();

        Job engineer = new Engineer();
        engineer.attendMeeting();

        // Road Instances
        Road highway = new Highway();
        highway.build();

        Road street = new Street();
        street.maintain();

        // Projects Instances
        Projects itProject = new ITProjects();
        itProject.start();

        Projects constructionprojects = new Constructionproject();
        Constructionprojects.plan();
    }
}
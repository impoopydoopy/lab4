public class Student {
    private static final int MONEY = 50;

    private final String surname;
    private final String name;
    private final String group;
    private int course;
    private double averageMark;

    Student(String s, String n, String g, int c, double av)
    {
        surname = s;
        name = n;
        group = g;

        if(c > 0 && c <= 6)
        course = c;
        else course = 1;

        if(av > 0 && av <= 100)
        averageMark = av;
        else av = 0;
    }

    public String getSurname() { return surname; }
    public String getName() { return name; }
    public String getGroup() { return group; }

    public void upgradeCourse()
    {
        course++;
        System.out.println("Студента " + surname + " переведено на курс: " + course);
    }
    public int getCourse() { return course; }

    public void setAverageMark(double av)
    {
        if(av > 0 && av <= 100) averageMark = av;
        else av = 0;
    }
    public double getAverageMark() { return averageMark; }

    public double getGrants() { return averageMark*MONEY; }
}

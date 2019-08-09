public class school {
  public static void main(String[] args) {
    Student student1 = new Student("Ling Ling","1001 101 Avenue");
    System.out.println(student1);
    student1.addCourseGrade("math",110);
    student1.addCourseGrade("violin",400);
    student1.printGrades();
  }

}
class Student {
  private String name;
  private String address;
  private int numCourses = 0;
  private String[] courses = new String[30];
  private int[] grades = new int[30];

  public Student(String name, String address){
    this.name = name;
    this.address = address;
  }

  public String getName() {
    return this.name;
  }

  public String getAddress() {
    return this.address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String toString() {
     return this.name+"("+this.address+")";
  }

  public void addCourseGrade (String course, int grade) {
      this.courses[numCourses]=course;
      this.grades[numCourses]=grade;
      numCourses++;
  }

  public void printGrades() {
    System.out.print(this.name);
    for (int i=0; i<numCourses; i++) {
      System.out.print(", "+this.courses[i]+":"+this.grades[i]);
    }
    System.out.println("");
  }

  public double getAverageGrade() {
    int k=0;
    for (int i=0; i<numCourses; i++) {
      k = k + this.grades[i];
    }
    return k;

  }

}

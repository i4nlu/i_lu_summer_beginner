public class email {
  public static void main(String[] args) {
        Author author1 = new Author("Ian Lu","luyian@gmail.com",'m');
        System.out.println(author1);
  }

}
class Author {
  private String name;
  private String email;
  private char gender;

  public Author(String name, String email, char gender){
    this.name = name;
    this.email = email;
    this.gender = gender;
  }

  public String getName() {
    return this.name;
  }

  public String getEmail() {
    return this.email;
  }

  public char getGender() {
    return this.gender;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String toString() {
     return this.name+" ("+this.gender+") at "+this.email;
  }
}

import java.util.Scanner;
public class Login extends PersonalData {
    PersonalData Personal;
    private String uname;
    private String pass;
    Scanner read = new Scanner(System.in);

    public Login() {
    }

    public void SignIn(){
        System.out.print("Username : ");
        Username = read.next();
        System.out.print("E-mail   : ");
        Email = read.next();
        System.out.print("Password : ");
        Pass = read.next();
    }

    public boolean login(){
        System.out.print("Username : ");
        uname = read.next();
        System.out.print("Password : ");
        pass = read.next();
        if (uname.equalsIgnoreCase(Personal.getUsername()) && pass.equalsIgnoreCase(Personal.getPass())) {
            System.out.println("Login Succes!");
            return true;

        }
        else {
            System.out.println("Username atau Password Salah");
            return false;
        }
    }


}

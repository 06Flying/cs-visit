public class hello{

    public void greetUser(){
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        scanner.close();
        System.out.println("Hello " + name +"!");
    }

    public static void main(String[] args) {
        hello hello = new hello();
        hello.greetUser();
    }


}

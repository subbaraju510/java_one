package tom;

public class Temposfile {
	public static void main(String[] args) {
       // System.getProperties().list(System.out);
       String  OS = System.getProperty("os.name");
       System.out.println("os"+OS);
       String currentDir = System.getProperty("user.dir");
       System.out.println("Current dir using System:" +currentDir);
    }

}

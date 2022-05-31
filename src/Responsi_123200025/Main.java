package Responsi_123200025;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ViewAslab view = new ViewAslab();
        ModAslab model = new ModAslab();
        control controller = new control(model, view);
    }
    
}

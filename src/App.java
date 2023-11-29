public class App {
    public static void main(String[] args) throws Exception {
        ritaRektangel(20, 8);
    }

    public static void ritaRektangel(int höjd, int bredd) {
        for (int i = 0; i < höjd; i++) {
            for (int j = 0; j < bredd; j++) {
                System.out.print("*");
            }
            System.out.println(); 
        }
    }
}

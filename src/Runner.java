public class Runner {
    public static void main(String[] args) {
        String[][] face = new String[5][5];
        JackOLantern face1 = new JackOLantern(face);

        face1.fill("X");
        face1.edit("0", 2, 2);
        face1.edit("0", 2, 4);
        face1.edit("<", 3, 3);
        face1.edit("(", 4, 2);
        face1.edit(")", 4, 4);
        face1.edit("-", 3, 3);
        System.out.println(face1);
    }
}

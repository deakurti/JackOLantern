public class Runner {
    public static void main(String[] args) {
        String[][] face = new String[5][8];
        JackoLantern face1 = new JackoLantern(face);

        face1.fill("X");
        face.edit(" ", 0, 0);
        face.edit(" ", 4, 7);
        face.edit(" ", 0, 7);
        face.edit(" ", 4, 0);

        face.edit("0", 1, 2);
        face.edit("0", 1, 5);
        face.edit("^", 2, 3);
        face.edit("^", 2, 4);
        face.edit(" ", 0, 0);
    }
}

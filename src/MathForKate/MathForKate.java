package MathForKate;

import java.io.FileWriter;

public class MathForKate {

    public static String plusTwo(int numOfVar, int numOfTasks, String sing) {
        int i = 1;
        int x, y, z;
        String s = "";
        String xStr = "";
        String yStr = "";
        String zStr = "";

        if (numOfVar == 2) {
            if (sing.equals("+")) {
                while (i <= numOfTasks) {
                    x = (int)(Math.random() * 20);
                    y = (int)(Math.random() * 20);
                    if (x + y > 20 || x == 0 || y == 0) continue;
                    else {
                        if (x < 10) xStr = (x + " ");
                        else xStr = Integer.toString(x);
                        if (y < 10) yStr = (y + " ");
                        else yStr = Integer.toString(y);
                        s = s + (xStr + " + " + yStr + " = ____      ");
                        if (i % 3 == 0 && i != 0) s = s + "\n";
                        i++;
                    }
                }
            }
            if (sing.equals("-")) {
                while (i <= numOfTasks) {
                    x = (int)(Math.random() * 20);
                    y = (int)(Math.random() * 20);
                    if (x - y < 0 || x == 0 || y == 0) continue;
                    else {
                        if (x < 10) xStr = (x + " ");
                        else xStr = Integer.toString(x);
                        if (y < 10) yStr = (y + " ");
                        else yStr = Integer.toString(y);
                        s = s + (xStr + " - " + yStr + " = ____      ");
                        if (i % 3 == 0 && i != 0) s = s + "\n";
                        i++;
                    }
                }
            }
        }

        if (numOfVar == 3) {
            if (sing.equals("+-")) {
                while (i <= numOfTasks) {
                    x = (int)(Math.random() * 20);
                    y = (int)(Math.random() * 20);
                    z = (int)(Math.random() * 20);
                    if ((x + y - z) > 20 || (x + y - z) < 0 || (x + y) > 20 || x == 0 || y == 0 || z == 0) continue;
                    else {
                        if (x < 10) xStr = (x + " ");
                        else xStr = Integer.toString(x);
                        if (y < 10) yStr = (y + " ");
                        else yStr = Integer.toString(y);
                        if (z < 10) zStr = (z + " ");
                        else zStr = Integer.toString(z);
                        s = s + (xStr + " + " + yStr + " - " + zStr + " = ____      ");
                        if (i % 3 == 0 && i != 0) s = s + "\n";
                        i++;
                    }
                }
            }
            if (sing.equals("-+")) {
                while (i <= numOfTasks) {
                    x = (int)(Math.random() * 20);
                    y = (int)(Math.random() * 20);
                    z = (int)(Math.random() * 20);
                    if ((x - y + z) > 20 || (x - y + z) < 0 || (x - y) < 0 || x == 0 || y == 0 || z == 0) continue;
                    else {
                        if (x < 10) xStr = x + " ";
                        else xStr = Integer.toString(x);
                        if (y < 10) yStr = y + " ";
                        else yStr = Integer.toString(y);
                        if (z < 10) zStr = z + " ";
                        else zStr = Integer.toString(z);
                        s = s + (xStr + " - " + yStr + " + " + zStr + " = ____      ");
                        if (i % 3 == 0 && i != 0) s = s + "\n";
                        i++;
                    }
                }
            }
        }
        return (s + "\n");
    }


    public static void main(String[] args) throws Exception {

        FileWriter fw = new FileWriter("MathForKate.txt");
        fw.write(plusTwo(3, 21, "+-"));
        fw.write(plusTwo(3, 21, "-+"));
        fw.write(plusTwo(2, 21, "+"));
        fw.write(plusTwo(2, 21, "-"));
        fw.close();
    }
}

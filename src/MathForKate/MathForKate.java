package MathForKate;

import java.io.FileWriter;

public class MathForKate {

    private static int numOfTasks;
    private static int minVal;
    private static int maxVal;

    public void setNumOfTasks(int numOfTasks) {
        this.numOfTasks = numOfTasks;
    }

    public void setMinVal(int minVal) {
        this.minVal = minVal;
    }

    public void setMaxVal(int maxVal) {
        this.maxVal = maxVal;
    }


    public static String plusTwo() {
        int i = 1;
        int x, y;
        String s = "";
        String xStr, yStr;

        while (i <= numOfTasks) {
            x = (int) (Math.random() * maxVal);
            y = (int) (Math.random() * maxVal);
            if (x + y > maxVal || x == 0 || y == 0) continue;
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
        return (s + "\n");
    }

    public static String minusTwo() {
        int i = 1;
        int x, y;
        String s = "";
        String xStr, yStr;

        while (i <= numOfTasks) {
            x = (int) (Math.random() * maxVal);
            y = (int) (Math.random() * maxVal);
            if (x - y < minVal || x == 0 || y == 0) continue;
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
        return (s + "\n");
    }

    public static String plusMinusThree() {
        int i = 1;
        int x, y, z;
        String s = "";
        String xStr, yStr, zStr;

        while (i <= numOfTasks) {
            x = (int) (Math.random() * maxVal);
            y = (int) (Math.random() * maxVal);
            z = (int) (Math.random() * maxVal);
            if ((x + y - z) > maxVal || (x + y - z) < minVal || (x + y) > maxVal || x == 0 || y == 0 || z == 0) continue;
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
        return (s + "\n");
    }
    public static String minusPlusThree() {
        int i = 1;
        int x, y, z;
        String s = "";
        String xStr, yStr, zStr;

        while (i <= numOfTasks) {
            x = (int)(Math.random() * maxVal);
            y = (int)(Math.random() * maxVal);
            z = (int)(Math.random() * maxVal);
            if ((x - y + z) > maxVal || (x - y + z) < minVal || (x - y) < minVal || x == 0 || y == 0 || z == 0) continue;
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
        return (s + "\n");
    }


    public static void main(String[] args) throws Exception {

        FileWriter fw = new FileWriter("MathForKate.txt");
        fw.write(plusTwo());
        fw.write(minusTwo());
        fw.write(plusMinusThree());
        fw.write(minusPlusThree());
        fw.close();
    }
}

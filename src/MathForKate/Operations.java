package MathForKate;

public class Operations {
    private static int numOfTasks;
    private static int minVal;
    private static int maxVal;

    public static void setNumOfTasks(int numberOfTasks) {
        numOfTasks = numberOfTasks;
    }

    public static void setMinVal(int minimumVal) {
        minVal = minimumVal;
    }

    public static void setMaxVal(int maximumVal) {
        maxVal = maximumVal;
    }

    static String plusTwo() {
        int i = 1;
        int x, y;
        String resultPlus = "";
        String xStr, yStr;

        while (i <= numOfTasks) {
            x = (int) (Math.random() * (Math.abs(maxVal) - Math.abs(minVal)));
            y = (int) (Math.random() * (Math.abs(maxVal) - Math.abs(minVal)));
            if (x + y > maxVal || x == 0 || y == 0) continue;
            else {
                if (x < 10) xStr = (x + " ");
                else xStr = Integer.toString(x);
                if (y < 10) yStr = (y + " ");
                else yStr = Integer.toString(y);
                resultPlus += (xStr + " + " + yStr + " = ____      ");
                if (i % 3 == 0 && i != 0) resultPlus += "\n";
                i++;
            }
        }
        return (resultPlus + "\n");
    }

    static String minusTwo() {
        int i = 1;
        int x, y;
        String resultMinus = "";
        String xStr, yStr;

        while (i <= numOfTasks) {
            x = (int) (Math.random() * (Math.abs(maxVal) - Math.abs(minVal)));
            y = (int) (Math.random() * (Math.abs(maxVal) - Math.abs(minVal)));
            if (x - y < minVal || x == 0 || y == 0) continue;
            else {
                if (x < 10) xStr = (x + " ");
                else xStr = Integer.toString(x);
                if (y < 10) yStr = (y + " ");
                else yStr = Integer.toString(y);
                resultMinus += (xStr + " - " + yStr + " = ____      ");
                if (i % 3 == 0 && i != 0) resultMinus += "\n";
                i++;
            }
        }
        return (resultMinus + "\n");
    }

    static String plusMinusThree() {
        int i = 1;
        int x, y, z;
        String resultPlusMinus = "";
        String xStr, yStr, zStr;

        while (i <= numOfTasks) {
            x = (int) (Math.random() * (Math.abs(maxVal) - Math.abs(minVal)));
            y = (int) (Math.random() * (Math.abs(maxVal) - Math.abs(minVal)));
            z = (int) (Math.random() * (Math.abs(maxVal) - Math.abs(minVal)));
            if ((x + y - z) > maxVal || (x + y - z) < minVal || (x + y) > maxVal || x == 0 || y == 0 || z == 0) continue;
            else {
                if (x < 10) xStr = (x + " ");
                else xStr = Integer.toString(x);
                if (y < 10) yStr = (y + " ");
                else yStr = Integer.toString(y);
                if (z < 10) zStr = (z + " ");
                else zStr = Integer.toString(z);
                resultPlusMinus += (xStr + " + " + yStr + " - " + zStr + " = ____      ");
                if (i % 3 == 0 && i != 0) resultPlusMinus += "\n";
                i++;
            }
        }
        return (resultPlusMinus + "\n");
    }
    static String minusPlusThree() {
        int i = 1;
        int x, y, z;
        String resultMinusPlus = "";
        String xStr, yStr, zStr;

        while (i <= numOfTasks) {
            x = (int)(Math.random() * (Math.abs(maxVal) - Math.abs(minVal)));
            y = (int)(Math.random() * (Math.abs(maxVal) - Math.abs(minVal)));
            z = (int)(Math.random() * (Math.abs(maxVal) - Math.abs(minVal)));
            if ((x - y + z) > maxVal || (x - y + z) < minVal || (x - y) < minVal || x == 0 || y == 0 || z == 0) continue;
            else {
                if (x < 10) xStr = x + " ";
                else xStr = Integer.toString(x);
                if (y < 10) yStr = y + " ";
                else yStr = Integer.toString(y);
                if (z < 10) zStr = z + " ";
                else zStr = Integer.toString(z);
                resultMinusPlus += (xStr + " - " + yStr + " + " + zStr + " = ____      ");
                if (i % 3 == 0 && i != 0) resultMinusPlus += "\n";
                i++;
            }
        }
        return (resultMinusPlus + "\n");
    }
}

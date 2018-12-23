package MathForKate;

import java.io.FileWriter;
import java.io.IOException;

public class MathFileWriter {
    FileWriter fw;

    {
        try {
            fw = new FileWriter("MathForKate.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void plus() throws Exception {
        fw.write(Operations.plusTwo());
    }

    public void minus() throws Exception {
        fw.write(Operations.minusTwo());
    }

    public void plusMinus() throws Exception {
        fw.write(Operations.plusMinusThree());
    }

    public void minusPlus() throws Exception {
        fw.write(Operations.minusPlusThree());
    }

}

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
        fw.close();
    }

    public void minus() throws Exception {
        fw.write(Operations.minusTwo());
        fw.close();
    }

    public void plusMinus() throws Exception {
        fw.write(Operations.plusMinusThree());
        fw.close();
    }

    public void minusPlus() throws Exception {
        fw.write(Operations.minusPlusThree());
        fw.close();
    }

    public void pMmP() throws Exception {
        fw.write(Operations.plusMinusThree());
        fw.write(Operations.minusPlusThree());
        fw.close();
    }

    public void pm() throws Exception {
        fw.write(Operations.plusTwo());
        fw.write(Operations.minusTwo());
        fw.close();
    }

    public void all() throws Exception {
        fw.write(Operations.plusTwo());
        fw.write(Operations.minusTwo());
        fw.write(Operations.plusMinusThree());
        fw.write(Operations.minusPlusThree());
        fw.close();
    }
}

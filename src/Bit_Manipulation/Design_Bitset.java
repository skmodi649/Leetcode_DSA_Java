package Bit_Manipulation;

public class Design_Bitset {

    // ******* Own algorithm : Producing TLE ****************
     /*  public int[] binarr;
    public Bitset(int size) {
        binarr = new int[size];
        Arrays.fill(binarr,0);
    }

    public void fix(int idx) {
        binarr[idx] = 1;
    }

    public void unfix(int idx) {
        binarr[idx] = 0;
    }

    public void flip() {
        for(int i = 0 ; i < binarr.length ; i++){
            if(binarr[i] == 0)
                binarr[i] = 1;
            else
                binarr[i] = 0;
        }
    }

    public boolean all() {
        for(int i = 0 ; i < binarr.length ; i++){
            if(binarr[i] != 1)
                return false;
        }
        return true;
    }

    public boolean one() {
        int count = 0;
        for(int i = 0 ; i < binarr.length ; i++){
            if(binarr[i] == 1)
                count++;
            if(count >= 1)
                return true;
        }
            return false;
    }

    public int count() {
        int count = 0;
        for(int i = 0 ; i < binarr.length ; i++){
            if(binarr[i] == 1)
                count++;
            else
                count+=0;
        }
        return count;
    }

    public String toString() {
        String binary = "";
        for(int i = 0 ; i < binarr.length ; i++){
            if(binarr[i] == 0)
                binary = binary + '0';
            else
                binary = binary + '1';
        }
        return binary;
    } */

  // ********** Optimised solution ********************************
    private final boolean[] isOne;
    private int oneCount = 0;
    private boolean flipped = false;

    public Design_Bitset(int size) {
        isOne = new boolean[size];
    }

    public void fix(int idx) {
        if (flipped) {
            if (isOne[idx]) {
                isOne[idx] = false;
                oneCount++;
            }
        } else {
            if (!isOne[idx]) {
                isOne[idx] = true;
                oneCount++;
            }
        }
    }

    public void unfix(int idx) {
        if (flipped) {
            if (!isOne[idx]) {
                isOne[idx] = true;
                oneCount--;
            }
        } else {
            if (isOne[idx]) {
                isOne[idx] = false;
                oneCount--;
            }
        }
    }

    public void flip() {
        flipped = !flipped;
        oneCount = isOne.length - oneCount;
    }

    public boolean all() {
        return oneCount == isOne.length;
    }

    public boolean one() {
        return oneCount >= 1;
    }

    public int count() {
        return oneCount;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (boolean one : isOne) {
            boolean value = flipped ? !one : one;
            sb.append(value ? "1" : "0");
        }
        return sb.toString();
    }

/**
 * Your Bitset object will be instantiated and called as such:
 * Bitset obj = new Bitset(size);
 * obj.fix(idx);
 * obj.unfix(idx);
 * obj.flip();
 * boolean param_4 = obj.all();
 * boolean param_5 = obj.one();
 * int param_6 = obj.count();
 * String param_7 = obj.toString();
 */
}

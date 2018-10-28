package su.birukov.algorithms;

public class StandartSorting {
    int[] seq;

    StandartSorting (int[] seq) {
        this.seq = seq;
    }

    public int[] sort () {
        int[] sortedSeq = new int[seq.length];
        int count = seq.length + 1;

            for (int i = 0; i <seq.length ; i++) {
                int highestNumIndex = 0;

                for (int j = 0; j <seq.length ; j++) {
                    if (seq[j] >= seq[highestNumIndex]) {
                        highestNumIndex = j;
                    }
                }

                sortedSeq[i] = seq[highestNumIndex];
                seq[highestNumIndex] = -2147483648;

            }

        return sortedSeq;
    }
}

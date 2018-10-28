package su.birukov.algorithms;

class BinarySearch {
    int[] seq;

    BinarySearch(int[] seq) {
        this.seq = seq;
    }

    public Integer search(int target) {
        int low = 0;
        int high = seq.length - 1;

        while(low <= high) {
            int mid = (low + high) / 2;
            int guess = seq[mid];

            if (guess == target) {
                return mid;
            }

            if (guess > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return null;
    }

}

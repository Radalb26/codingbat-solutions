public int diff21(int n) {
    int difference = Math.abs(n - 21);
    if (n > 21) {
        return 2 * difference;
    } else {
        return difference;
    }
}

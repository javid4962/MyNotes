class labeledLoop {
    public static void main(String[] args) {
        int i, j;
        outer: 
        for (i = 1; i <= 3; i++) {
            System.out.println(i + " outer loop");
            inner: for (j = 1; j <= 5; j++) {
                System.out.println(j + " inner loop");
                if(j == 3)
                break inner;
            }
        }
    }
}
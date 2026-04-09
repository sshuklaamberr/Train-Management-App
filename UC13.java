class UC13 {
    public static void main(String[] args) {
        long start = System.nanoTime();
        for(int i=0;i<1000;i++);
        long end = System.nanoTime();
        System.out.println(end-start);
    }
}
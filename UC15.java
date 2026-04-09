class UC15 {
    public static void main(String[] args) {
        try {
            int x = 10/0;
        } catch(Exception e){
            System.out.println("Error handled");
        }
    }
}
class Prog1 {
    public static void main(String[] args) {
        String name;
        Scanner in = new Scanner(System.in);
        int position;
        name = "Hello How Are You";
        System.out.println("Enter which position character you want:");
        position = in.nextInt();
        System.out.println(name.charAt(position));
        System.out.println(name.compareTo("hello How Are You"));
        System.out.println(name.compareToIgnoreCase("HELLO HOW ARE YOU"));
        System.out.println(name.concat("Koushik"));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
    }
}
class Greeter {
    private static String greet(String name){
        return "Hello, " + name +"!";
    }

    public static void main(String[] args){
        for(int i = 0; i < args.length; i++){
            System.out.println(greet(args[i]));
        }
    }
}
public class printArgs {
    public void Arguments(String [] args){
        if (args.length == 0) {
            System.out.println("No arguments given");
        }
        for(int i = 0; i < args.length; i++) {
            System.out.println("Eingabe "+ i+1 + ": >" + args[i]);
        }
    }
}


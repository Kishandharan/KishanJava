public class FavoriteColorFinder{
    public static void main(String[] args) {
        String name = "sawjanya";
        switch(name){
            case "prajwal":
                System.out.println("Prajwal likes red");
            break;

            case "dhyan":
            case "amruthashree":
                System.out.println("Dhyan & Amruthashree likes blue"); 
            break;

            case "anarghya":
                System.out.println("Anarghya likes black");
            break;
            
            default:
               System.out.println("The value provided is out of option"); 
            break;
        }
    }
}

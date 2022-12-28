public class Lab01_Q3 {

    public static void main(String[] args) {
    

        


    //Variables_double

        final long world = 510072000;
        double turkey = (world * 0.1536) / 100 ;
        final long turkey_l = (long) turkey;

        double world_water = (world * 70.8) / 100 ;
        double world_dry = world - world_water;

        double turkey_water = turkey_l * 1.3 / 100;
        double turkey_dry = turkey_l - turkey_water;

    //Variables_long

        long world_dry_l = (long) world_dry;
        long world_water_l = (long) world_water;

        long turkey_water_l = (long) turkey_water;
        long turkey_dry_l = (long) turkey_dry;


    //Variables_percentages

        double tr_dry_percentage = (turkey_dry / world_dry) * 100;
        double tr_water_percentage = (turkey_water / world_water) * 100;


    //Answers

        System.out.println("Earth has " + world_dry_l + " km2 dry land and " + world_water_l + " km2 water.");
        System.out.println("Turkey has " + turkey_dry_l + " km2 dry land and " + turkey_water_l + " km2 water.");
        System.out.println("Turkey has " + tr_dry_percentage + " percent of the Earth's dry land.");
        System.out.println("Turkey has " + tr_water_percentage + " percent of the Earth's water.");
        

    }
}

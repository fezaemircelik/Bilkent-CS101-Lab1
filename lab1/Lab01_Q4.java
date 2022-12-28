public class Lab01_Q4 {
    public static void main(String[] args) {
        
         //Variables_double

         final long world = 510072000;
         double turkey = (world * 0.1536) / 100 ;
         final long turkey_l = (long) turkey;
         
         double turkey_water = turkey_l * 1.3 / 100;
         double turkey_dry = turkey_l - turkey_water;

         //

         System.out.println((turkey_dry / world) * 100);
         System.out.println((turkey_water / world) * 100);
    }
}

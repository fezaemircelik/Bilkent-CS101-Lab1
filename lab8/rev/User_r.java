package rev;

import java.util.Scanner;

public class User_r {
    public static int count;

    public int ID;
    public String name;
    public int age;
    public String orders;
    public int numberOfOrders;
    public String eatenFoods = "";

    public String allergicIngredient;
    public Food_r allergicFood;
    public Scanner in = new Scanner(System.in);

    public String getAllergicIgredient(){
        return allergicIngredient;
    }
    public void setAllergicIngredient(String x){
        allergicIngredient = x;
    }

    public Food_r getallergicFood_r(){
        return allergicFood;
    }
    public boolean setAllergicFood(Food_r food){
        if (food.doesContain(allergicIngredient)){
            allergicFood = food;
            return true;
        }
        else{
            System.out.println(food.getName() + " doesn't contain " + allergicIngredient + ", " + getName() + " is not allergic to " + food.getName() + ".");
            return false;
        }
    }

    public User_r(String Name, int Age){
        addUser();
        setID(count);
        setName(Name);
        setAge(Age);
    }

    public void addUser(){
        count++;
    }

    public boolean equals(User_r x){
        if (getID() == x.getID() && getName().equalsIgnoreCase(x.getName()) && getAge() == x.getAge()){
            return true;
        }
        else{
            return false;
        }
    }


    public String pickOrderbyIndex(int index){
        orders.charAt(index);

        if (Character.toString(orders.charAt(index)).equalsIgnoreCase("-")){
            return "wrong index";
        }
        else {
            return Character.toString(orders.charAt(index));
        }
    }

    public void addNewOrder(Order_r order){
        int a = order.getID();
        orders += "-" + Integer.toString(a);
        setNumberOfOrders(getNumberOfOrders() + 1);
        eatenFoods += "-" + order.getFoodName();

        System.out.println("Adding a new order of " + order.getFoodName() + " to " + getName() + "...");
        if (order.getFoodName().equalsIgnoreCase(allergicFood.getName())){
            System.out.println(getName() + " is allergic to " + order.getFoodName() + "! Does " + getName() + " want to continue ordering?");
            String input = in.next();
            if(input.equalsIgnoreCase("y")){
                System.out.println("Proceeding with the order... and CALLING THE AMBULANCE!");
            }
            if(input.equalsIgnoreCase("n")){
                System.out.println("Order is cancelled.");
                order.cancelOrder();
            }
        }

        order.setasd(1);
        
    }


    public int getID(){
        return ID;
    }
    public void setID(int x){
        ID = x;
    }

    public String getName(){
        return name;
    }
    public void setName(String x){
        name = x;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int x){
        age = x;
    }

    public String getOrder(){
        return orders;
    }
    public void setOrder(String x){
        orders = x;
    }

    public int getNumberOfOrders(){
        return numberOfOrders;
    }
    public void setNumberOfOrders(int x){
        numberOfOrders = x;
    }
    
    public String toString(){
        String output = "";
        output += "User ID: " + getID() + ", ";
        output += "User Name: " + getName() + ", ";
        output += "Age: " + getAge();
        
        return output;
    }
    
}

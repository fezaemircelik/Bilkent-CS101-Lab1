package rev;

public class Order_r {
    public static int count;
    
    public int ID;
    public Food_r orderedFod;
    public double portion;
    public double totalPrice;

    public double price;
    public String nameOfFood;
    public int asd = 0;

    public void cancelOrder(){
        setTotalPrice(0.0);
        setPortion(0.0);
        setID(-1);
    }

    public void setasd(int x){
        asd = x;
    }

    public Food_r getFood_r(){
        return orderedFod;
    }
    public void setFood_r(Food_r x){
        orderedFod = x;
    }

    public Order_r(double Portion, String Name, double Price){
        addOrder();
        setPortion(Portion);
        setID(count);
        setPrice(Price);
        totalPrice = 0.0;
        setFoodName(Name);
    }

    public Order_r(double Portion, Food_r OrderedFood){
        addOrder();
        setPortion(Portion);
        setID(count);
        setPrice(OrderedFood.getPrice());
        totalPrice = 0.0;
        setFoodName(OrderedFood.getName());
        setFood_r(orderedFod);
    }

    public String getFoodName(){
        return nameOfFood;
    }
    public void setFoodName(String x){
        nameOfFood = x;
    }

    public void addOrder(){
        count++;
    }

    public boolean equals(Order_r order){
        if (getID() == order.getID()){
            return true;
        }
        else{
            return false;
        }
    }

    public void checkout(){
        totalPrice = getPortion() * getPrice();
    }
    public double getTotalPrice(){
        return totalPrice;
    }
    public void setTotalPrice(double x){
        totalPrice = x;
    }

    public void increasePortion(int x){
        setPortion(getPortion() +  x);
    }

    public int getID(){
        return ID;
    }
    public void setID(int x){
        ID = x;
    }

    public double getPortion(){
        return portion;
    }
    public void setPortion(double x){
        portion = x;
    }

    public double getPrice(){
        return price;
    }
    public void setPrice(double x){
        price = x;
    }

    public String toString(){
        String output = "";
        if (asd == 0){
            output += "*************************** \n";
            output += ">> Warning: This order is incomplete. \n";
        }
        output += "Details for Order " + getID() +": \n";
        output += "        " + getFoodName() + "(x " + getPortion() + ") \n";
        output += "        " + "TOTAL = " + getTotalPrice() +"\n";

        return output;
    }

}

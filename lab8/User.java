public class User {
    public static int count;

    public int ID;
    public String name;
    public int age;
    public String orders;
    public int numberOfOrders;
    public String eatenFoods = "";

    public User(String Name, int Age){
        addUser();
        setID(count);
        setName(Name);
        setAge(Age);
    }

    public void addUser(){
        count++;
    }

    public boolean equals(User x){
        if (getID() == x.getID() && getName().equalsIgnoreCase(x.getName()) && getAge() == x.getAge()){
            return true;
        }
        else{
            return false;
        }
    }


    public String pickOrderbyIndex(int index){
        int length = orders.length();
        if (index <= length && index % 2 != 1){
            return Character.toString(orders.charAt(index));
        }
        else {
            return "wrong index";
        }
    }

    public void addNewOrder(Order order){
        int a = order.getID();
        orders += "-" + Integer.toString(a);
        setNumberOfOrders(getNumberOfOrders() + 1);
        eatenFoods += "-" + order.getFoodName();
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

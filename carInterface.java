interface Brake{
    void applybrake();
}
class BMW implements Brake{
    public void applybrake(){
        System.out.println("BMW brake applied");
    }
    
}
class MERCEDES implements Brake{
    public void applybrake(){
        System.out.println("MERCEDES brake applied");
    }
    
}
class carInterface{
    public static void main(String[] args) {
        Brake b1= new BMW();
        Brake b2= new MERCEDES();
        b1.applybrake();
        b2.applybrake();
    }
}
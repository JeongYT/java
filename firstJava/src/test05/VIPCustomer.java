package test05;

public class VIPCustomer extends Customer{
    private int agentID;
    double salesRatio;

    public VIPCustomer() {

    }
    public VIPCustomer(int customerId, String customerName, int agentID){
        super(customerId,customerName);
        customerGrade="VIP";
        salesRatio=0.05;
        bonusRatio=0.1;
        this.agentID=agentID;
        System.out.println("VIPCustomer() 생성자 호출");
    }

    public int getAgentID(){
        return agentID;
    }

    @Override
    public String showCustomerInfo() {
        return super.showCustomerInfo() + " 상담원 아이디는 " + getAgentID();
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price*bonusRatio;
        return price - (int)(price*salesRatio);
    }
}

package paramconst;

public class Computer {
	
static int count=0;
private String cname;
private int cyear;
private double ccost;

public Computer()
{
	count++;
}
public String getCname() {
	return cname;
}

public void setCname(String cname) {
	this.cname=cname;
}

public int getCyear() {
	return cyear;
}

public void setCyear(int cyear) {
	this.cyear = cyear;
}

public double getCcost() {
	return ccost;
}

public void setCcost(double ccost) {
	this.ccost = ccost;
}
public static void totalComputer()
{
System.out.println("total numbers of computers :" + count);
}
}
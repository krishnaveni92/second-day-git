package org.company;

public class CompanyInfo {
	public void companyName()
	{
		System.out.println("Bank Of America");
	}
	public void companyId()
	{
		System.out.println("1234");
	}
	public void companyAddress()
	{
		System.out.println("Chennai");
	}
	public static void main(String[] args) {
		CompanyInfo c=new CompanyInfo();
		c.companyName();
		c.companyId();
		c.companyAddress();
	}
}

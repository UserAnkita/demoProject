package jbpm.model;

public class BankCustomer {
	private java.lang.Integer age;
	   private java.lang.String name;

	   private java.lang.Boolean isActiveProcess;

	   public BankCustomer()
	   {
	   }

	   public java.lang.Integer getAge()
	   {
	      return this.age;
	   }

	   public void setAge(java.lang.Integer age)
	   {
	      this.age = age;
	   }

	   public java.lang.String getName()
	   {
	      return this.name;
	   }

	   public void setName(java.lang.String name)
	   {
	      this.name = name;
	   }

	   public java.lang.Boolean getIsActiveProcess()
	   {
	      return this.isActiveProcess;
	   }

	   public void setIsActiveProcess(java.lang.Boolean isActiveProcess)
	   {
	      this.isActiveProcess = isActiveProcess;
	   }

	   public BankCustomer(java.lang.Integer age, java.lang.String name,
	         java.lang.Boolean isActiveProcess)
	   {
	      this.age = age;
	      this.name = name;
	      this.isActiveProcess = isActiveProcess;
	   }

}

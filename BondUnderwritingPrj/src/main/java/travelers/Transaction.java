package travelers;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Transaction implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private int transactionid;
   private int commissionamount;
   private int commissionrate;
   private int specialcommission;

   public Transaction()
   {
   }

   public int getTransactionid()
   {
      return this.transactionid;
   }

   public void setTransactionid(int transactionid)
   {
      this.transactionid = transactionid;
   }

   public int getCommissionamount()
   {
      return this.commissionamount;
   }

   public void setCommissionamount(int commissionamount)
   {
      this.commissionamount = commissionamount;
   }

   public int getCommissionrate()
   {
      return this.commissionrate;
   }

   public void setCommissionrate(int commissionrate)
   {
      this.commissionrate = commissionrate;
   }

   public int getSpecialcommission()
   {
      return this.specialcommission;
   }

   public void setSpecialcommission(int specialcommission)
   {
      this.specialcommission = specialcommission;
   }

   public Transaction(int transactionid, int commissionamount,
         int commissionrate, int specialcommission)
   {
      this.transactionid = transactionid;
      this.commissionamount = commissionamount;
      this.commissionrate = commissionrate;
      this.specialcommission = specialcommission;
   }

}
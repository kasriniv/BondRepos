package travelers;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class NewBondEligible implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private int policynumber;
   private java.lang.Boolean eligible;
   private java.lang.String reason;

   public NewBondEligible()
   {
   }

   public int getPolicynumber()
   {
      return this.policynumber;
   }

   public void setPolicynumber(int policynumber)
   {
      this.policynumber = policynumber;
   }

   public java.lang.Boolean getEligible()
   {
      return this.eligible;
   }

   public void setEligible(java.lang.Boolean eligible)
   {
      this.eligible = eligible;
   }

   public java.lang.String getReason()
   {
      return this.reason;
   }

   public void setReason(java.lang.String reason)
   {
      this.reason = reason;
   }

   public NewBondEligible(int policynumber, java.lang.Boolean eligible,
         java.lang.String reason)
   {
      this.policynumber = policynumber;
      this.eligible = eligible;
      this.reason = reason;
   }

}
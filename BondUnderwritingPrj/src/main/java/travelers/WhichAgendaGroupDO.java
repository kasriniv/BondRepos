package travelers;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class WhichAgendaGroupDO implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.String agendaGroupName;
   private int transactionid;

   public WhichAgendaGroupDO()
   {
   }

   public java.lang.String getAgendaGroupName()
   {
      return this.agendaGroupName;
   }

   public void setAgendaGroupName(java.lang.String agendaGroupName)
   {
      this.agendaGroupName = agendaGroupName;
   }

   public int getTransactionid()
   {
      return this.transactionid;
   }

   public void setTransactionid(int transactionid)
   {
      this.transactionid = transactionid;
   }

   public WhichAgendaGroupDO(java.lang.String agendaGroupName,
         int transactionid)
   {
      this.agendaGroupName = agendaGroupName;
      this.transactionid = transactionid;
   }

}
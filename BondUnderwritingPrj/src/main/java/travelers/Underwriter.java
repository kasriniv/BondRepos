package travelers;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Underwriter implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.String name;
   private java.lang.String status;
   private java.lang.String type;

   public Underwriter()
   {
   }

   public java.lang.String getName()
   {
      return this.name;
   }

   public void setName(java.lang.String name)
   {
      this.name = name;
   }

   public java.lang.String getStatus()
   {
      return this.status;
   }

   public void setStatus(java.lang.String status)
   {
      this.status = status;
   }

   public java.lang.String getType()
   {
      return this.type;
   }

   public void setType(java.lang.String type)
   {
      this.type = type;
   }

   public Underwriter(java.lang.String name, java.lang.String status,
         java.lang.String type)
   {
      this.name = name;
      this.status = status;
      this.type = type;
   }

}
public class Hello 
{
	private String name = "";

   public String getName() 
   {
      return name;
   }

   public String getMessage() 
   {
      if (name == "") 
      {
         return "Hello!";
      }
      else 
      {
         return "Hello " + name + "!";
      }
   }

   public void setName(String name) 
   {
      this.name = name;
   }
   
   public static void main (String[]args){
		Hello hel = new Hello();
		hel.setName("Herna");
		System.out.println(hel.getName());
		System.out.println(hel.getMessage());
		
	}
		
}
public class DebugPlay
{
   private String title;
   protected String author;

   public DebugPlay(String title, String author)
   {
      title = title;
      author = author;
   }
   public void display()
   {
      System.out.println("The performance is " + title +
        " by " + author);
   }
}
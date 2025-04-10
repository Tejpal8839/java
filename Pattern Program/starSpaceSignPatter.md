// If we have to build only star

public static void printPattern(int n)
{
    int star=    ; 
   for(int i=1;i<=n;i++)     // This row for the number of rows 
   {
       for(int j=1;j<=star;j++)
           System.out.print("* ");
           
    
       System.out.println();
   }
}

// If we have to space and star

public static void printPattern(int n)
{
    int star=    ; int space=    ;
   for(int i=1;i<=n;i++)     // This row for the number of rows 
   {
       for(int j=1;j<=space;j++)
           System.out.print("  ");
       for(int j=1;j<=star;j++)
           System.out.print("* ");
           
    
       System.out.println();
   }
}
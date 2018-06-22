import java.util.Scanner;
public class Rectangle 
{
public static void main(String[] args)
{
int height;
int width;
Scanner keyboard = new Scanner(System.in); 
System.out.println("Please enter the height of the rectangle.");
height = keyboard.nextInt();
if (height < 0)
{
    height = 1;
}
System.out.println("Please enter the width of the rectangle.");
width = keyboard.nextInt();
if(width < 0)
{
    width = 1;
}

for(int h = 0; h < height; h++) 
{ 
    for(int w = 0; w < width; w++) 
    { 
        System.out.print("*"); 
    } 
    System.out.println(" "); 
} 
}
}

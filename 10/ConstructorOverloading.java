class Rectangle 
{ 
      int length ; 
      int breadth ; 
              
         Rectangle(int side) 
         { 
            System.out.println("Constructor with One Parameter Called"); 
            length = breadth = side ; 
         } 
         Rectangle(int l,int b) 
         { 
            System.out.println("Constructor with Two Parameters Called"); 
            length = l ; 
            breadth = b ; 
         } 
         int area() 
         { 
           return (length * breadth) ; 
         } 
} 
       class ConstructorOverloading 
{ 
               public static void main(String[] args) 
          { 
              
                Rectangle r2 = new Rectangle(5); //const with l parameter called 
                Rectangle r3 = new Rectangle(7,8); //const.with2 parameter called 
               
                System.out. println("Area of Square is : "+ r2.area( )); 
                System.out.println("Area of Second Rectangle is : "+ r3.area( )); 
          } 
}         
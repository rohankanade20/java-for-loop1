class demo{
    static int x =20;
    int y =10;
    static{
        System.out.println("in static block");

    }
    {
        System.out.println("in instance block");
        System.out.println(x);
        System.out.println(y);
    }
    public static void main(String[] args) {
            demo obj = new demo();
            System.out.println(obj.x);
            
            System.out.println(obj.y);
        


    }
    class demo2{
        public static void main(String[] args) {
            demo obj = new demo();
            System.out.println(obj.x);
            
            System.out.println(obj.y);
        }
            
        }
    }


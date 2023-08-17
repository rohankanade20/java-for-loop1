class Que10{
    public static void main(String[] args) {
        char ch ='A';
        int n = 1;
        for(int i=0;i<=13;i++){
           
            for(int j=0;j<=11;j++){
                  if(i%3==0){
                
                System.out.print("* ");
                }if(i%3==1){
                    System.out.print(ch++ +" ");

                }if(i%3==2){
                    System.out.print(n++ +" ");
                }
            }
           
            System.out.println(" ");
        }
        
    }

}

    


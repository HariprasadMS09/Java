package Control_statements.Patterns;

class solidRectangle{
    public static void main(String args[]){
        int r=4, c=5;
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}